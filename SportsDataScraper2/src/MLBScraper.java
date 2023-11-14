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
		
		try 
		{
			final Document doc = Jsoup.connect(url).get();
			
			int k = 0;

			for (Element row : doc.select("tbody.Table__TBODY tr")) {

				String name = "NA"; // Extract team name

				if (row.select("td:nth-of-type(3)").text().equals("")) {
					continue; // Skip rows with empty data
				} else {
					float[] stats = extractStats(row); // Extract team stats

					rosterstats[k] = new MLBStats(name, stats);
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
			
			System.out.println(teams[1].getGP());
			System.out.println(teams[9].getOPS());
			

		}
}
