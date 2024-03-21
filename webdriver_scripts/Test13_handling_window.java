package webdriver_scripts;

import java.awt.Window;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13_handling_window {

	public static void main(String[] args) throws InterruptedException {
		// TC1:Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// TC2:Go to Test URL
		driver.get("https://demoqa.com/browser-windows");

		// wait time 5 sec 1sec = 1000ms
		Thread.sleep(5000);

		// driver.manage().window().maximize();

		driver.findElement(By.id("tabButton")).click();

		// Handle tabs

		ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
		// wait time 5 sec 1sec = 1000ms
		Thread.sleep(2000);
		
		//Switch to 1st window
		driver.switchTo().window(window.get(1));
		
		// wait time 5 sec 1sec = 1000ms
		Thread.sleep(2000);
		
		//close the browser
		
		driver.close();
		// wait time 5 sec 1sec = 1000ms
		  Thread.sleep(2000);
		
		//swich to 0th window
		driver.switchTo().window(window.get(0));
		
		// wait time 5 sec 1sec = 1000ms
		  Thread.sleep(2000);
		
		
		//close the browser
		
		driver.close();
		
		

	}

}
