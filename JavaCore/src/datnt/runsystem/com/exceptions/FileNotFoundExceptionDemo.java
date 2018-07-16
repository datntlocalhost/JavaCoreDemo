package datnt.runsystem.com.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionDemo {
	
	public void execute() {
		
		//FileInputStream constructor sẽ ném FileNotFoundException khi ngoại lệ xảy ra
		try {
			FileInputStream fileInputStream = new FileInputStream("");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
