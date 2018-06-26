package test;



import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;



/**
 * @author minya
 *
 */
public class FirstSelenium {
	public static WebDriver driver;
	public static String browser;
	public static void main(String[] args) throws InterruptedException,NoSuchElementException, IOException {
		
		PropertiesFile.readPropertiesFile();
			setConfig();
			runTest();
			PropertiesFile.writePropertiesFile();
	}
	
	
	public static void setBrowser() {
		browser = "Chrome";
		
		
	}
	
	
	public static void setConfig() {
		String path = System.getProperty("user.dir");
		
		if(browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", path + "\\resource\\geckodriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
	}
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", path + "\\resource\\chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
	}
	
	public static void runTest() throws InterruptedException {
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);  // Let the user actually see something!
		driver.quit();
	}

}
