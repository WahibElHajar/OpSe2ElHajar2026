package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import fabrikMethode.*;

public class StadtfuehrungeModel {
	
	 private Stadtfuehrung stadtfuehrung;
	 public ReaderCreatorElHajar creator;
	 public ReaderProductElHajar product;

	 public StadtfuehrungeModel() {
	 }

	 public Stadtfuehrung getStadtfuehrung() {
		 return stadtfuehrung;
	 }

	 public void setStadtfuehrung(Stadtfuehrung stadtfuehrung) {
		 this.stadtfuehrung = stadtfuehrung;
	 }
	 
	 public void leseAusDatei(String typ) throws Exception{
		 
		 creator = new ConcreteReaderCreatorElHajar();
		 product = creator.factoryMethod(typ);
		 
		 String[] zeile = product.leseAusDatei();
		 this.stadtfuehrung = new Stadtfuehrung(zeile[0], 
			 Integer.parseInt(zeile[1]), 
			 zeile[2], 
			 Float.parseFloat(zeile[3]), 
			 zeile[4].split("_"));
			 product.schliesseDatei();
	 }
	 
	 public void schreibeStadtfuehrungenInCsvDatei() throws Exception {
				
		 BufferedWriter aus 
		 = new BufferedWriter(new FileWriter("StadtfuehrungenAusgabe.csv", true));
				aus.write(stadtfuehrung.gibStadtfuehrungZurueck(';'));
				aus.close();
	}
}
