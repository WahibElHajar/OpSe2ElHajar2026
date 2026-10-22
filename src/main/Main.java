package main;

//import gui.StadtfuehrungenAnwendungssystem;
import javafx.application.Application;
import javafx.stage.Stage;
import gui.*;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		new StadtfuehrungenControl(primaryStage);
	}	
	
	public static void main(String[] args){
		launch(args);
	}
}
