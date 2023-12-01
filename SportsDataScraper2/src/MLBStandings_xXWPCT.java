import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MLBStandings_xXWPCT {
	
	private static String extractTeamName(Element row) {
		Element anchorElement = row.select("td > div > div > a").last();
		if (anchorElement != null) {
			return anchorElement.text();
		} else {
			return null;
		}
	}
	
	private static float[] extractStats(Element row) {
		float[] standings = new float[6];
		ExpectedWinPercentage MLBxPCT= new ExpectedWinPercentage();
		float W = Float.parseFloat(row.select("td:nth-of-type(1)").text());
		standings[0] = W;
		float L = Float.parseFloat(row.select("td:nth-of-type(2)").text());
		standings[1] = L;		
		float PCT = Float.parseFloat(row.select("td:nth-of-type(3)").text());
		standings[4] = PCT;
		float RS = Float.parseFloat(row.select("td:nth-of-type(7)").text());
		standings[2] = RS;
		float RA = Float.parseFloat(row.select("td:nth-of-type(8)").text());
		standings[3] = RA;
		float xPCT = MLBxPCT.calculateExpectedWinPercentage(RS, RA);
		standings[5] = xPCT;
		return standings;
	}
	public static MLBStandings[] Scrape() {
		final String url = "https://www.espn.com/mlb/standings/_/group/overall";
		MLBStandings[] standings = new MLBStandings[30];

		try {
			final Document doc = Jsoup.connect(url).get();
			int k = 0;

			for (Element row : doc.select("tbody.Table__TBODY tr")) {

				String name = extractTeamName(row); // Extract team name

				if (row.select("td:nth-of-type(3)").text().equals("")) {
					continue; // Skip rows with empty data
				} else {
					float[] stats = extractStats(row); // Extract team stats

					standings[k] = new MLBStandings(name, stats);
					k++;
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return standings;
	}

	public static void main(String[] args) {
		MLBStandings[] teams = Scrape();
		String filePath = "./src/mlb-standings.txt"; 
																											// with your
																											// desired
																											// file path

		try {
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));

			if (teams[0] != null) {
				writer.printf(
						"%-20s %-8s %-8s %-8s %-8s %-8s %-8s%n",
						"Team", "W", "L", "RS", "RA", "PCT", "xPCT");
				for (MLBStandings team : teams) {
					writer.printf(
							"%-20s %-8.0f %-8.0f %-8.0f %-8.0f %-8.3f %-8.3f%n",
							team.getTeam(), team.getW(), team.getL(), team.getPCT(), team.getRS(), team.getRA(), team.getxPCT());
				}
			}

			writer.close();
			System.out.println("Results have been written to the file: " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
