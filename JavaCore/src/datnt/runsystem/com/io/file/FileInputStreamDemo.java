package datnt.runsystem.com.io.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	
	
	public void execute() throws IOException {
		
		FileInputStream inputStream = new FileInputStream("src/datnt/runsystem/com/io/fileinput/input");
		
		//Số bytes có để đ�?c từ file
		System.out.println("So bytes co the doc: " + inputStream.available());
		
		//�?�?c từng bytes của file
		System.out.println((char)inputStream.read());
		
		
		byte[] buffer = new byte[4]; //khởi tạo buffer có độ dài 4 byte
		
		/* �?�?c và ghi vào buffer
		 * read(byte[] b)
		 * b - buffer
		 */
		inputStream.read(buffer);
		
		for (byte b : buffer) {
			System.out.print((char)b);
		}
		
		
		System.out.println("\n====================");
		buffer = new byte[10]; //khởi tạo buffer có độ dài 10 byte
		
		/* read(byte[] b, int off, int len)
		 * b   - buffer
		 * off - vị trí offset bắt đầu ghi của buffer
		 * len - số byte sẽ đ�?c từ file
		 */
		inputStream.read(buffer, 3, 5);
		
		for (byte b : buffer) {
			if (b != 0) {
				System.out.print((char)b);
			}
			else {
				System.out.print("-");
			}
		}
		
		//close file
		inputStream.close();
	}

}
