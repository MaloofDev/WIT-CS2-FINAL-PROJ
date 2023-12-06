package application;

/**
 * Sample Skeleton for 'GUI test.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MainController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="DefenseTab"
	private Tab DefenseTab; // Value injected by FXMLLoader

	@FXML // fx:id="FIeld"
	private Tab Field; // Value injected by FXMLLoader

	@FXML // fx:id="FieldTable"
	private TableView<?> FieldTable; // Value injected by FXMLLoader

	@FXML // fx:id="GoalTable"
	private TableView<?> GoalTable; // Value injected by FXMLLoader

	@FXML // fx:id="GoaltendingTab"
	private Tab GoaltendingTab; // Value injected by FXMLLoader

	@FXML // fx:id="Main"
	private TabPane Main; // Value injected by FXMLLoader

	@FXML // fx:id="NBA"
	private Tab NBA; // Value injected by FXMLLoader

	@FXML // fx:id="NBATable"
	private TableView<NBAStats> NBATable; // Value injected by FXMLLoader
	private TableColumn<NBAStats, String> name;
	private TableColumn<NBAStats, Double> GP;
	private TableColumn<NBAStats, Double> PTS;
	private TableColumn<NBAStats, Double> FGM;
	private TableColumn<NBAStats, Double> FGA;
	private TableColumn<NBAStats, Double> FGP;
	private TableColumn<NBAStats, Double> TPM;
	private TableColumn<NBAStats, Double> TPA;
	private TableColumn<NBAStats, Double> TPP;
	private TableColumn<NBAStats, Double> FTM;
	private TableColumn<NBAStats, Double> FTA;
	private TableColumn<NBAStats, Double> FTP;
	private TableColumn<NBAStats, Double> OR;
	private TableColumn<NBAStats, Double> DR;
	private TableColumn<NBAStats, Double> REB;
	private TableColumn<NBAStats, Double> AST;
	private TableColumn<NBAStats, Double> STL;
	private TableColumn<NBAStats, Double> BLK;
	private TableColumn<NBAStats, Double> TO;
	private TableColumn<NBAStats, Double> PF;

	@FXML // fx:id="OffenseTab"
	private Tab OffenseTab; // Value injected by FXMLLoader

	@FXML // fx:id="OffenseTable"
	private TableView<NFLStats> NFLOffenseTable; // Value injected by FXMLLoader
	private TableColumn<NFLStats, String> NFLname;
	private TableColumn<NFLStats, Float> NFLGP;
	private TableColumn<NFLStats, Float> TYDS;
	private TableColumn<NFLStats, Float> TYDSPG;
	private TableColumn<NFLStats, Float> PYDS;
	private TableColumn<NFLStats, Float> PYDSPG;
	private TableColumn<NFLStats, Float> RYDS;
	private TableColumn<NFLStats, Float> RYDSPG;
	private TableColumn<NFLStats, Float> NFLPTS;
	private TableColumn<NFLStats, Float> PTSPG;

	@FXML // fx:id="DefenseTable"
	private TableView<NFLDStats> NFLDefenseTable; // Value injected by FXMLLoader
	private TableColumn<NFLDStats, String> DNFLname;
	private TableColumn<NFLDStats, Float> DNFLGP;
	private TableColumn<NFLDStats, Float> DTYDS;
	private TableColumn<NFLDStats, Float> DTYDSPG;
	private TableColumn<NFLDStats, Float> DPYDS;
	private TableColumn<NFLDStats, Float> DPYDSPG;
	private TableColumn<NFLDStats, Float> DRYDS;
	private TableColumn<NFLDStats, Float> DRYDSPG;
	private TableColumn<NFLDStats, Float> DNFLPTS;
	private TableColumn<NFLDStats, Float> DPTSPG;

	@FXML // fx:id="Pitching"
	private Tab Pitching; // Value injected by FXMLLoader

	@FXML // fx:id="PitchingTable"
	private TableView<?> PitchingTable; // Value injected by FXMLLoader

	@FXML // fx:id="PrePostMLB"
	private ChoiceBox<?> PrePostMLB; // Value injected by FXMLLoader

	@FXML // fx:id="PrePostNBA"
	private ChoiceBox<?> PrePostNBA; // Value injected by FXMLLoader

	@FXML // fx:id="PrePostNFL"
	private ChoiceBox<?> PrePostNFL; // Value injected by FXMLLoader

	@FXML // fx:id="PrePostNHL"
	private ChoiceBox<?> PrePostNHL; // Value injected by FXMLLoader

	@FXML // fx:id="PrintMLB"
	private Button PrintMLB; // Value injected by FXMLLoader

	@FXML // fx:id="PrintNBA"
	private Button PrintNBA; // Value injected by FXMLLoader

	@FXML // fx:id="PrintNFL"
	private Button PrintNFL; // Value injected by FXMLLoader

	@FXML // fx:id="PrintNHL"
	private Button PrintNHL; // Value injected by FXMLLoader

	@FXML // fx:id="RefreshMLB"
	private Button RefreshMLB; // Value injected by FXMLLoader

	@FXML // fx:id="RefreshNBA"
	private Button RefreshNBA; // Value injected by FXMLLoader

	@FXML // fx:id="RefreshNFL"
	private Button RefreshNFL; // Value injected by FXMLLoader

	@FXML // fx:id="RefreshNHL"
	private Button RefreshNHL; // Value injected by FXMLLoader

	@FXML // fx:id="SkateTable"
	private TableView<?> SkateTable; // Value injected by FXMLLoader

	@FXML // fx:id="SkatingTab"
	private Tab SkatingTab; // Value injected by FXMLLoader

	@FXML // fx:id="YearMLB"
	private ChoiceBox<?> YearMLB; // Value injected by FXMLLoader

	@FXML // fx:id="YearNBA"
	private ChoiceBox<?> YearNBA; // Value injected by FXMLLoader

	@FXML // fx:id="YearNFL"
	private ChoiceBox<?> YearNFL; // Value injected by FXMLLoader

	@FXML // fx:id="YearNHL"
	private ChoiceBox<?> YearNHL; // Value injected by FXMLLoader

	private void initializeNBAData() {
		NbaWebScraper nbaWebScraper = new NbaWebScraper();
		NBAStats[] nbaTeamStats = nbaWebScraper.Scrape();
		ObservableList<NBAStats> data = FXCollections.observableArrayList(nbaTeamStats);
		NBATable.setItems(data);
		name.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
		GP.setCellValueFactory(cellData -> cellData.getValue().getGP().asObject());
		PTS.setCellValueFactory(cellData -> cellData.getValue().getPTS().asObject());
		FGM.setCellValueFactory(cellData -> cellData.getValue().getFGM().asObject());
		FGA.setCellValueFactory(cellData -> cellData.getValue().getFGA().asObject());
		FGP.setCellValueFactory(cellData -> cellData.getValue().getFGP().asObject());
		TPM.setCellValueFactory(cellData -> cellData.getValue().getTPM().asObject());
		TPA.setCellValueFactory(cellData -> cellData.getValue().getTPA().asObject());
		TPP.setCellValueFactory(cellData -> cellData.getValue().getTPP().asObject());
		FTM.setCellValueFactory(cellData -> cellData.getValue().getFTM().asObject());
		FTA.setCellValueFactory(cellData -> cellData.getValue().getFTA().asObject());
		FTP.setCellValueFactory(cellData -> cellData.getValue().getFTP().asObject());
		OR.setCellValueFactory(cellData -> cellData.getValue().getOR().asObject());
		DR.setCellValueFactory(cellData -> cellData.getValue().getDR().asObject());
		REB.setCellValueFactory(cellData -> cellData.getValue().getREB().asObject());
		AST.setCellValueFactory(cellData -> cellData.getValue().getAST().asObject());
		STL.setCellValueFactory(cellData -> cellData.getValue().getSTL().asObject());
		BLK.setCellValueFactory(cellData -> cellData.getValue().getBLK().asObject());
		TO.setCellValueFactory(cellData -> cellData.getValue().getTO().asObject());
		PF.setCellValueFactory(cellData -> cellData.getValue().getPF().asObject());
		NBATable.getColumns().setAll(name, GP, PTS, FGM, FGA, FGP, TPM, TPA, TPP, FTM, FTA, FTP, OR, DR, REB, AST, STL,
				BLK, TO, PF);
	}

	private void initializeNFLOData() {
		// Assuming you have an NFLWebScraper class with a method like getNFLTeamStats()
		NFLScraper nflWebScraper = new NFLScraper();
		NFLStats[] nflTeamStats = nflWebScraper.Scrape();

		// Assuming your TeamStats class has appropriate getters for each column
		ObservableList<NFLStats> data = FXCollections.observableArrayList(nflTeamStats);

		// Replace these with the actual TableColumn names for NFL data
		NFLname.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
		NFLGP.setCellValueFactory(cellData -> cellData.getValue().getGP().asObject());
		TYDS.setCellValueFactory(cellData -> cellData.getValue().getTYDS().asObject());
		TYDSPG.setCellValueFactory(cellData -> cellData.getValue().getTYDSPG().asObject());
		PYDS.setCellValueFactory(cellData -> cellData.getValue().getPYDS().asObject());
		PYDSPG.setCellValueFactory(cellData -> cellData.getValue().getPYDSPG().asObject());
		RYDS.setCellValueFactory(cellData -> cellData.getValue().getRYDS().asObject());
		RYDSPG.setCellValueFactory(cellData -> cellData.getValue().getRYDSPG().asObject());
		NFLPTS.setCellValueFactory(cellData -> cellData.getValue().getPTS().asObject());
		PTSPG.setCellValueFactory(cellData -> cellData.getValue().getPTSPG().asObject());

		// Set the items and columns for the NFL table
		NFLOffenseTable.setItems(data);
		NFLOffenseTable.getColumns().setAll(NFLname, NFLGP, TYDS, TYDSPG, PYDS, PYDSPG, RYDS, RYDSPG, NFLPTS, PTSPG);
	}

	private void initializeNFLDData() {
		System.out.println("Initializing NFL Defense Data...");

		try {
			// Assuming you have an NFLWebScraper class with a method like getNFLTeamStats()
			NFLDScraper nfldWebScraper = new NFLDScraper();
			NFLDStats[] nfldTeamStats = nfldWebScraper.Scrape();

			for (NFLDStats stats : nfldTeamStats) {
				System.out.println("Name: " + stats.getName());
				System.out.println("GP: " + stats.getGP().getValue());
				System.out.println("TYDS: " + stats.getTYDS().getValue());
				System.out.println("TYDSPG: " + stats.getTYDSPG().getValue());
				System.out.println("PYDS: " + stats.getPYDS().getValue());
				System.out.println("PYDSPG: " + stats.getPYDSPG().getValue());
				System.out.println("RYDS: " + stats.getRYDS().getValue());
				System.out.println("RYDSPG: " + stats.getRYDSPG().getValue());
				System.out.println("PTS: " + stats.getPTS().getValue());
				System.out.println("PTSPG: " + stats.getPTSPG().getValue());

				// Add more print statements if there are additional getters in NFLDStats

				System.out.println("----");
			}

			// Assuming your TeamStats class has appropriate getters for each column
			ObservableList<NFLDStats> data = FXCollections.observableArrayList(nfldTeamStats);

			// Check if data is not null
			if (data != null) {
				// Set the items and columns for the NFL table
				if (NFLDefenseTable != null) {
					NFLDefenseTable.setItems(data);
					// Replace these with the actual TableColumn names for NFL data
					DNFLname.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
					DNFLGP.setCellValueFactory(cellData -> cellData.getValue().getGP().asObject());
					DTYDS.setCellValueFactory(cellData -> cellData.getValue().getTYDS().asObject());
					DTYDSPG.setCellValueFactory(cellData -> cellData.getValue().getTYDSPG().asObject());
					DPYDS.setCellValueFactory(cellData -> cellData.getValue().getPYDS().asObject());
					DPYDSPG.setCellValueFactory(cellData -> cellData.getValue().getPYDSPG().asObject());
					DRYDS.setCellValueFactory(cellData -> cellData.getValue().getRYDS().asObject());
					DRYDSPG.setCellValueFactory(cellData -> cellData.getValue().getRYDSPG().asObject());
					DNFLPTS.setCellValueFactory(cellData -> cellData.getValue().getPTS().asObject());
					DPTSPG.setCellValueFactory(cellData -> cellData.getValue().getPTSPG().asObject());

					NFLDefenseTable.getColumns().setAll(DNFLname, DNFLGP, DTYDS, DTYDSPG, DPYDS, DPYDSPG, DRYDS,
							DRYDSPG, DNFLPTS, DPTSPG);

					System.out.println("NFL Defense Data Initialized.");
				} else {
					System.out.println("NFLDefenseTable is null.");
				}
			} else {
				System.out.println("Data is null.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error initializing NFL Defense Data: " + e.getMessage());
		}
	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert DefenseTab != null : "fx:id=\"DefenseTab\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert NFLDefenseTable != null
				: "fx:id=\"DefenseTable\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert Field != null : "fx:id=\"FIeld\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert FieldTable != null : "fx:id=\"FieldTable\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert GoalTable != null : "fx:id=\"GoalTable\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert GoaltendingTab != null
				: "fx:id=\"GoaltendingTab\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert Main != null : "fx:id=\"Main\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert NBA != null : "fx:id=\"NBA\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert NBATable != null : "fx:id=\"NBATable\" was not injected: check your FXML file 'GUI test.fxml'.";

		assert OffenseTab != null : "fx:id=\"OffenseTab\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert NFLOffenseTable != null
				: "fx:id=\"OffenseTable\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert Pitching != null : "fx:id=\"Pitching\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert PitchingTable != null
				: "fx:id=\"PitchingTable\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert PrePostMLB != null : "fx:id=\"PrePostMLB\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert PrePostNBA != null : "fx:id=\"PrePostNBA\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert PrePostNFL != null : "fx:id=\"PrePostNFL\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert PrePostNHL != null : "fx:id=\"PrePostNHL\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert PrintMLB != null : "fx:id=\"PrintMLB\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert PrintNBA != null : "fx:id=\"PrintNBA\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert PrintNFL != null : "fx:id=\"PrintNFL\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert PrintNHL != null : "fx:id=\"PrintNHL\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert RefreshMLB != null : "fx:id=\"RefreshMLB\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert RefreshNBA != null : "fx:id=\"RefreshNBA\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert RefreshNFL != null : "fx:id=\"RefreshNFL\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert RefreshNHL != null : "fx:id=\"RefreshNHL\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert SkateTable != null : "fx:id=\"SkateTable\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert SkatingTab != null : "fx:id=\"SkatingTab\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert YearMLB != null : "fx:id=\"YearMLB\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert YearNBA != null : "fx:id=\"YearNBA\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert YearNFL != null : "fx:id=\"YearNFL\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert YearNHL != null : "fx:id=\"YearNHL\" was not injected: check your FXML file 'GUI test.fxml'.";

		assert NBATable != null : "fx:id=\"NBATable\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert GP != null : "fx:id=\"GP\" TableColumn was not injected: check your FXML file 'GUI test.fxml'.";
		assert FGM != null : "fx:id=\"FGM\" TableColumn was not injected: check your FXML file 'GUI test.fxml'.";
		assert FGP != null : "fx:id=\"FGP\" TableColumn was not injected: check your FXML file 'GUI test.fxml'.";

		NFLname = new TableColumn<>("Name");
		NFLGP = new TableColumn<>("GP");
		TYDS = new TableColumn<>("TYDS");
		TYDSPG = new TableColumn<>("TYDSPG");
		PYDS = new TableColumn<>("PYDS");
		PYDSPG = new TableColumn<>("PYDSPG");
		RYDS = new TableColumn<>("RYDS");
		RYDSPG = new TableColumn<>("RYDSPG");
		NFLPTS = new TableColumn<>("PTS");
		PTSPG = new TableColumn<>("PTSPG");

		DNFLname = new TableColumn<>("Name");
		DNFLGP = new TableColumn<>("GP");
		DTYDS = new TableColumn<>("TYDS");
		DTYDSPG = new TableColumn<>("TYDSPG");
		DPYDS = new TableColumn<>("PYDS");
		DPYDSPG = new TableColumn<>("PYDSPG");
		DRYDS = new TableColumn<>("RYDS");
		DRYDSPG = new TableColumn<>("RYDSPG");
		DNFLPTS = new TableColumn<>("PTS");
		DPTSPG = new TableColumn<>("PTSPG");

		name = new TableColumn<>("Name");
		GP = new TableColumn<>("GP");
		PTS = new TableColumn<>("PTS");
		FGM = new TableColumn<>("FGM");
		FGA = new TableColumn<>("FGA");
		FGP = new TableColumn<>("FGP");
		TPM = new TableColumn<>("TPM");
		TPA = new TableColumn<>("TPA");
		TPP = new TableColumn<>("TPP");
		FTM = new TableColumn<>("FTM");
		FTA = new TableColumn<>("FTA");
		FTP = new TableColumn<>("FTP");
		OR = new TableColumn<>("OR");
		DR = new TableColumn<>("DR");
		REB = new TableColumn<>("REB");
		AST = new TableColumn<>("AST");
		STL = new TableColumn<>("STL");
		BLK = new TableColumn<>("BLK");
		TO = new TableColumn<>("TO");
		PF = new TableColumn<>("PF");
		initializeNBAData();
		initializeNFLOData();
		initializeNFLDData();
	}

}
