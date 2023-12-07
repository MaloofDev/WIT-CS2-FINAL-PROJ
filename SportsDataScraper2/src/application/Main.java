package application;
	
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TitledPane;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;

public class Main extends Application implements Initializable {

	
	 @Override
	    public void start(Stage stage) throws Exception {
		  try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/GUI.fxml"));
			MainController mainController = new MainController();
			loader.setController(mainController);
			Parent root= loader.load();			
			Scene scene = new Scene(root, 500,500);
			stage.setTitle("Sports Data Scraper GUI");
			stage.setScene(scene);
			stage.show();
			 
			
			 } catch (IOException e) {
			 	e.printStackTrace();
			 }
	    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public static void main(String[] args) {
		launch(args);
	}
}