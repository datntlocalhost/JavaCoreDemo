package datnt.runsystem.com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	
	public void execute() throws IOException, ClassNotFoundException {
		
		System.out.println("Tao object stream.");
		this.createObjectStream();

		System.out.println("Lay object stream.");
		this.getObjectStream();
		
	}
	
	/**
	 * Thực hiện việc chuyển đối tượng laptop sang dạng byte stream và lưu vào file  
	 */
	private void createObjectStream() throws IOException {
		
		LaptopSerializable dell = new LaptopSerializable("Dell", 800, "Viet Nam");
		
		FileOutputStream fileOutputStream = new FileOutputStream("src/datnt/runsystem/com/serializable/laptop");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		//ghi dữ liệu của dell vào file dưới dạng byte stream.
		objectOutputStream.writeObject(dell);
		
		objectOutputStream.close();
		fileOutputStream.close();
	}
	
	/**
	 * Thực hiện việc đọc từ file và cast từ dạng byte stream sang đối tượng
	 */
	private void getObjectStream() throws IOException, ClassNotFoundException {
		LaptopSerializable dell;
		FileInputStream fileInputStream = new FileInputStream("src/datnt/runsystem/com/serializable/laptop");
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		//đọc dữ liệu từ file sau đó cast và gán cho dell
		dell = (LaptopSerializable)objectInputStream.readObject();
		
		System.out.println("Thong tin laptop: " + dell.getInfo());
		
		objectInputStream.close();
		fileInputStream.close();
	}
}
