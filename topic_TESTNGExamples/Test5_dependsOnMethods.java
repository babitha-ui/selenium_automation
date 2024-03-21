package topic_TESTNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5_dependsOnMethods {

	//public static void main(String[] args) throws InterruptedException {
	
	public WebDriver driver;
	@Test
	public void setUp() throws InterruptedException {
	
		        //launch the chrome Browser
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
	}
	@Test(dependsOnMethods="setUp")
	public void gotoURL() throws InterruptedException {
		
				//Goto the URL
				driver.get("https://www.saucedemo.com/");

				Thread.sleep(2000);
	}
	@Test(dependsOnMethods="gotoURL")
	public void window_Maximize() {
				//manage the browser window to maximize
				driver.manage().window().maximize();
	}
	@Test(dependsOnMethods="window_Maximize")
	public void type_UserName() throws InterruptedException {
				
				//Fill username textBox with input
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				Thread.sleep(2000);
	}
	@Test(dependsOnMethods="type_UserName")
	public void type_Password() throws InterruptedException {
				//Fill password textBox with input
				
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				Thread.sleep(2000);
	}
	@Test(dependsOnMethods="type_Password")
	public void click_Login() {			
				//Click on the login button
				driver.findElement(By.id("login-button")).click();
	}
	@Test(dependsOnMethods="click_Login")
	public void verifySDLogin() {
				//verify login
				String expectedURL="https://www.saucedemo.com/inventory.html";
				String actualURL=driver.getCurrentUrl();
				
				Assert.assertEquals(actualURL, expectedURL);

	}
	@Test(dependsOnMethods="verifySDLogin")
	public void tearDown() {			
				//close the browser
				driver.close();
	}
 
	}


