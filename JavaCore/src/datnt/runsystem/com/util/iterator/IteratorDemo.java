package datnt.runsystem.com.util.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {
	/**
	 * Demo sử dụng iterator để duyệt danh sách và xóa các phần tử trong danh sách
	 */
	public static void demo() {
		
		//Khởi tạo một danh sách 
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("line 1","line 2","line 3"));
		
		//Biến iterator lưu iterator bắt đầu từ phần tử đầu tiên của list
		Iterator<String> iterator = list.iterator();
		
		//Sử dụng iterator để hiển thị các phần tử trong list
		System.out.println("Danh sach ban dau la:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//trỏ iterator đến phần tử đầu của list
		iterator = list.iterator();
		
		//xóa phần tử có giá tị là "line 1" ra khỏi list
		while (iterator.hasNext()) {
			if(iterator.next().equals("line 1")) {
				iterator.remove();
			}
		}
		
		iterator = list.iterator();
		
		//hiển thị lại danh sách sau khi xóa.
		System.out.println("Danh sach sau khi xoa la:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
