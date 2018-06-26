/**
 * 
 */
package phantomjs;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * @author minya
 *
 */
public class PhantomJSTest {
	public static void main(String[] args) {
		System.setProperty("phantomjs.binary.path", System.getProperty("user.dir")+"\\resource\\phantomjs\\phantomjs.exe");
		PhantomJSDriver driver = new PhantomJSDriver();
		driver.get("http://www.google.com");
		System.out.println("Tiltle of the web page is: " + driver.getTitle());
		driver.quit();
	}

}
