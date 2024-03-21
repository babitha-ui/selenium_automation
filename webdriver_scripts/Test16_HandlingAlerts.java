package webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16_HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TC1:Launch Chrome Browser
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		//TC2:Go to the test URL https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
			
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			
		//wait time
			
			Thread.sleep(2000);
		
		//TC3:manage the browser window to minimized to maximize
			
			driver.manage().window().maximize();
			
        //wait time
			
			Thread.sleep(2000);
		
		//TC4:To perform operation on element which is inside the frame,we have to switch to that frame
			
			driver.switchTo().frame(1);
			
        //wait time
			
			Thread.sleep(2000);
			
		//TC5: click on the button alert
			
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			
        //wait time
			
			Thread.sleep(2000);
			
		//TC6:send data into alert
			
			driver.switchTo().alert().sendKeys("babitha");
			
			Thread.sleep(2000);
			
			driver.switchTo().alert().accept();
			
		
			
		//TC7: close the browser
			 
			driver.close();
			
			
	}

}
