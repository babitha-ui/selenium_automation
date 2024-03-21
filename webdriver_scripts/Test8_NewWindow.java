package webdriver_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8_NewWindow {

	public static void main(String[] args) throws InterruptedException {
/*  
 * Test case --Automate creating new tab
 * TS1: go to test URL https://www.amazon.in/
 * TS2: Manage the Browser window to be Maximized
 * TS3: create a new tab
 * Ts4: Close the active Browser window*/
		
		
//TS1: go to test URL https://www.amazon.in/
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//wait time
Thread.sleep(3000);

//TS2: go to test URL https://www.amazon.in/

driver.get("https://www.amazon.in/");
//wait time
Thread.sleep(3000);

//TS3: create a new tab

driver.switchTo().newWindow(WindowType.WINDOW);
//wait time
Thread.sleep(3000);


//Ts4: Close the active Browser window
//driver.close();

//to close all the entire Browser Session

driver.quit();

	}

}
