package fabrikMethode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ConcreteReaderCSVProductElHajar extends ReaderProductElHajar {
	
	private BufferedReader eingabe;
	
	public ConcreteReaderCSVProductElHajar() throws IOException {
		
		this.eingabe = new BufferedReader(new FileReader("Stadtfuehrung.csv"));
		
	}
	
	public String[] leseAusDatei() throws IOException{
		
		String[] zeile = eingabe.readLine().split(";");
		
		return zeile;
		
	}
	
	public void schliesseDatei() throws IOException{
		
		eingabe.close();
		
	}

}
