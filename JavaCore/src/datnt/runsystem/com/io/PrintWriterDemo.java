package datnt.runsystem.com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriterDemo {
	
	
	public void execute() throws FileNotFoundException  {
		
		FileOutputStream file = new FileOutputStream("src/datnt/runsystem/com/io/printwriter.txt");
		
		PrintWriter printWriter = new PrintWriter(file, true);
		
		printWriter.println("Print Writer demo");
		
		printWriter.write("Print Writer Demo.");
		
		printWriter.close();
		
	}

}
