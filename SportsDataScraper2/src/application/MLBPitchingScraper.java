package application;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MLBPitchingScraper {
	
	public static MLBPitchingStats[] Scrape() {
		final String url = "https://www.espn.com/mlb/stats/team/_/view/pitching";
		MLBPitchingStats[] rosterstats = new MLBPitchingStats[30];
		TestGrab teams = new TestGrab();
		String[] name = new String[30];
		try {
			name = teams.TeamGrab(url, 30, true);
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

					rosterstats[k] = new MLBPitchingStats(name[k], stats);
					k++;
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rosterstats;
	}

	private static float[] extractStats(Element row) {
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
	public static void main(String[] args) {
		MLBPitchingStats[] teams = Scrape();

		// Define the file path where you want to save the results
		String filePath = "./src/MLBPitchingOutput.txt"; // Update
																											// with your
																											// desired
																											// file path

		try {
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));

			if (teams[0] != null) {
				// Print the table header
				writer.printf(
						"%-22s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s%n",
						"Team", "GP", "W", "L", "ERA", "SV", "CG", "SHO", "QS", "IP", "H", "ER", "HR", "BB",
						"SO", "OBA", "WHIP");
				for (MLBPitchingStats team : teams) {
					writer.printf(
							"%-22s %-8.0f %-8.0f %-8.0f %-8.2f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.0f %-8.3f %-8.2f%n",
							team.getName(), team.getGP(), team.getW(), team.getL(), team.getERA(), team.getSV(),
							team.getCG(), team.getSHO(), team.getQS(), team.getIP(), team.getH(), team.getER(),
							team.getHR(), team.getBB(), team.getSO(), team.getOBA(), team.getWHIP());
				}
			}

			writer.close();
			System.out.println("Results have been written to the file: " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
