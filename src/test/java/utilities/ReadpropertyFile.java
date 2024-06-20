package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("C:\\Users\\priya\\eclipse-workspace\\DouglasTestAutomation\\src\\test\\resources\\configfiles\\config.properties");
		Properties p = new Properties();
		Properties locators = new Properties();
		p.load(fr);
		FileReader fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\loctors.properties");
		locators.load(fr1);
	}


}
