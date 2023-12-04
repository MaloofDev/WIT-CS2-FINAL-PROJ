import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NBAStandings_xXWPCT {
	
	
	private static float[] extractStats(Element row) {
		float[] standings = new float[6];
		ExpectedWinPercentage NBAxPCT= new ExpectedWinPercentage();
		float W = Float.parseFloat(row.select("td:nth-of-type(1)").text());
		standings[0] = W;
		float L = Float.parseFloat(row.select("td:nth-of-type(2)").text());
		standings[1] = L;		
		float PF = Float.parseFloat(row.select("td:nth-of-type(9)").text());
		standings[2] = PF * (W + L);
		float PA = Float.parseFloat(row.select("td:nth-of-type(10)").text());
		standings[3] = PA * (W + L);
		float PCT = Float.parseFloat(row.select("td:nth-of-type(3)").text());
		standings[4] = PCT;
		float xPCT = NBAxPCT.calculateExpectedWinPercentage(PF, PA);
		standings[5] = xPCT;
		return standings;
	}
	public static NBAStandings[] Scrape() {
		final String url = "https://www.espn.com/nba/standings/_/group/league";
		NBAStandings[] standings = new NBAStandings[30];
		TestGrab teams = new TestGrab();
		String[] name = new String[30];
		try {
			name = teams.TeamGrab(url, 30, false);
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

					standings[k] = new NBAStandings(name[k], stats);
					k++;
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return standings;
	}

	public static void main(String[] args) {
		NBAStandings[] teams = Scrape();
		String filePath = "./src/nba-standings.txt"; 
																											// with your
																											// desired
																											// file path

		try {
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));

			if (teams[0] != null) {
				writer.printf(
						"%-24s %-8s %-8s %-8s %-8s %-8s %-8s%n",
						"Team", "W", "L", "PF", "PA", "PCT", "xPCT");
				for (NBAStandings team : teams) {
					writer.printf(
							"%-24s %-8.0f %-8.0f %-8.0f %-8.0f %-8.3f %-8.3f%n",
							team.getTeam(), team.getW(), team.getL(), team.getPF(), team.getPA(), team.getPCT(),  team.getxPCT());
				}
			}

			writer.close();
			System.out.println("Results have been written to the file: " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
