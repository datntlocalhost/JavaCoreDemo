package datnt.runsystem.com.exceptions;

import java.io.File;
import java.io.IOException;

public class IOExceptionDemo {
	
	
	public void execute() {
		
		
		File file = new File("");
		
		//Phương thức createNewFile() ném IOException
		try {
			file.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}

}
