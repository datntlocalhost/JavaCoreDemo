package datnt.runsystem.com.util.properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
	
	
	public void execute() throws IOException {
		
		FileReader fileReader = new FileReader("src/datnt/runsystem/com/util/properties/configs.properties");
		
		Properties properties = new Properties();
		
		properties.load(fileReader);
		
		System.out.println(properties.getProperty("author"));
		System.out.println(properties.getProperty("main"));
		System.out.println(properties.getProperty("version"));
		
		properties.setProperty("email", "datntuit@gmail.com");
		properties.setProperty("address", "TP HCM");
		
		properties.store(new FileWriter("src/datnt/runsystem/com/util/properties/newConfigs.properties"), "");
	}
	
	

}
