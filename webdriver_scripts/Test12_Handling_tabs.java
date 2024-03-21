package webdriver_scripts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test12_Handling_tabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TC1:Launch Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// TC2:Go to Test URL
		driver.get("https://demoqa.com/browser-windows");

		// wait time 5 sec 1sec = 1000ms
		Thread.sleep(5000);

		// driver.manage().window().maximize();

		driver.findElement(By.id("tabButton")).click();

		// Handle tabs

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		// wait time 5 sec 1sec = 1000ms
		Thread.sleep(2000);

		// Switch from oth tab to first tab

		driver.switchTo().window(tabs.get(1));
		// wait time 5 sec 1sec = 1000ms
		Thread.sleep(2000);

		// get the plain text in to console

		String ptext = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(ptext);
		// wait time 5 sec 1sec = 1000ms
		Thread.sleep(2000);
		
		//close the 1st tab
		driver.close();
		// wait time 5 sec 1sec = 1000ms
		Thread.sleep(2000);
		
		
		//swith to 0th tab
		driver.switchTo().window(tabs.get(0));
		
		//close the 0th tab
		
		driver.close();
		

	}

}
