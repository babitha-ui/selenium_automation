package topic_TESTNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test8_VP2 {

	//public static void main(String[] args) throws InterruptedException {
	
	public WebDriver driver;
	@Test(priority=1)
	public void setUp() throws InterruptedException {
	
		        //launch the chrome Browser
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				
	}
	@Test(priority=2)
	public void gotoURL() throws InterruptedException {
		
				//Goto the URL
				driver.get("https://www.selenium.dev/");

				Thread.sleep(2000);
	}
	@Test(priority=3)
	public void window_Maximize() {
				//manage the browser window to maximize
				driver.manage().window().maximize();
	}
	public void verifySDLogin() {
		
	
			
				//verify login
				String expectedText="Selenium automates browsers. That's it!";
				String actualText =driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates')]")).getText();
			
				if(actualText.equals(expectedText))
				{
				System.out.println("Test passed");	
				}
				else {
			    System.out.println("Test failed");
				}
	}
	@Test(priority=8)
	public void tearDown() {			
				//close the browser
				driver.close();
	}
 
	}


