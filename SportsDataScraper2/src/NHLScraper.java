import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class NHLScraper {
	public static NHLStats[] scrape(int i)
	{
		String url;
		if(i==1) {
		  url = "https://www.espn.com/nhl/stats/team";
		}
		else /*if(i==2)*/ {
			  url = "https://www.espn.com/nhl/stats/team/_/view/goaltending";

		}
		/*else {
			  url = "https://www.espn.com/nhl/stats/team/_/view/special";

		}*/
		NHLStats[] rosterstats = new NHLStats[32];
		
		try 
		{
			
			final Document doc = Jsoup.connect(url).get();
			
			int k = 0;

			for (Element row : doc.select("tbody.Table__TBODY tr")) {

				String name = "NA"; // Extract team name

				if (row.select("td:nth-of-type(3)").text().equals("")) {
					continue; // Skip rows with empty data
				} else {
					float[] stats = extractStats(i,row); // Extract team stats

					rosterstats[k] = new NHLStats(i,name, stats);
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
		public static float[] extractStats(int type,Element row) 
		{
			float[] stats;
			if(type==1) {
			 stats = new float[14];
			for (int i = 1; i <= 14; i++) {
				String nthtype = "td:nth-of-type(" + i + ")";
				String data = row.select(nthtype).text();
				data = data.replaceAll(",", "");
				data = data.replaceAll(" ", "");
				stats[i - 1] = (float) Double.parseDouble(data);
			}
			}
			else {
				 stats = new float[13];
				for (int i = 1; i <= 13; i++) {
					String nthtype = "td:nth-of-type(" + i + ")";
					String data = row.select(nthtype).text();
					data = data.replaceAll(",", "");
					data = data.replaceAll(" ", "");
					stats[i - 1] = (float) Double.parseDouble(data);
				}
			}
			return stats;
		}
		
		public static void main(String[] args) 
		{
			NHLStats[] teams = scrape(2);
			System.out.println(teams[1].getSOSP());
			
			//System.out.println(teams[1].getGP());
			//System.out.println(teams[9].getOPS());
			

		}
}
