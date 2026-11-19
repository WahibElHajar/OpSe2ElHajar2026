package fabrikMethode;

import java.io.IOException;

public class ConcreteReaderCreatorElHajar extends ReaderCreatorElHajar{

	public ReaderProductElHajar factoryMethod(String typ) throws IOException{
		
		if("csv".equals(typ))
			return new ConcreteReaderCSVProductElHajar();
		else
			return new ConcreteReaderTXTProductElHajar();
		
	}
	
}
