package framework.KeywordDrivenPOI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActionKeywords {
	public static WebDriver driver;
	@Test(priority=0)
	public static void openBrowser() {
		driver=new ChromeDriver();
		
	}
	@Test(priority=1)
	public static void navigate() {
		//Goto the URL
		driver.get("https://www.saucedemo.com/");
	}
	@Test(priority=2)
	public static void inputUserName() throws InterruptedException {
		//Fill username textBox with input
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		
	}
	@Test(priority=3)
	public static void inputPassword() throws InterruptedException {
		//Fill password textBox with input
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
	}
	
	@Test(priority=4)
	public static void clickSigin() {
		//Click on the login button
		driver.findElement(By.id("login-button")).click();
		
	}
	@Test(priority=5)
	public static void closeBrowser() {
		
		driver.close();
		
	}
	

}
