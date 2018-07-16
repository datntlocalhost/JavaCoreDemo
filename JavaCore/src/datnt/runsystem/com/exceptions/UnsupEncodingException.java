package datnt.runsystem.com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class UnsupEncodingException {
	
	public void execute() {
		
		//PrintStream sẽ ném UnsupportedEncodingException khi có ngoại lệ xảy ra
		try {
			PrintStream printStream = new PrintStream(new File(""), "");
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();
		}
			
	}

}
