package datnt.runsystem.com.io.buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {
	
	public void execute() throws IOException {
		
		String text = "Buffered Output Stream Demo";
		
		byte[] buffer = text.getBytes();
		
		FileOutputStream fileOutputStream = new FileOutputStream("src/datnt/runsystem/com/io/buffer/output");
		
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		
		bufferedOutputStream.write(buffer);
		
		bufferedOutputStream.flush();
		
		bufferedOutputStream.close();
		
		fileOutputStream.close();
		
	}

}
