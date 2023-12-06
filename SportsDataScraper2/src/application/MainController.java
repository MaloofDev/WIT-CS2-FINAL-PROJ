package application;
/**
 * Sample Skeleton for 'GUI test.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;

public class MainController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="DefenseTab"
    private Tab DefenseTab; // Value injected by FXMLLoader

    @FXML // fx:id="DefenseTable"
    private TableView<?> DefenseTable; // Value injected by FXMLLoader

    @FXML // fx:id="FIeld"
    private Tab FIeld; // Value injected by FXMLLoader

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
    private TableView<?> NBATable; // Value injected by FXMLLoader

    @FXML // fx:id="OffenseTab"
    private Tab OffenseTab; // Value injected by FXMLLoader

    @FXML // fx:id="OffenseTable"
    private TableView<?> OffenseTable; // Value injected by FXMLLoader

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

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert DefenseTab != null : "fx:id=\"DefenseTab\" was not injected: check your FXML file 'GUI test.fxml'.";
        assert DefenseTable != null : "fx:id=\"DefenseTable\" was not injected: check your FXML file 'GUI test.fxml'.";
        assert FIeld != null : "fx:id=\"FIeld\" was not injected: check your FXML file 'GUI test.fxml'.";
        assert FieldTable != null : "fx:id=\"FieldTable\" was not injected: check your FXML file 'GUI test.fxml'.";
        assert GoalTable != null : "fx:id=\"GoalTable\" was not injected: check your FXML file 'GUI test.fxml'.";
        assert GoaltendingTab != null : "fx:id=\"GoaltendingTab\" was not injected: check your FXML file 'GUI test.fxml'.";
        assert Main != null : "fx:id=\"Main\" was not injected: check your FXML file 'GUI test.fxml'.";
        assert NBA != null : "fx:id=\"NBA\" was not injected: check your FXML file 'GUI test.fxml'.";
        assert NBATable != null : "fx:id=\"NBATable\" was not injected: check your FXML file 'GUI test.fxml'.";
        assert OffenseTab != null : "fx:id=\"OffenseTab\" was not injected: check your FXML file 'GUI test.fxml'.";
        assert OffenseTable != null : "fx:id=\"OffenseTable\" was not injected: check your FXML file 'GUI test.fxml'.";
        assert Pitching != null : "fx:id=\"Pitching\" was not injected: check your FXML file 'GUI test.fxml'.";
        assert PitchingTable != null : "fx:id=\"PitchingTable\" was not injected: check your FXML file 'GUI test.fxml'.";
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

    }

}

