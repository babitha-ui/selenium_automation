package webdriver_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test5_EdgeBrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		
/*Test case --Automate browser navigation
 *TS1: Launch chrome browser
 *TS2: goto test URL https://www.amazon.in
 *TS3:Navigate to URL https://www.flipkart.com
 *TS4: Navigate one step back to amazon website
 *TS5: Navigate one step forward to flipkart website
 *TS6: Reload Current Active page
 *TS7: close Active Browser window
 */
		
//TS1: Launch chrome browser
System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();

//TS2: goto test URL https://www.amazon.in

driver.get("https://www.amazon.in/");

//wait time
Thread.sleep(3000);

//TS3:Navigate to URL https://www.flipkart.com


driver.navigate().to("https://www.flipkart.com/?");
//wait time
Thread.sleep(3000);

//TS4: Navigate one step back to amazon website

driver.navigate().back();
//wait time
Thread.sleep(3000);

//TS5: Navigate one step forward to flipkart website
driver.navigate().forward();
//wait time
Thread.sleep(3000);

//TS6: Reload Current Active page

driver.navigate().refresh();
//wait time
Thread.sleep(3000);

//TS7: close Active Browser window

driver.close();
	}

}
