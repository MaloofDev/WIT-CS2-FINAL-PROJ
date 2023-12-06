#Final Project
#Professional Sports Data Scraper


Devon Lapierre, Tyger Maguire, Kaleb Maloof
COMP1050-07
Professor Gyllinsky
December 7, 2023 
 
##Abstract
In our project, we decided to web scrape data from team statistics and team standings tables from the ESPN website and place the data we scraped into our own tables, which we were able to display with our GUI. We created classes that helped to scrape the data, place it into arrays, and scrape corresponding team names, putting this data into one large array that could be written into a file or into our GUI. We used an abstract Scraper class with the methods that would then correspond to each method implementation of the scraper class for each sport, as well as a TeamStats class that held variables, a constructor, and getter methods for each variable that were used in each leagues’ Stats classes. Additionally, we used an algorithm to compute the expected win percentage of each team of each league by using scraped values of points for and points against, and putting them into the formula: 
W/ (W+L) = W% = PF2 / (PA2 + PF2)
We were then able to write all of our scraped statistics along with our calculated expected win percentage statistic into our GUI using JavaFX and scene builder, creating a strong visual output for our data
 

##Introduction
In our project, our goal was to scrape data from team statistics and team standings pages of the ESPN website for the four major professional sports’ leagues, the NFL, NBA, MLB, and NHL. We wanted to be able to successfully scrape selected data and write it into files of our own, which we could display to the user in a graphical user interface where the user can flip through the different data tables and sort through columns of statistics for each set of data. Additionally, with the help of Professor Barry Husowitz, we were able to implement an algorithm that calculated a prediction for the expected winning percentage of each team in each league based on points scored and points allowed (NFL and NBA), goals for and goals allowed (NHL), or runs scored and runs allowed (MLB). Our project greatly enhanced our ability to web scrape using the properties of the Jsoup library, which allowed us to parse the html of the ESPN website to get the data we required. We used abstract classes to set up data scrapers for each data table we grabbed from and were able to enter all the data we grabbed into files. These files were then used to fill in the different scenes of our GUI, applying the corresponding file to the correct tab of our GUI. We also enhanced our knowledge of using JavaFX to build a complete site with a home page, tabs for each of the leagues and the tables we created for the leagues, and buttons to sort through different columns of the data for each table we provide.
##Methods and Materials
This project was completed using the java programming language in the eclipse workspace application. We first created two abstract classes, a Scraper class and a TeamStats class. The TeamStats class creates variables for each column of data from the tables in ESPN and uses a constructor taking in the team and an array of that team’s statistics and applying each statistic to its defined variable. The TeamStats class also has getter methods for each variable which return the value of the variable defined by the class’s constructor. The Scraper class consists of two abstract methods, an extractStats method and a scrape method. The extractStats method took in a row of data from the html that was scraped and entered each floating-point number from that row into an array. The scrape method allowed us to enter a URL which was used to parse data from each row of the document and used the extractStats method to enter the data from that row into an array of the TeamStats class to assign each data point to its correct variable. From this point we created web scrapers for each league by using the Scraper class and TeamStats class to extend into NFLScraper, NFLStats, NHLScraper, NHLStats, NBAWebScraper, MLBScraper, MLBStats, MLBPitchingScraper, and MLBPitchingStats. Each of these classes implements the methods of the corresponding abstract classes to grab the data from the correct URL and enter it into an array that allows each row of data to be an element within the array. Each scraper then uses a main method to call the scrape method and write the data gathered from the scrape method to a file, first writing the column headings for the data, and then using the getter methods from each league’s corresponding Stats classes to get each element from each index within the array, essentially writing each statistical value for every team into the file. The second aspect of the backend of our project was creating data tables for the standings of each league. We used the same general format for the classes for standings except for adding in a few of our own calculations in order to display the data we wanted. We first created a class ExpectedWinPercentage that contained one method calculateExpectedWinPercentage. The method took in two integers of points for and points against, and calculated an expected winning percentage based on Professor Husowitz’s provided formula:
W/ (W+L) = W% = PF2 / (PA2 + PF2)
With this formula, we created the classes NBAStandings_xXWPCT, NHLStandings_xXWPCT, NFLStandings_xXWPCT, and MLBStandings_xXWPCT, NBAStandings, NHLStandings, NFLStandings, and MLBStandings. Each of the Standings classes were set up the same way as the Stats classes, by defining variables, creating a constructor to assign each variable to an index of a provided array, and getter methods for each variable. For each Standings_xXWPCT class, an extractStats method was created but used in a different fashion. The method creates a float array and assigns specific data to each index of the array by grabbing data from a specific html location. For a few of the leagues, the actual win percentage value needed to be calculated by taking the values given for wins and losses and computing the equation W/ (W +L). This calculation would be included as an index of the created array. The final index of the array would be the calculated expected win percentage, which was found by entering the values found for points for and points against in the calculateExpectedWinPercentage method of the ExpectedWinPercentage class. A scrape method was set up the same way as for the Scraper classes, definining a URL and parsing its data by taking rows of data at a time and applying the extractStats method to that row of data. Finally, the main method of these Standings_xXWPCT classes called on the scrape method and wrote the resulting data to a file using the getter methods of the Standings classes. Finally, to grab each teams name from the tables available on ESPN we implemented a TestGrab class that held a TeamGrab method, which returned an array of team names which were grabbed from a given URL based on the html of the given table at that location.

(Add in JavaFx)
##Results
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
Team                     		W        L        PF       PA       PCT      xPCT    
Boston Celtics              		 15       4        2217     2041     0.789    0.541   
Minnesota Timberwolves 	 15       4        2143     2012     0.789    0.532   
Orlando Magic            		14       6        2286     2200     0.700    0.519   
Milwaukee Bucks          		14       6        2422     2362     0.700    0.513   
Oklahoma City Thunder   	 13       6        2274     2117     0.684    0.536   
Denver Nuggets         		14       7        2405     2318     0.667    0.518   
Philadelphia 76ers       		12       7        2282     2149     0.632    0.530   
New York Knicks          		12       7        2107     2005     0.632    0.525   
Sacramento Kings        		 11       7        2097     2101     0.611    0.499   
Phoenix Suns             		12       8        2324     2266     0.600    0.513   
Dallas Mavericks         		11       8        2246     2242     0.579    0.501   
Los Angeles Lakers       		12       9        2363     2384     0.571    0.496   
Indiana Pacers           		10       8        2318     2266     0.556    0.511   
Miami Heat               		11       9        2262     2240     0.550    0.505   
Cleveland Cavaliers      		11       9        2216     2224     0.550    0.498   
Brooklyn Nets            		10       9        2217     2166     0.526    0.512   
New Orleans Pelicans     	11       10       2394     2377     0.524    0.504   
LA Clippers             		 9        10       2145     2084     0.474    0.514   
Atlanta Hawks           		 9        10       2341     2333     0.474    0.502   
Houston Rockets          		8        9        1872     1822     0.471    0.513   
Golden State Warriors    	9        11       2296     2290     0.450    0.501   
Toronto Raptors          		9        11       2224     2250     0.450    0.494   
Utah Jazz                		7        13       2242     2370     0.350    0.472   
Chicago Bulls            		7        14       2262     2375     0.333    0.476   
Charlotte Hornets        		6        12       2048     2200     0.333    0.464   
Portland Trail Blazers 		 6        13       1999     2126     0.316    0.469   
Memphis Grizzlies       		 5        14       2012     2126     0.263    0.472   
Washington Wizards      		 3        16       2219     2377     0.158    0.466   
San Antonio Spurs        		3        16       2119     2354     0.158    0.447   
Detroit Pistons          		2        18       2184     2362     0.100    0.461  

The output file does not correspond to the code written above only for the sake of providing an output file that could fit into this document, but each of the scrapers works the same so the idea is the same.

##Discussion
This project taught us a lot about object-oriented programming, as well as how to build a project in JavaFX and how to web scrape data and place it into reference points to be used for other things. We learned a lot about how to read html and use it web scrape, as well as how to build web scrapers into classes using methods, constructors, arrays, and different types of variables to move the data into places we want it in. We also learned about using JavaFX to create scenes for each tab of our data to create tables which displayed what we wanted them to, as well as implementing buttons to display different tables, refresh the program, and even print. All these things contributed to us creating a final project that provides the type of output we envisioned when we started building. 
##References
[1] ESPN, https://www.espn.com/ (accessed 2023). 
Expected win percentage algorithm provided by Professor Barry Husowitz.
