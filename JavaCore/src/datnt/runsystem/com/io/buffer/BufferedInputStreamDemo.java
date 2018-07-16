package datnt.runsystem.com.io.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	
	
	public void execute() throws IOException {
		
		FileInputStream inputStream = new FileInputStream("src/datnt/runsystem/com/io/buffer/input");
		
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
		
		char c;
		
		while ((c = (char) bufferedInputStream.read()) != -1) {
			System.out.print(c);
		}
		
		bufferedInputStream.close();
		inputStream.close();
		
	}

}
