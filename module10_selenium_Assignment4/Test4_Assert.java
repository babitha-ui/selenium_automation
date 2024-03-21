package module10_selenium_Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4_Assert {

	//public static void main(String[] args) throws InterruptedException {
	
	public WebDriver driver;
	@Test(priority=1)
	public void setUp1() throws InterruptedException {
	
		        //launch the chrome Browser
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
	}
	@Test(priority=2)
	public void gotoURL1() throws InterruptedException {
		
				//Goto the URL
				driver.get("https://www.saucedemo.com/");

				Thread.sleep(2000);
	}
	@Test(priority=3)
	public void window_Maximize1() {
				//manage the browser window to maximize
				driver.manage().window().maximize();
	}
	@Test(priority=4)
	public void type_UserName1() throws InterruptedException {
				
				//Fill username textBox with input
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				Thread.sleep(2000);
	}
	@Test(priority=5)
	public void type_Password1() throws InterruptedException {
				//Fill password textBox with input
				
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				Thread.sleep(2000);
	}
	@Test(priority=6)
	public void click_Login1() {			
				//Click on the login button
				driver.findElement(By.id("login-button")).click();
	}
	@Test(priority=7)
	public void verifySDLogin2() {
				//verify login
				String expectedURL="https://www.saucedemo.com/inventory.html";
				String actualURL=driver.getCurrentUrl();
				
				Assert.assertEquals(actualURL, expectedURL);

	}
	@Test(priority=8)
	public void tearDown1() {			
				//close the browser
				driver.close();
	}
 
	}


