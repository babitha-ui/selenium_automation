package webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14_partialLinkTest {

	public static void main(String[] args) throws InterruptedException {
		//Launch the chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//wait time
		Thread.sleep(2000);
		//To get the URL of the page

		driver.get(" https://www.facebook.com/");
		//wait time
		Thread.sleep(2000);

		//To click on the create new account

		driver.findElement(By.partialLinkText("Create")).click();
		
		//to close the browser
		driver.close();
	}

}
