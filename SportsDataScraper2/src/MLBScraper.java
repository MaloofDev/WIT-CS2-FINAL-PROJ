import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MLBScraper
{
	
	public static MLBStats[] scrape()
	{
		final String url = "https://www.espn.com/mlb/stats/team";
		MLBStats[] rosterstats = new MLBStats[30];
		TestGrab teams = new TestGrab();
		String[] name = new String[30];
		try {
			name = teams.TeamGrab(url, 30);
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

					rosterstats[k] = new MLBStats(name[k], stats);
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
			float[] stats = new float[16];
			for (int i = 1; i <= 16; i++) {
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
			MLBStats[] teams = scrape();


			// Define the file path where you want to save the results
			String filePath = "./src/MLBOffenseOutput.txt"; // Update
																												// with your
																												// desired
																												// file path

			try {
				PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));

				if (teams[0] != null) {
					// Print the table header
					writer.printf(
							"%-22s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s%n",
							"Team", "GP", "AB", "R", "H", "2B", "3B", "HR", "RBI", "TB", "BB", "SO", "SB", "AVG", "OBP", "SLG", "OPS");
					for (MLBStats team : teams) {
						writer.printf(
								"%-22s %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.3f %-8.3f %-8.3f %-8.3f%n",
								team.getName(), team.getGP(), team.getAB(), team.getR(), team.getH(), team.getDBL(),
								team.getTRPL(), team.getHR(), team.getRBI(), team.getTB(), team.getBB(), team.getSO(),
								team.getSB(), team.getAVG(), team.getOBP(), team.getSLG(), team.getOPS());
					}
				}

				writer.close();
				System.out.println("Results have been written to the file: " + filePath);
			} catch (IOException e) {
				e.printStackTrace();
			}


			

		}
}
