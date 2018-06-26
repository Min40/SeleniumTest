/**
 * 
 */
package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.FirstSelenium;

/**
 * @author minya
 *
 */
public class PropertiesFile {
	public static Properties prop = new Properties();
	public static String path = System.getProperty("user.dir");
	
	 FirstSelenium first = new FirstSelenium();
	public static void main(String[] args) throws IOException {
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
	}
	public static void readPropertiesFile()  {
		
	
	try {
		
		InputStream input = new FileInputStream(path + "\\src\\config\\config.properties");
		prop.load(input);
		FirstSelenium.browser = prop.getProperty("browser");
		System.out.println(FirstSelenium.browser);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
	public static void writePropertiesFile() throws IOException {
		try {
			
		
		OutputStream out = new FileOutputStream(path + "\\src\\config\\config.properties");
		prop.setProperty("browser", "Chrome");
		prop.store(out, null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
