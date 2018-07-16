package datnt.runsystem.com.lang;

public class StringFamilyDemo {
	
	public void execute() {
		
		String string = "string"; 
		this.string(string);
		
		StringBuffer stringBuffer = new StringBuffer("string buffer");
		this.stringBuffer(stringBuffer);
		
		StringBuilder stringBuilder = new StringBuilder("string builder");
		this.stringBuilder(stringBuilder);
		
		System.out.println(string);
		System.out.println(stringBuffer);
		System.out.println(stringBuilder);
		
	}
	
	/**
	 * Phương thức thực hiện thêm nối chuỗi khác vào chuỗi đã truyền vào
	 * Nhưng s trong phương thức string là một chuỗi copy của string trên hàm main
	 * Nên chuỗi string trên hàm main sẽ không thay đổi
	 * 
	 * @param String s
	 */
	private void string(String s) {
		s = s + " new String";
	}
	
	/**
	 * stringBuffer trong phương thức này trỏ tới cùng vùng nhớ của stringBuffer trên main
	 * nên khi ta nối thêm chuỗi khác thì stringBuffer trên main cũng thay đổi theo.
	 * và sử dụng string buffer trong đa luồng.
	 * 
	 * @param StringBuffer stringBuffer
	 */
	private void stringBuffer(StringBuffer stringBuffer) {
		//Thêm chuỗi mới vào cuối chuỗi hiện tại
		stringBuffer.append(" new String");
		
		//xóa chuỗi từ vị trí 0 đến vị trí 2
		stringBuffer.delete(0, 2);
		
	}
	
	/**
	 * cũng giống như string buffer nhưng string builder không an toàn luồng
	 * 
	 * @param StringBuilder stringBuilder
	 */
	private void stringBuilder(StringBuilder stringBuilder) {
		stringBuilder.append(" new String");
	}

}
