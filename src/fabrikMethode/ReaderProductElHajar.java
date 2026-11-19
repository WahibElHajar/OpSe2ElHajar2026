package fabrikMethode;

import java.io.IOException;

public abstract class ReaderProductElHajar {
	
	public abstract String[] leseAusDatei() throws IOException;
	
	public abstract void schliesseDatei() throws IOException;
	
}
