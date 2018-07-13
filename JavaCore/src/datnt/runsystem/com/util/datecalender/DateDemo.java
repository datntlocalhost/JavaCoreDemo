package datnt.runsystem.com.util.datecalender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	
	
	public void excute() {
		
		/**
		 * Khởi tạo đối tượng calendar mô tả thời điểm hiện tại
		 * của máy tính đang chạy
		 */
		Calendar calendar = Calendar.getInstance();
		
		/**
		 * Khai báo một biến Date để lưu trữ thông tin ngày tháng của hệ thống
		 * calender.getTime() lấy thời gian hiện tại của hệ thống
		 */
		Date date = calendar.getTime();
		
		//hiển thị thời gian hiện tại
		System.out.println(date);
		
		/* Hiển thị ngày trong tháng hiện tại
		 * get(int field) sẽ trả về giá trị thời gian theo field
		 * được truyền vào.
		 */
		System.out.println("Ngay: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		/* Thay đổi thời gian của hệ thống.
		 * set(int field, int value) thay đổi thời gian theo field
		 * được truyền vào với value giá trị sẽ thay đổi.
		 */
		calendar.set(Calendar.DAY_OF_MONTH, 5); //Đổi thành tháng 5
		System.out.println(calendar.getTime());
		
		/* Cộng trừ thời gian của hệ thống.
		 * add(int field, int amount)
		 */
		calendar.add(Calendar.DAY_OF_MONTH, 5); //tăng lên 5 ngày
		System.out.println(calendar.getTime());
		
		/* Thay đổi định dạng hiển thị thời gian.
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date));
		
		/* HH định dạng 24h
		 * hh định dạng 12h
		 */
		sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(date));
		
		/* aaa định dạng AM/PM
		 */
		sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss aaa");
		System.out.println(sdf.format(date));
		
	}

}
