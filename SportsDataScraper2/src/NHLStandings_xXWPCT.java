import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NHLStandings_xXWPCT {

	
	private static float[] extractStats(Element row) {
		float[] standings = new float[6];
		ExpectedWinPercentage NHLxPCT= new ExpectedWinPercentage();
		float W = Float.parseFloat(row.select("td:nth-of-type(2)").text());
		standings[0] = W;
		float L = Float.parseFloat(row.select("td:nth-of-type(3)").text());
		float OTL = Float.parseFloat(row.select("td:nth-of-type(4)").text());
		standings[1] = L + OTL;		
		float GF = Float.parseFloat(row.select("td:nth-of-type(12)").text());
		standings[2] = GF;
		float GA = Float.parseFloat(row.select("td:nth-of-type(13)").text());
		standings[3] = GA;
		float PCT = W / (W + L + OTL);
		standings[4] = PCT;
		float xPCT = NHLxPCT.calculateExpectedWinPercentage(GF, GA);
		standings[5] = xPCT;
		return standings;
	}
	public static NHLStandings[] Scrape() {
		final String url = "https://www.espn.com/nhl/standings/_/group/league";
		NHLStandings[] standings = new NHLStandings[32];
		TestGrab teams = new TestGrab();
		String[] name = new String[32];
		try {
			name = teams.TeamGrab(url, 32, false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			final Document doc = Jsoup.connect(url).get();
			int k = 0;

			for (Element row : doc.select("tbody.Table__TBODY tr")) {

				if (row.select("td:nth-of-type(3)").text().equals("")) {
					continue; // Skip rows with empty data
				} else {
					float[] stats = extractStats(row); // Extract team stats

					standings[k] = new NHLStandings(name[k], stats);
					k++;
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return standings;
	}

	public static void main(String[] args) {
		NHLStandings[] teams = Scrape();
		String filePath = "./src/nhl-standings.txt"; 
																											// with your
																											// desired
																											// file path

		try {
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));

			if (teams[0] != null) {
				writer.printf(
						"%-22s %-8s %-8s %-8s %-8s %-8s %-8s%n",
						"Team", "W", "L", "GF", "GA", "PCT", "xPCT");
				for (NHLStandings team : teams) {
					writer.printf(
							"%-22s %-8.0f %-8.0f %-8.0f %-8.0f %-8.3f %-8.3f%n",
							team.getTeam(), team.getW(), team.getL(), team.getGF(), team.getGA(), team.getPCT(),  team.getxPCT());
				}
			}

			writer.close();
			System.out.println("Results have been written to the file: " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
