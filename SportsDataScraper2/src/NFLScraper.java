import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class NFLScraper {
	public static NFLStats[] scrape()
	{
		final String url = "https://www.espn.com/nfl/stats/team";
		NFLStats[] rosterstats = new NFLStats[32];
		
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

					rosterstats[k] = new NFLStats(name, stats);
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
			NFLStats[] teams = scrape();
			
			System.out.println(teams[1].getGP());
			//System.out.println(teams[9].getOPS());
			

		}
}
=======
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class NFLScraper {
	//int used to decide between offense (1) and defense anything else

	public static NFLStats[] scrape(int i)
	{
		String url;
		if(i==1) {
		  url = "https://www.espn.com/nfl/stats/team";
		}
		else /*if(i==2)*/ {
			  url = "https://www.espn.com/nfl/stats/team/_/view/defense";

		}
		/*else {
			  url = "https://www.espn.com/nfl/stats/team/_/view/special";

		}*/
		NFLStats[] rosterstats = new NFLStats[32];
		
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

					rosterstats[k] = new NFLStats(name, stats);
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
			NFLStats[] teams = scrape(1);
			System.out.println(teams[0].getPTSPG());
			
			//System.out.println(teams[1].getGP());
			//System.out.println(teams[9].getOPS());
			

		}
}
