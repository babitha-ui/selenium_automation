package webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9_Locators {

	public static void main(String[] args) throws InterruptedException {
		
		
			// TC1:Launch Chrome Browser
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//TC2:Go to Test URL
	        driver.get("https://www.facebook.com/");
	        
	        //wait time 5 sec 1sec = 1000ms
	        Thread.sleep(5000);
	        
	        //click on Create new account Button
            driver.findElement(By.linkText("Create new account")).click();
          //wait time 5 sec 1sec = 1000ms
	        Thread.sleep(2000);
            //fill the firstname testbox with input
            driver.findElement(By.name("firstname")).sendKeys("Babitha");
          //wait time 5 sec 1sec = 1000ms
	        Thread.sleep(2000);
            //fill the lastname testbox with input
            driver.findElement(By.name("lastname")).sendKeys("Jamanjyothi");
          //wait time 5 sec 1sec = 1000ms
	        Thread.sleep(2000);
            //
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("903263659");
          //wait time 5 sec 1sec = 1000ms
	        Thread.sleep(2000);
            driver.findElement(By.name("reg_passwd__")).sendKeys("babitha123");
          //wait time 5 sec 1sec = 1000ms
	        Thread.sleep(2000);
            driver.findElement(By.id("day")).click();
          //wait time 5 sec 1sec = 1000ms
	        Thread.sleep(2000);
}

}