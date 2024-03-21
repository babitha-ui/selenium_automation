package webdriver_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test7_NewTab {

	public static void main(String[] args) throws InterruptedException {
/*  
 * Test case --Automate creating new tab
 * TS1: go to test URL https://www.amazon.in/
 * TS2: Manage the Browser window to be Maximized
 * TS3: create a new tab
 * Ts4: Close the active Browser window*/
		
		
//TS1: go to test URL https://www.amazon.in/
System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
WebDriver driver = new FirefoxDriver();
//wait time
Thread.sleep(3000);

//TS2: go to test URL https://www.amazon.in/

driver.get("https://www.amazon.in/");
//wait time
Thread.sleep(3000);

//TS3: create a new tab

driver.switchTo().newWindow(WindowType.TAB);
//wait time
Thread.sleep(3000);


//Ts4: Close the active Browser window
//driver.close();

//to close all the entire Browser Session

driver.quit();

	}

}
