package testNG.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SDLoginTestNG {
	WebDriver driver;
	//Launch the chrome Browser
	@BeforeClass
	public void setUpBrowser() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	
	}
	@AfterClass
	public void tearDownBrowser() {
		driver.close();
		
	}
	@Test(priority=0)
	public void getURL() throws InterruptedException {
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	}
	@Test(priority=1)
	public void usernametext() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void passwordText() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void login() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	@Test(priority=4)
	public void verifyLogin() {
		String ActualURL1="https://www.saucedemo.com/inventory.html";
		String ExpectedURL=driver.getCurrentUrl();
		/*
		 * if(ActualURL1.equals(ExpectedURL)) { System.out.println("test Passed"); }
		 * else { System.out.println("Test failed"); }
		 */
		Assert.assertEquals(ActualURL1, ExpectedURL);
				
	}
}
