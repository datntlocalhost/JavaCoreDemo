package datnt.runsystem.com.util.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
	
	public void execute() {
		
		Locale locale = new Locale("en", "US");
		ResourceBundle resourceBundle = ResourceBundle.getBundle("datnt.runsystem.com.util.resourcebundle.locale",locale);
		
		System.out.println(resourceBundle.getString("greetings"));
		
		locale = new Locale("vi", "VN");
		resourceBundle = ResourceBundle.getBundle("datnt.runsystem.com.util.resourcebundle.locale",locale);
		System.out.println(resourceBundle.getString("greetings"));
		
		//Lấy các key có trong resource
		for (String key : resourceBundle.keySet()) {
			System.out.println(key);
		}
	}

}
