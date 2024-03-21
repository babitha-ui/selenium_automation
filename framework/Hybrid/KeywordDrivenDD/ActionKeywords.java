package framework.Hybrid.KeywordDrivenDD;

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
	public static void navigate(String url) {
		//Goto the URL
		driver.get(url);
	}
	@Test(priority=2)
	public static void inputUserName(String uname) throws InterruptedException {
		//Fill username textBox with input
		driver.findElement(By.id("user-name")).sendKeys(uname);
		Thread.sleep(2000);
		
	}
	@Test(priority=3)
	public static void inputPassword(String pwd) throws InterruptedException {
		//Fill password textBox with input
		
		driver.findElement(By.id("password")).sendKeys(pwd);
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
