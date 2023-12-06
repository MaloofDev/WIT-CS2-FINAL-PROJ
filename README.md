Final Project

Professional Sports Data Scraper


Devon Lapierre, Tyger Maguire, Kaleb Maloof

COMP1050-07

Professor Gyllinsky

December 7, 2023 

Abstract

In our project, we decided to web scrape data from team statistics and team standings tables from the ESPN website and place the data we scraped into our own tables, which we were able to display with our GUI. We created classes that helped to scrape the data, place it into arrays, and scrape corresponding team names, putting this data into one large array that could be written into a file or into our GUI. We used an abstract Scraper class with the methods that would then correspond to each method implementation of the scraper class for each sport, as well as a TeamStats class that held variables, a constructor, and getter methods for each variable that were used in each leagues’ Stats classes. Additionally, we used an algorithm to compute the expected win percentage of each team of each league by using scraped values of points for and points against, and putting them into the formula: 
W/ (W+L) = W% = PF2 / (PA2 + PF2)
We were then able to write all of our scraped statistics along with our calculated expected win percentage statistic into our GUI using JavaFX and scene builder, creating a strong visual output for our data

Introduction

In our project, our goal was to scrape data from team statistics and team standings pages of the ESPN website for the four major professional sports’ leagues, the NFL, NBA, MLB, and NHL. We wanted to be able to successfully scrape selected data and write it into files of our own, which we could display to the user in a graphical user interface where the user can flip through the different data tables and sort through columns of statistics for each set of data. Additionally, with the help of Professor Barry Husowitz, we were able to implement an algorithm that calculated a prediction for the expected winning percentage of each team in each league based on points scored and points allowed (NFL and NBA), goals for and goals allowed (NHL), or runs scored and runs allowed (MLB). Our project greatly enhanced our ability to web scrape using the properties of the Jsoup library, which allowed us to parse the html of the ESPN website to get the data we required. We used abstract classes to set up data scrapers for each data table we grabbed from and were able to enter all the data we grabbed into files. These files were then used to fill in the different scenes of our GUI, applying the corresponding file to the correct tab of our GUI. We also enhanced our knowledge of using JavaFX to build a complete site with a home page, tabs for each of the leagues and the tables we created for the leagues, and buttons to sort through different columns of the data for each table we provide.

Methods and Materials

This project was completed using the java programming language in the eclipse workspace application. We first created two abstract classes, a Scraper class and a TeamStats class. The TeamStats class creates variables for each column of data from the tables in ESPN and uses a constructor taking in the team and an array of that team’s statistics and applying each statistic to its defined variable. The TeamStats class also has getter methods for each variable which return the value of the variable defined by the class’s constructor. The Scraper class consists of two abstract methods, an extractStats method and a scrape method. The extractStats method took in a row of data from the html that was scraped and entered each floating-point number from that row into an array. The scrape method allowed us to enter a URL which was used to parse data from each row of the document and used the extractStats method to enter the data from that row into an array of the TeamStats class to assign each data point to its correct variable. From this point we created web scrapers for each league by using the Scraper class and TeamStats class to extend into NFLScraper, NFLStats, NHLScraper, NHLStats, NBAWebScraper, MLBScraper, MLBStats, MLBPitchingScraper, and MLBPitchingStats. Each of these classes implements the methods of the corresponding abstract classes to grab the data from the correct URL and enter it into an array that allows each row of data to be an element within the array. Each scraper then uses a main method to call the scrape method and write the data gathered from the scrape method to a file, first writing the column headings for the data, and then using the getter methods from each league’s corresponding Stats classes to get each element from each index within the array, essentially writing each statistical value for every team into the file. The second aspect of the backend of our project was creating data tables for the standings of each league. We used the same general format for the classes for standings except for adding in a few of our own calculations in order to display the data we wanted. We first created a class ExpectedWinPercentage that contained one method calculateExpectedWinPercentage. The method took in two integers of points for and points against, and calculated an expected winning percentage based on Professor Husowitz’s provided formula:
W/ (W+L) = W% = PF2 / (PA2 + PF2)
With this formula, we created the classes NBAStandings_xXWPCT, NHLStandings_xXWPCT, NFLStandings_xXWPCT, and MLBStandings_xXWPCT, NBAStandings, NHLStandings, NFLStandings, and MLBStandings. Each of the Standings classes were set up the same way as the Stats classes, by defining variables, creating a constructor to assign each variable to an index of a provided array, and getter methods for each variable. For each Standings_xXWPCT class, an extractStats method was created but used in a different fashion. The method creates a float array and assigns specific data to each index of the array by grabbing data from a specific html location. For a few of the leagues, the actual win percentage value needed to be calculated by taking the values given for wins and losses and computing the equation W/ (W +L). This calculation would be included as an index of the created array. The final index of the array would be the calculated expected win percentage, which was found by entering the values found for points for and points against in the calculateExpectedWinPercentage method of the ExpectedWinPercentage class. A scrape method was set up the same way as for the Scraper classes, definining a URL and parsing its data by taking rows of data at a time and applying the extractStats method to that row of data. Finally, the main method of these Standings_xXWPCT classes called on the scrape method and wrote the resulting data to a file using the getter methods of the Standings classes. Finally, to grab each teams name from the tables available on ESPN we implemented a TestGrab class that held a TeamGrab method, which returned an array of team names which were grabbed from a given URL based on the html of the given table at that location.

(Add in JavaFx)

Results

Our project was successful in being able to collect all the necessary data from the ESPN website, write it to files set up as tables for it to be easily viewed, and being able to display it in our GUI with tables for each sports teams’ statistics along with their expected win percentages. Our Stats classes were correctly able to assign each variable created to an element of a passed in array and use each getter method to return the variable values. An example of this is shown below.
public class TeamStats {
    // Fields for team statistics
    private double GP, PTS, FGM, FGA, FGP, TPM, TPA, TPP, FTM, FTA, FTP, OR, DR, REB, AST, STL, BLK, TO, PF;
    // Field for the team name
    private String team;

    // Constructor to initialize the object with team name and stats
    public TeamStats(String name, double[] stats) {
        team = name;
        GP = stats[0];
        PTS = stats[1];
        FGM = stats[2];
        FGA = stats[3];
        FGP = stats[4];
        TPM = stats[5];
        TPA = stats[6];
        TPP = stats[7];
        FTM = stats[8];
        FTA = stats[9];
        FTP = stats[10];
        OR = stats[11];
        DR = stats[12];
        REB = stats[13];
        AST = stats[14];
        STL = stats[15];
        BLK = stats[16];
        TO = stats[17];
        PF = stats[18];
    }

    // Getter methods for retrieving individual statistics
    public double getGP() {
        return GP;
    }

    public double getPTS() {
        return PTS;
    }

    public double getFGM() {
        return FGM;
    }

    public double getFGA() {
        return FGA;
    }

    public double getFGP() {
        return FGP;
    }

    public double getTPM() {
        return TPM;
    }

    public double getTPA() {
        return TPA;
    }

    public double getTPP() {
        return TPP;
    }

    public double getFTM() {
        return FTM;
    }

    public double getFTA() {
        return FTA;
    }

    public double getFTP() {
        return FTP;
    }

    public double getOR() {
        return OR;
    }

    public double getDR() {
        return DR;
    }

    public double getREB() {
        return REB;
    }

    public double getAST() {
        return AST;
    }

    public double getSTL() {
        return STL;
    }

    public double getBLK() {
        return BLK;
    }

    public double getTO() {
        return TO;
    }

    public double getPF() {
        return PF;
    }

    // Getter method for retrieving the team name
    public String getName() {
        return team;
    }
}

Each scraper class was successful of implementing the extractStats method by creating an array that would consist of the floating-point values of each column in the table bodies of the ESPN tables by taking in a parameter of a row in the table and adding each value from each column of that row into an array. This is shown below.
	private static double[] extractStats(Element row) {
		double[] stats = new double[19];
		for (int i = 1; i <= 19; i++) {
			String nthtype = "td:nth-of-type(" + i + ")";
			stats[i - 1] = Double.parseDouble(row.select(nthtype).text());
		}
		return stats;
	}
The scrape method of each class was then able to use the given URL and parse through each row of the html and extract its stats and team names into a new array using the TeamGrab method from the TestGrab class and the extractStats method. The scrape method would first scrape for the team names, then using a for loop would parse through each row of data from the ESPN table. It would then grab each of the values from that row of data and place them into a new array. Then the Stats class would be called to insert everything into one array, using the team’s name from the proper index and the extractStats created array. This is shown below.
public static TeamStats[] Scrape() {
		final String url = "https://www.espn.com/nba/stats/team";
		TeamStats[] rosterstats = new TeamStats[30];
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
 // Extract team name

				if (row.select("td:nth-of-type(3)").text().equals("")) {
					continue; // Skip rows with empty data
				} else {
					double[] stats = extractStats(row); // Extract team stats

					rosterstats[k] = new TeamStats(name[k], stats);
					k++;
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rosterstats;
	}
We were essentially able to use the variations of these classes, all with the same methods but with different variables depending on the properties of the statistics for that particular sport, to be able to get all of our scraped data into one place where it could be written to a file or placed into our GUI. When writing it to a file we called the scrape method and then used PrintWriter to first write the headers of the table spaced properly, and then the values for each row of the table. The code for this can be seen below, followed by the output file.
		TeamStats[] teams = Scrape();

		// Define the file path where you want to save the results
		String filePath = "./src/output.txt"; // Update
																											// with your
																											// desired
																											// file path

		try {
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filePath)));

			if (teams[0] != null) {
				// Print the table header
				writer.printf(
						"%-24s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s %-8s%n",
						"Team", "GP", "PTS", "FGM", "FGA", "FG%", "3PM", "3PA", "3P%", "FTM", "FTA", "FT%", "OR", "DR",
						"REB", "AST", "STL", "BLK", "TO", "PF");
				for (TeamStats team : teams) {
					writer.printf(
							"%-24s %-8.0f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f %-8.1f%n",
							team.getName(), team.getGP(), team.getPTS(), team.getFGM(), team.getFGA(), team.getFGP(),
							team.getTPM(), team.getTPA(), team.getTPP(), team.getFTM(), team.getFTA(), team.getFTP(),
							team.getOR(), team.getDR(), team.getREB(), team.getAST(), team.getSTL(), team.getBLK(),
							team.getTO(), team.getPF());
				}
			}

			writer.close();
			System.out.println("Results have been written to the file: " + filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
Team                     GP       PTS      FGM      FGA      FG%      3PM      3PA      3P%      FTM      FTA      FT%      OR       DR       REB      AST      STL      BLK      TO       PF      
Indiana Pacers           17       127.9    47.8     94.8     50.4     14.9     39.5     37.8     17.4     22.1     78.7     9.8      30.1     39.8     30.1     8.1      6.3      12.6     22.7    
Atlanta Hawks            18       123.3    43.9     92.6     47.4     13.8     37.3     37.1     21.7     26.1     83.0     12.9     31.5     44.4     25.5     9.2      4.5      13.9     18.5    
Milwaukee Bucks          19       120.5    43.3     88.5     49.0     14.1     37.9     37.1     19.8     25.8     76.9     9.2      34.6     43.8     24.6     7.4      5.4      13.4     19.8    
Philadelphia 76ers       18       120.2    42.2     88.7     47.6     11.9     32.1     37.3     23.8     27.8     85.6     12.1     33.2     45.3     25.9     8.3      6.3      12.6     20.7    
Dallas Mavericks         17       119.5    42.8     91.0     47.1     15.9     42.6     37.4     17.9     24.0     74.8     10.0     32.2     42.2     24.9     5.8      4.1      11.1     18.5    
Oklahoma City Thunder    18       119.4    43.3     87.6     49.5     12.9     32.4     39.8     19.8     23.2     85.4     7.9      33.4     41.3     25.7     8.0      5.9      12.5     20.0    
Phoenix Suns             18       116.4    40.8     86.2     47.4     12.7     32.8     38.7     22.1     26.3     83.9     11.1     33.1     44.2     26.3     6.9      7.1      14.2     19.2    
Washington Wizards       18       116.3    43.9     91.2     48.2     12.0     34.3     35.0     16.4     20.8     79.1     8.4      30.6     39.0     27.9     8.1      4.8      13.4     19.5    
Boston Celtics           18       116.3    41.9     88.9     47.2     15.6     43.3     36.0     16.8     21.3     78.6     10.3     36.8     47.1     24.8     6.4      5.6      12.8     17.7    
Sacramento Kings         17       116.1    41.6     89.8     46.4     14.7     42.1     34.9     18.1     24.6     73.7     10.9     32.9     43.8     26.9     7.4      4.3      13.2     21.3    
Brooklyn Nets            18       116.0    42.9     90.9     47.2     15.3     39.4     38.9     14.9     19.2     77.5     12.1     35.6     47.7     25.8     6.2      5.4      12.8     18.6    
Golden State Warriors    19       114.9    40.5     89.4     45.3     14.6     39.6     36.8     19.3     24.6     78.4     12.9     33.8     46.7     27.9     7.3      3.5      14.7     22.2    
Denver Nuggets           19       114.2    43.9     89.5     49.1     11.8     32.1     36.8     14.5     20.4     71.1     11.5     32.9     44.4     29.4     6.9      5.1      12.2     19.1    
Orlando Magic            18       114.1    41.2     86.3     47.7     10.6     29.9     35.4     21.2     27.6     76.7     11.6     32.7     44.2     25.2     9.2      5.4      15.1     21.6    
Charlotte Hornets        17       113.6    42.8     90.7     47.2     11.4     31.0     36.6     16.6     21.5     77.3     12.2     32.4     44.5     25.4     7.0      4.8      13.9     20.2    
New Orleans Pelicans     19       113.4    41.9     88.2     47.6     11.0     30.9     35.5     18.5     24.9     74.3     10.9     33.7     44.6     26.3     8.2      4.3      13.5     20.5    
LA Clippers              18       112.9    41.2     88.1     46.8     11.7     32.1     36.5     18.8     24.4     77.0     11.2     33.4     44.7     24.6     9.3      4.6      12.9     20.8    
Los Angeles Lakers       20       112.8    41.6     84.9     48.9     10.0     29.6     33.8     19.7     25.6     77.1     8.2      35.8     43.9     26.4     7.4      6.0      14.6     17.4    
Minnesota Timberwolves   18       112.3    40.9     84.9     48.2     11.5     31.0     37.1     19.0     24.3     78.1     9.4      35.8     45.2     25.3     7.7      6.5      14.3     19.5    
Miami Heat               19       112.3    40.3     85.8     46.9     12.5     32.6     38.2     19.3     22.8     84.3     9.5      31.8     41.4     25.9     8.4      3.3      12.3     18.4    
San Antonio Spurs        18       111.8    42.1     91.5     46.0     12.7     36.7     34.6     15.0     19.0     78.9     10.2     32.3     42.5     29.3     7.1      6.1      16.2     20.3    
Utah Jazz                19       111.7    40.4     90.8     44.5     13.8     38.6     35.9     17.2     21.3     80.7     14.4     32.4     46.8     26.6     6.5      5.4      16.9     20.0    
Toronto Raptors          19       111.5    41.9     90.4     46.3     11.4     33.2     34.4     16.3     22.3     72.9     12.6     33.4     45.9     27.9     8.1      4.5      13.6     18.5    
Houston Rockets          16       110.9    41.3     87.2     47.4     12.4     34.6     35.9     15.8     20.8     76.0     9.3      34.0     43.3     26.4     6.3      4.2      12.0     22.3    
Cleveland Cavaliers      19       110.8    41.5     87.3     47.6     11.0     32.0     34.4     16.8     21.2     79.2     10.6     33.8     44.4     25.5     7.7      5.5      14.2     18.8    
New York Knicks          18       110.4    39.7     89.8     44.2     13.6     36.3     37.4     17.4     23.8     73.4     13.7     33.2     46.8     22.7     8.0      2.9      12.1     17.5    
Detroit Pistons          19       109.6    41.2     89.2     46.2     10.5     29.7     35.2     16.7     20.7     80.7     12.5     32.8     45.3     26.5     5.9      5.7      16.6     23.7    
Chicago Bulls            20       106.9    39.6     89.1     44.4     11.6     33.2     34.9     16.1     20.3     79.1     10.9     30.4     41.3     22.5     8.6      4.5      11.9     19.8    
Memphis Grizzlies        17       105.6    38.7     90.7     42.7     13.1     39.9     32.7     15.1     19.6     76.9     10.8     31.4     42.1     24.2     7.6      6.2      13.5     21.1    
Portland Trail Blazers   18       104.7    38.8     88.6     43.8     11.0     32.5     33.8     16.2     20.5     78.9     11.9     28.7     40.7     22.2     8.9      4.8      15.8     20.4    

The output file does not correspond to the code written above only for the sake of providing an output file that could fit into this document, but each of the scrapers works the same so the idea is the same.

Discussion

This project taught us a lot about object-oriented programming, as well as how to build a project in JavaFX and how to web scrape data and place it into reference points to be used for other things. We learned a lot about how to read html and use it web scrape, as well as how to build web scrapers into classes using methods, constructors, arrays, and different types of variables to move the data into places we want it in. We also learned about using JavaFX to create scenes for each tab of our data to create tables which displayed what we wanted them to, as well as implementing buttons to display different tables, refresh the program, and even print. All these things contributed to us creating a final project that provides the type of output we envisioned when we started building. 

References

[1] ESPN, https://www.espn.com/ (accessed 2023). 
Expected win percentage algorithm provided by Professor Barry Husowitz.
