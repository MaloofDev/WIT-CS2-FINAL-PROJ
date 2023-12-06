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

	@FXML // fx:id="SkatingTable"
	private TableView<NHLStats> SkatingTable;
	private TableColumn<NHLStats, String> NHLname;
	private TableColumn<NHLStats, Float> NHLGP;
	private TableColumn<NHLStats, Float> GFPG;
	private TableColumn<NHLStats, Float> A;
	private TableColumn<NHLStats, Float> NHLPTS;
	private TableColumn<NHLStats, Float> PPG;
	private TableColumn<NHLStats, Float> PPP;
	private TableColumn<NHLStats, Float> SHG;
	private TableColumn<NHLStats, Float> S;
	private TableColumn<NHLStats, Float> SP;
	private TableColumn<NHLStats, Float> PIM;
	private TableColumn<NHLStats, Float> PKP;
	private TableColumn<NHLStats, Float> SOA;
	private TableColumn<NHLStats, Float> SOG;
	private TableColumn<NHLStats, Float> SOP;

	@FXML // fx:id="GoalTable"
	private TableView<NHLStats> GoalTable;
	private TableColumn<NHLStats, String> GNHLname;
	private TableColumn<NHLStats, Float> GNHLGP;
	private TableColumn<NHLStats, Float> GAPG;
	private TableColumn<NHLStats, Float> NHLW;
	private TableColumn<NHLStats, Float> NHLL;
	private TableColumn<NHLStats, Float> OTL;
	private TableColumn<NHLStats, Float> SA;
	private TableColumn<NHLStats, Float> GA;
	private TableColumn<NHLStats, Float> GS;
	private TableColumn<NHLStats, Float> SVP;
	private TableColumn<NHLStats, Float> SO;
	private TableColumn<NHLStats, Float> SOSA;
	private TableColumn<NHLStats, Float> SOS;
	private TableColumn<NHLStats, Float> SOSP;

	@FXML // fx:id="FieldTable"
	private TableView<MLBStats> FieldTable;
	private TableColumn<MLBStats, String> MLBname;
	private TableColumn<MLBStats, Float> MLBGP;
	private TableColumn<MLBStats, Float> AB;
	private TableColumn<MLBStats, Float> R;
	private TableColumn<MLBStats, Float> H;
	private TableColumn<MLBStats, Float> DBL;
	private TableColumn<MLBStats, Float> TRPL;
	private TableColumn<MLBStats, Float> HR;
	private TableColumn<MLBStats, Float> RBI;
	private TableColumn<MLBStats, Float> TB;
	private TableColumn<MLBStats, Float> BB;
	private TableColumn<MLBStats, Float> MLBSO;
	private TableColumn<MLBStats, Float> SB;
	private TableColumn<MLBStats, Float> AVG;
	private TableColumn<MLBStats, Float> OBP;
	private TableColumn<MLBStats, Float> SLG;
	private TableColumn<MLBStats, Float> OPS;

	@FXML // fx:id="PitchingTable"
	private TableView<MLBPitchingStats> PitchingTable;
	private TableColumn<MLBPitchingStats, String> PMLBname;
	private TableColumn<MLBPitchingStats, Float> PMLBGP;
	private TableColumn<MLBPitchingStats, Float> MLBW;
	private TableColumn<MLBPitchingStats, Float> MLBL;
	private TableColumn<MLBPitchingStats, Float> ERA;
	private TableColumn<MLBPitchingStats, Float> SV;
	private TableColumn<MLBPitchingStats, Float> CG;
	private TableColumn<MLBPitchingStats, Float> SHO;
	private TableColumn<MLBPitchingStats, Float> QS;
	private TableColumn<MLBPitchingStats, Float> IP;
	private TableColumn<MLBPitchingStats, Float> PMLBH;
	private TableColumn<MLBPitchingStats, Float> ER;
	private TableColumn<MLBPitchingStats, Float> PMLBHR;
	private TableColumn<MLBPitchingStats, Float> PMLBBB;
	private TableColumn<MLBPitchingStats, Float> PMLBSO;
	private TableColumn<MLBPitchingStats, Float> OBA;
	private TableColumn<MLBPitchingStats, Float> WHIP;

	@FXML // fx:id="Pitching"
	private Tab Pitching; // Value injected by FXMLLoader

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
		NFLDScraper nfldWebScraper = new NFLDScraper();
		NFLDStats[] nfldTeamStats = nfldWebScraper.Scrape();

		ObservableList<NFLDStats> data = FXCollections.observableArrayList(nfldTeamStats);

		NFLDefenseTable.setItems(data);
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

		NFLDefenseTable.getColumns().setAll(DNFLname, DNFLGP, DTYDS, DTYDSPG, DPYDS, DPYDSPG, DRYDS, DRYDSPG, DNFLPTS,
				DPTSPG);
	}

	private void initializeNHLData() {
		NHLScraper nhlscraper = new NHLScraper();
		NHLStats[] SNHLStats = nhlscraper.scrape(1);
		NHLStats[] GNHLStats = nhlscraper.scrape(0);
		ObservableList<NHLStats> Sdata = FXCollections.observableArrayList(SNHLStats);
		ObservableList<NHLStats> Gdata = FXCollections.observableArrayList(GNHLStats);

		NHLname.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
		GNHLname.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
		NHLGP.setCellValueFactory(cellData -> cellData.getValue().getGP().asObject());
		GFPG.setCellValueFactory(cellData -> cellData.getValue().getGFPG().asObject());
		A.setCellValueFactory(cellData -> cellData.getValue().getA().asObject());
		NHLPTS.setCellValueFactory(cellData -> cellData.getValue().getPTS().asObject());
		PPG.setCellValueFactory(cellData -> cellData.getValue().getPPG().asObject());
		PPP.setCellValueFactory(cellData -> cellData.getValue().getPPP().asObject());
		SHG.setCellValueFactory(cellData -> cellData.getValue().getSHG().asObject());
		S.setCellValueFactory(cellData -> cellData.getValue().getS().asObject());
		GS.setCellValueFactory(cellData -> cellData.getValue().getS().asObject());
		SP.setCellValueFactory(cellData -> cellData.getValue().getSP().asObject());
		PIM.setCellValueFactory(cellData -> cellData.getValue().getPIM().asObject());
		PKP.setCellValueFactory(cellData -> cellData.getValue().getPKP().asObject());
		SOA.setCellValueFactory(cellData -> cellData.getValue().getSOA().asObject());
		SOG.setCellValueFactory(cellData -> cellData.getValue().getSOG().asObject());
		SOP.setCellValueFactory(cellData -> cellData.getValue().getSOP().asObject());
		GAPG.setCellValueFactory(cellData -> cellData.getValue().getGAPG().asObject());
		NHLW.setCellValueFactory(cellData -> cellData.getValue().getW().asObject());
		NHLL.setCellValueFactory(cellData -> cellData.getValue().getL().asObject());
		OTL.setCellValueFactory(cellData -> cellData.getValue().getOTL().asObject());
		SA.setCellValueFactory(cellData -> cellData.getValue().getSA().asObject());
		GA.setCellValueFactory(cellData -> cellData.getValue().getGA().asObject());
		SVP.setCellValueFactory(cellData -> cellData.getValue().getSVP().asObject());
		SO.setCellValueFactory(cellData -> cellData.getValue().getSO().asObject());
		SOSA.setCellValueFactory(cellData -> cellData.getValue().getSOSA().asObject());
		SOS.setCellValueFactory(cellData -> cellData.getValue().getSOS().asObject());
		SOSP.setCellValueFactory(cellData -> cellData.getValue().getSOSP().asObject());

		SkatingTable.setItems(Sdata);
		GoalTable.setItems(Gdata);
		SkatingTable.getColumns().setAll(NHLname, NHLGP, GFPG, A, NHLPTS, PPG, PPP, SHG, S, SP, PIM, PKP, SOA, SOG,
				SOP);
		GoalTable.getColumns().setAll(GNHLname, GNHLGP, GAPG, NHLW, NHLL, OTL, SA, GA, GS, SVP, SO, SOSA, SOS, SOSP);

	}

	private void initializeMLBPitchingStats() {
		MLBPitchingScraper mlbPitchingScraper = new MLBPitchingScraper(); // Replace with your actual scraper class
		MLBPitchingStats[] mlbPitchingStats = mlbPitchingScraper.Scrape(); // Replace with your actual scraping
																			// logic

		ObservableList<MLBPitchingStats> mlbPitchingStatsList = FXCollections.observableArrayList(mlbPitchingStats);

		// Assuming you have a TableView named MLBPitchingTable
		PitchingTable.setItems(mlbPitchingStatsList);

		// Initialize TableColumn bindings
		PMLBname.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
		PMLBGP.setCellValueFactory(cellData -> cellData.getValue().getGP().asObject());
		MLBW.setCellValueFactory(cellData -> cellData.getValue().getW().asObject());
		MLBL.setCellValueFactory(cellData -> cellData.getValue().getL().asObject());
		ERA.setCellValueFactory(cellData -> cellData.getValue().getERA().asObject());
		SV.setCellValueFactory(cellData -> cellData.getValue().getSV().asObject());
		CG.setCellValueFactory(cellData -> cellData.getValue().getCG().asObject());
		SHO.setCellValueFactory(cellData -> cellData.getValue().getSHO().asObject());
		QS.setCellValueFactory(cellData -> cellData.getValue().getQS().asObject());
		IP.setCellValueFactory(cellData -> cellData.getValue().getIP().asObject());
		PMLBH.setCellValueFactory(cellData -> cellData.getValue().getH().asObject());
		ER.setCellValueFactory(cellData -> cellData.getValue().getER().asObject());
		PMLBHR.setCellValueFactory(cellData -> cellData.getValue().getHR().asObject());
		PMLBBB.setCellValueFactory(cellData -> cellData.getValue().getBB().asObject());
		PMLBSO.setCellValueFactory(cellData -> cellData.getValue().getSO().asObject());
		OBA.setCellValueFactory(cellData -> cellData.getValue().getOBA().asObject());
		WHIP.setCellValueFactory(cellData -> cellData.getValue().getWHIP().asObject());

		// Assuming you have a TableColumn named PMLBGP and MLBPitchingTable
		PitchingTable.getColumns().setAll(PMLBname,PMLBGP, MLBW, MLBL, ERA, SV, CG, SHO, QS, IP, PMLBH, ER, PMLBHR, PMLBBB,
				PMLBSO, OBA, WHIP);
	}

	private void initializeMLBFieldingStats() {
		MLBScraper mlbFieldingScraper = new MLBScraper(); // Replace with your actual scraper class
		MLBStats[] mlbFieldingStats = mlbFieldingScraper.scrape(); // Replace with your actual scraping
																	// logic

		ObservableList<MLBStats> mlbFieldingStatsList = FXCollections.observableArrayList(mlbFieldingStats);

		// Assuming you have a TableView named MLBFieldingTable
		FieldTable.setItems(mlbFieldingStatsList);

		// Initialize TableColumn bindings
		// Replace the TableColumn types with your actual types
		MLBname.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
		MLBGP.setCellValueFactory(cellData -> cellData.getValue().getGP().asObject());
		AB.setCellValueFactory(cellData -> cellData.getValue().getAB().asObject());
		R.setCellValueFactory(cellData -> cellData.getValue().getR().asObject());
		H.setCellValueFactory(cellData -> cellData.getValue().getH().asObject());
		DBL.setCellValueFactory(cellData -> cellData.getValue().getDBL().asObject());
		TRPL.setCellValueFactory(cellData -> cellData.getValue().getTRPL().asObject());
		HR.setCellValueFactory(cellData -> cellData.getValue().getHR().asObject());
		RBI.setCellValueFactory(cellData -> cellData.getValue().getRBI().asObject());
		TB.setCellValueFactory(cellData -> cellData.getValue().getTB().asObject());
		BB.setCellValueFactory(cellData -> cellData.getValue().getBB().asObject());
		MLBSO.setCellValueFactory(cellData -> cellData.getValue().getSO().asObject());
		SB.setCellValueFactory(cellData -> cellData.getValue().getSB().asObject());
		AVG.setCellValueFactory(cellData -> cellData.getValue().getAVG().asObject());
		OBP.setCellValueFactory(cellData -> cellData.getValue().getOBP().asObject());
		SLG.setCellValueFactory(cellData -> cellData.getValue().getSLG().asObject());
		OPS.setCellValueFactory(cellData -> cellData.getValue().getOPS().asObject());

		FieldTable.getColumns().setAll(MLBname,MLBGP, AB, R, H, DBL, TRPL, HR, RBI, TB, BB, MLBSO, SB, AVG, OBP, SLG, OPS);
	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert DefenseTab != null : "fx:id=\"DefenseTab\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert NFLDefenseTable != null
				: "fx:id=\"DefenseTable\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert Field != null : "fx:id=\"FIeld\" was not injected: check your FXML file 'GUI test.fxml'.";
		assert FieldTable != null : "fx:id=\"FieldTable\" was not injected: check your FXML file 'GUI test.fxml'.";
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
		// NFL Offense Columns
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
		// NFL Defense Columns
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

		// NFL Table Columns
		NHLname = new TableColumn<>("Name");
		GNHLname = new TableColumn<>("Name");
		NHLGP = new TableColumn<>("GP");
		GNHLGP = new TableColumn<>("Name");
		GFPG = new TableColumn<>("GFPG");
		A = new TableColumn<>("A");
		NHLPTS = new TableColumn<>("PTS");
		PPG = new TableColumn<>("PPG");
		PPP = new TableColumn<>("PPP");
		SHG = new TableColumn<>("SHG");
		S = new TableColumn<>("S");
		GS = new TableColumn<>("S");
		SP = new TableColumn<>("SP");
		PIM = new TableColumn<>("PIM");
		PKP = new TableColumn<>("PKP");
		SOA = new TableColumn<>("SOA");
		SOG = new TableColumn<>("SOG");
		SOP = new TableColumn<>("SOP");
		GAPG = new TableColumn<>("GAPG");
		NHLW = new TableColumn<>("W");
		NHLL = new TableColumn<>("L");
		OTL = new TableColumn<>("OTL");
		SA = new TableColumn<>("SA");
		GA = new TableColumn<>("GA");
		SVP = new TableColumn<>("SVP");
		SO = new TableColumn<>("SO");
		SOSA = new TableColumn<>("SOSA");
		SOS = new TableColumn<>("SOS");
		SOSP = new TableColumn<>("SOSP");

		// NBA Columns
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

		// MLB Pitching Columns
		PMLBname = new TableColumn<>("Name");
		PMLBGP = new TableColumn<>("P");
		MLBW = new TableColumn<>("W");
		MLBL = new TableColumn<>("L");
		ERA = new TableColumn<>("ERA");
		SV = new TableColumn<>("SV");
		CG = new TableColumn<>("CG");
		SHO = new TableColumn<>("SHO");
		QS = new TableColumn<>("QS");
		IP = new TableColumn<>("IP");
		PMLBH = new TableColumn<>("H");
		ER = new TableColumn<>("ER");
		PMLBHR = new TableColumn<>("HR");
		PMLBBB = new TableColumn<>("BB");
		PMLBSO = new TableColumn<>("SO");
		OBA = new TableColumn<>("OBA");
		WHIP = new TableColumn<>("WHIP");

		// MLB Field Columns
		MLBname = new TableColumn<>("Name");
		MLBGP = new TableColumn<>("GP");
		AB = new TableColumn<>("AB");
		R = new TableColumn<>("R");
		H = new TableColumn<>("H");
		DBL = new TableColumn<>("DBL");
		TRPL = new TableColumn<>("TRPL");
		HR = new TableColumn<>("HR");
		RBI = new TableColumn<>("RBI");
		TB = new TableColumn<>("TB");
		BB = new TableColumn<>("BB");
		MLBSO = new TableColumn<>("SO");
		SB = new TableColumn<>("SB");
		AVG = new TableColumn<>("AVG");
		OBP = new TableColumn<>("OBP");
		SLG = new TableColumn<>("SLG");
		OPS = new TableColumn<>("OPS");

		initializeNBAData();
		initializeNFLOData();
		initializeNFLDData();
		initializeNHLData();
		initializeMLBFieldingStats();
		initializeMLBPitchingStats();
	}

}
