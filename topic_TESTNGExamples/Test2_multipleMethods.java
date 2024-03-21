package topic_TESTNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2_multipleMethods {

	//public static void main(String[] args) throws InterruptedException {
	
	public WebDriver driver;
	@Test
	public void asetUp() throws InterruptedException {
	
		        //launch the chrome Browser
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
	}
	@Test
	public void bgotoURL() throws InterruptedException {
		
				//Goto the URL
				driver.get("https://www.saucedemo.com/");

				Thread.sleep(2000);
	}
	@Test
	public void cwindow_Maximize() {
				//manage the browser window to maximize
				driver.manage().window().maximize();
	}
	@Test
	public void dtype_UserName() throws InterruptedException {
				
				//Fill username textBox with input
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				Thread.sleep(2000);
	}
	@Test
	public void etype_Password() throws InterruptedException {
				//Fill password textBox with input
				
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				Thread.sleep(2000);
	}
	@Test
	public void fclick_Login() {			
				//Click on the login button
				driver.findElement(By.id("login-button")).click();
	}
	@Test
	public void gverifySDLogin() {
				//verify login
				String expectedURL="https://www.saucedemo.com/inventory.html";
				String actualURL=driver.getCurrentUrl();
				
				
				if(expectedURL.equalsIgnoreCase(actualURL))
				{
					System.out.println("test passed-Login success");
				}
				else
				{
					System.out.println("test failed-login failed");
				}
	}
	@Test
	public void htearDown() {			
				//close the browser
				driver.close();
	}
 
	}


