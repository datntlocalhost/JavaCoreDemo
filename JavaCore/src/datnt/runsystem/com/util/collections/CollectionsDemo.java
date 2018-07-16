package datnt.runsystem.com.util.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	
	
	public void excute() {
		
		/**
		 * Khởi tạo một danh sách rỗng
		 */
		ArrayList<String> arrayList = new ArrayList<>();
		
		//chèn phần tử vào danh sách
		for (int i = 0; i < 10; i++) {
			arrayList.add(String.valueOf(i));
		}
		
		//hiển thị các phần tử trong danh sách
		arrayList.forEach(System.out::println);
		
		/* Tìm kiếm index của phần tử trong danh sách
		 * với collections
		 */
		int index = Collections.binarySearch(arrayList, "5");
		System.out.println("index: " + index);
		
	}

}
