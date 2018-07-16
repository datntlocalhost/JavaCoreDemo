package datnt.runsystem.com.io.file;

import java.io.File;

public class FileDemo {
	
	
	public void execute() throws Exception {
		
		File folder = new File("src/datnt/runsystem/com/io/file/folder");
		File file = new File("src/datnt/runsystem/com/io/file/file.txt");
		
		//Nếu file chưa tồn tại
		if (!file.exists()) {
			file.createNewFile(); //Tạo mới file
			
		}
		
		/* boolean mkdirs() - Kiểm tra và tạo mới folder nếu chưa đc tạo
		 * return true nếu folder chưa có và tạo mới
		 * return false nếu folder đã tồn tại
		 */
		if (folder.mkdirs()) {
			System.out.println("Da tao tu muc folder.");
		}
		
		//Kiểm tra cấp quyền thực thi
		if (file.canExecute()) {
			System.out.println("File duoc cap quyen thuc thi.");
		}
		
		//Kiểm tra cấp quyền write
		if (file.canWrite()) {
			System.out.println("File co the write.");
		}
		
		//Kiểm tra cấp quyền đọc
		if (file.canRead()) {
			System.out.println("File co the doc.");
		}
		
		//Lấy tên của file
		System.out.println("Ten file: " + file.getName());
		
		//Lấy đường dẫn tương đối của thư mục mà file được đặt trong đó
		System.out.println("Lay duong dan thu muc: " + file.getParent());
		
		//Lấy đường dẫn tương đối của file 
		System.out.println("Lay duong dan cua file: " + file.getPath());
		
		//lấy đường dẫn tuyệt đối của file
		System.out.println("Lay duong dan cua file: " + file.getAbsolutePath());
		
		//đổi tên file
		System.out.println("Doi ten file: " + file.renameTo(new File("src/datnt/runsystem/com/io/file/fileRename.txt")));
		
	}

}
