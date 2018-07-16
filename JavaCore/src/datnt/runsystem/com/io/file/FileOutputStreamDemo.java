package datnt.runsystem.com.io.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	
	public void execute() throws IOException {
		
		
		String text = "File Output Stream Demo";
		
		//convert string sang mảng byte
		byte[] buffer = text.getBytes();
		
		//Tạo một file output mới
		FileOutputStream fileOutputStream = new FileOutputStream("src/datnt/runsystem/com/io/file/output");
		
		//ghi dữ liệu từ buffer ra file
		fileOutputStream.write(buffer);
		
		//close file
		fileOutputStream.close();
	}

}
