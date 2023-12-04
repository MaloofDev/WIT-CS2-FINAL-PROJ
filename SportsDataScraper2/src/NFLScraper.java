import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class NFLScraper {
	//int used to decide between offense (1) and defense anything else

	public static NFLStats[] scrape()
	{
		String url = "https://www.espn.com/nfl/stats/team";

		NFLStats[] rosterstats = new NFLStats[32];
		TestGrab teams = new TestGrab();
		String[] name = new String[30];
		try {
			name = teams.TeamGrab(url, 32, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
		{
			
			final Document doc = Jsoup.connect(url).get();
			
			int k = 0;

			for (Element row : doc.select("tbody.Table__TBODY tr")) {

				if (row.select("td:nth-of-type(3)").text().equals("")) {
					continue; // Skip rows with empty data
				} else {
					float[] stats = extractStats(row); // Extract team stats

					rosterstats[k] = new NFLStats(name[k], stats);
					k++;
				}
			
		}
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
		return rosterstats;
	}
		public static float[] extractStats(Element row) 
		{
			float[] stats = new float[9];
			for (int i = 1; i <= 9; i++) {
				String nthtype = "td:nth-of-type(" + i + ")";
				String data = row.select(nthtype).text();
				data = data.replaceAll(",", "");
				data = data.replaceAll(" ", "");
				stats[i - 1] = (float) Double.parseDouble(data);
			}
			return stats;
		}
		
		public static void main(String[] args) 
		{
		NFLStats[] teams = scrape();

		// Define the file path where you want to save the results
		String filePath = "./src/NFLOutput.txt"; // Update
																											// with your
																											// desired
																											// file path

		try {
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));

			if (teams[0] != null) {
				// Print the table header
				writer.printf(
						"%-24s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s%n",
						"Team", "GP", "Total YDS", "Total YDS/G", "Pass YDS", "Pass YDS/G", "Rush YDS", "Rush YDS/G", "PTS", "PTS/G");
				for (NFLStats team : teams) {
					writer.printf(
							"%-24s %-8.0f %-10.0f %-10.1f %-10.0f %-10.1f %-8.0f %-8.1f %-10.0f %-10.1f%n",
							team.getName(), team.getGP(), team.getTYDS(), team.getTYDSPG(), team.getPYDS(), team.getPYDSPG(),
							team.getRYDS(), team.getRYDSPG(), team.getPTS(), team.getPTSPG());
				}
			}

			writer.close();
			System.out.println("Results have been written to the file: " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
}
