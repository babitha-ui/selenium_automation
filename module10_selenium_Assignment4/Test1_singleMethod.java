package module10_selenium_Assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Write a TestScript to execute Multiple Classes from different packages in Maven

public class Test1_singleMethod {
	
	@Test
	public void verifySDLogin() throws InterruptedException {
	
		        //launch the chrome Browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				//Goto the URL
				driver.get("https://www.saucedemo.com/");

				Thread.sleep(2000);
				//manage the browser window to maximize
				driver.manage().window().maximize();
				
				//Fill username textBox with input
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				Thread.sleep(2000);
				//Fill password textBox with input
				
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				Thread.sleep(2000);
				
				//Click on the login button
				driver.findElement(By.id("login-button")).click();
				
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
				
				//close the browser
				driver.close();
 
	}

}
