/**
 * 
 */
package HtmlunitDriver;

import java.lang.reflect.Field;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

/**
 * @author minya
 *
 */
public class HtmlUnitDriverTest {
	public static void main(String[] args) throws Exception {
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		driver.get("http://www.google.com");
		System.out.println("Page Title is: "+ driver.getTitle());
		
		WebClient client = (WebClient) get(driver,"webClient");
		System.out.println("Browser Version is: " + client.getBrowserVersion());
		System.out.println("Is Browser Chrome: "+client.getBrowserVersion().isChrome());
		System.out.println("Is Browser Firefox: "+client.getBrowserVersion().isFirefox());
		driver.quit();
	}

	/**
	 * @param driver
	 * @param string
	 * @return field 
	 * @throws Exception 
	 */
	private static Object get(Object object, String field) throws Exception {
		Field f = object.getClass().getDeclaredField(field);
		f.setAccessible(true);
		return f.get(object);
	}

}
