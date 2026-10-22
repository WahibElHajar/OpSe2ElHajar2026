package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StadtfuehrungeModel {
	
	 private Stadtfuehrung stadtfuehrung;

	 public StadtfuehrungeModel() {
	 }

	 public Stadtfuehrung getStadtfuehrung() {
		 return stadtfuehrung;
	 }

	 public void setStadtfuehrung(Stadtfuehrung stadtfuehrung) {
		 this.stadtfuehrung = stadtfuehrung;
	 }
	 
	 public void leseAusDatei() throws Exception{
		 
		 BufferedReader ein = new BufferedReader(new FileReader("Stadtfuehrung.csv"));
		 String[] zeile = ein.readLine().split(";");
		 this.stadtfuehrung = new Stadtfuehrung(zeile[0], 
			 Integer.parseInt(zeile[1]), 
			 zeile[2], 
			 Float.parseFloat(zeile[3]), 
			 zeile[4].split("_"));
			 ein.close();
	 }
	 
	 public void schreibeStadtfuehrungenInCsvDatei() throws Exception {
				
		 BufferedWriter aus 
		 = new BufferedWriter(new FileWriter("StadtfuehrungenAusgabe.csv", true));
				aus.write(stadtfuehrung.gibStadtfuehrungZurueck(';'));
				aus.close();
	}
}
