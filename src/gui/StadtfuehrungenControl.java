package gui;

import java.io.IOException;

import business.Stadtfuehrung;
import business.StadtfuehrungeModel;
import javafx.stage.Stage;

public class StadtfuehrungenControl {
	
	private StadtfuehrungeModel stModel;
	private StadtfuehrungenView stView;
	public StadtfuehrungenControl (Stage primaryStage) {
		this.stModel = new StadtfuehrungeModel();
		this.stView = new StadtfuehrungenView(primaryStage, this, this.stModel);
	}
	
	public void nehmeStadtfuehrungAuf(String titel, String identnummer, String beschreibung, String start, String daten){
    	try{ 
    		this.stModel.setStadtfuehrung(new Stadtfuehrung(
    			titel, 
   	            Integer.parseInt(identnummer),
   	            beschreibung,
   	            Float.parseFloat(start),
   	            daten.split(";")));
    		this.stView.zeigeInformationsfensterAn("Die Stadtfuehrung wurde aufgenommen!");
       	}
       	catch(Exception exc){
       		this.stView.zeigeFehlermeldungsfensterAn(exc.getMessage());
     	}
    }
	
	public void leseAusDatei(String typ){
	    	try {
	      		if("csv".equals(typ)){
	      			this.stModel.leseAusDatei();
	      	  		this.stView.zeigeInformationsfensterAn(
	      	  				"Das Stadtfuehrung wurde gelesen!");
	      		}
	       		else{
		   			this.stView.zeigeInformationsfensterAn(
		   					"Noch nicht implementiert!");
		   		}
			}
			catch(IOException exc){
				this.stView.zeigeFehlermeldungsfensterAn(
						"IOException beim Lesen!");
			}
			catch(Exception exc){
				this.stView.zeigeFehlermeldungsfensterAn(
						"Unbekannter Fehler beim Lesen!");
			}
		}
			
	public void schreibeStadtfuehrungenInCsvDatei() {
			try {
				this.stModel.schreibeStadtfuehrungenInCsvDatei();
	   			this.stView.zeigeInformationsfensterAn(
	   					"Die Stadtfuehrungen wurden gespeichert!");
			}	
			catch(IOException exc){
				this.stView.zeigeFehlermeldungsfensterAn(
						"IOException beim Speichern!");
			}
			catch(Exception exc){
				this.stView.zeigeFehlermeldungsfensterAn(
						"Unbekannter Fehler beim Speichern!");
			}
		}

}
