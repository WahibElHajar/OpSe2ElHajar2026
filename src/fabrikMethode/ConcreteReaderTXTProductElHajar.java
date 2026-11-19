package fabrikMethode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteReaderTXTProductElHajar extends ReaderProductElHajar {
	
	private BufferedReader eingabe;
	
	public ConcreteReaderTXTProductElHajar() throws IOException {
		
		this.eingabe = new BufferedReader(new FileReader("Stadtfuehrung.txt"));
		
	}
	
	public String[] leseAusDatei() throws IOException{
		
		String [] zeile = new String[5];
		for(int i = 0; i < zeile.length; i++) {
			String lesen = eingabe.readLine();
			zeile[i] = lesen;
		}
		
		return zeile;
		
	}
	
	public void schliesseDatei() throws IOException{
		
		eingabe.close();
		
	}
	
}
