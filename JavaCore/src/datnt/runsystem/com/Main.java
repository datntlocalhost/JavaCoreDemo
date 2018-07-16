package datnt.runsystem.com;

import java.io.IOException;

import datnt.runsystem.com.exceptions.IOExceptionDemo;
import datnt.runsystem.com.io.PrintWriterDemo;
import datnt.runsystem.com.io.buffer.BufferedInputStreamDemo;
import datnt.runsystem.com.io.buffer.BufferedOutputStreamDemo;
import datnt.runsystem.com.io.file.FileDemo;
import datnt.runsystem.com.io.file.FileInputStreamDemo;
import datnt.runsystem.com.io.file.FileOutputStreamDemo;
import datnt.runsystem.com.lang.StringFamilyDemo;
import datnt.runsystem.com.serializable.SerializableDemo;
import datnt.runsystem.com.util.enums.EnumDemo;
import datnt.runsystem.com.util.properties.PropertyDemo;
import datnt.runsystem.com.util.resourcebundle.ResourceBundleDemo;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		(new StringFamilyDemo()).execute();
	}
}
