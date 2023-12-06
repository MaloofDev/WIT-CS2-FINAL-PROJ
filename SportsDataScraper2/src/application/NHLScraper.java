package application;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
		TestGrab teams = new TestGrab();
		String[] name = new String[32];
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
					float[] stats = extractStats(i,row); // Extract team stats

					rosterstats[k] = new NHLStats(i,name[k], stats);
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
				stats[i - 1] = Float.parseFloat(data);
			}
			}
			else {
				 stats = new float[13];
				for (int i = 1; i <= 13; i++) {
					String nthtype = "td:nth-of-type(" + i + ")";
					String data = row.select(nthtype).text();
					data = data.replaceAll(",", "");
					data = data.replaceAll(" ", "");
					stats[i - 1] = Float.parseFloat(data);
				}
			}
			return stats;
		}
		
		public static void main(String[] args) 
		{
			NHLStats[] teams1 = scrape(1);
			NHLStats[] teams2 = scrape(2);
			// Define the file path where you want to save the results
			String filePath = "./src/NHLOutput.txt"; // Update
																												// with your
																												// desired
																												// file path

			try {
				PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));

				if (teams1[0] != null) {
					// Print the table header
					writer.printf(
							"%-24s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s%n",
							"Team", "GP", "GFPG", "A", "PTS", "PPG", "PP%", "SHG", "S", "S%", "PIM", "PK%", "SOA", "SOG", "SO%");
					for (NHLStats team : teams1) {
						writer.printf(
								"%-24s %-8.0f %-8.1f %-8.0f %-8.0f %-8.0f %-8.1f %-8.0f %-8.0f %-8.1f %-8.0f %-8.1f %-8.0f %-8.0f %-8.1f%n",
								team.getName(), team.getGP(), team.getGFPG(), team.getA(), team.getPTS(), team.getPPG(),
								team.getPPP(), team.getSHG(), team.getS(), team.getSP(), team.getPIM(), team.getPKP(), team.getSOA(), team.getSOG(), team.getSOP());
					}
				}

				writer.close();
				System.out.println("Results have been written to the file: " + filePath);
			} catch (IOException e) {
				e.printStackTrace();
			}		// Define the file path where you want to save the results
			String filePath2 = "./src/NHLGoalieOutput.txt"; // Update
			// with your
			// desired
			// file path

			try {
				PrintWriter writer2 = new PrintWriter(new BufferedWriter(new FileWriter(filePath2)));

				if (teams2[0] != null) {
					// Print the table header
					writer2.printf(
							"%-24s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s%n",
							"Team", "GP", "GAPG","W","L","OTL","SA","GA","SV%","SO","SOSA","SOS","SOS%");
					for (NHLStats team : teams2) {
						writer2.printf(
								"%-24s %-8.0f %-8.2f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.3f %-8.0f %-8.0f %-8.0f %-8.3f%n",
								team.getName(), team.getGP(), team.getGAPG(), team.getW(), team.getL(), team.getOTL(),
								team.getSA(), team.getGA(), team.getSVP(), team.getSO(), team.getSOSA(), team.getSOS(), team.getSOSP());
					}
				}

				writer2.close();
				System.out.println("Results have been written to the file: " + filePath2);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
