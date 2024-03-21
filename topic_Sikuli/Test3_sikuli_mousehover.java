package topic_Sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3_sikuli_mousehover {
  @Test
  public void mouse_Hover() throws InterruptedException, FindFailed {
	//launch the chrome Browser
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			//Goto the URL
			driver.get("https://www.flipkart.com/");

			Thread.sleep(2000);
			//manage the browser window to maximize
			driver.manage().window().maximize();
			//move mouse towards fashion
			
			driver.findElement(By.xpath("//label[contains(text(),'Enter Email')]/preceding::*[6]")).click();
			
			Thread.sleep(2000);
			Screen s=new Screen();
			s.hover("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\Sikuli_Locators\\flipkart_login.PNG");
			s.doubleClick("E:\\\\INTELLIPAT_COURSES\\\\seleniumConcepts\\\\Automation backup\\\\myAutomationProjectDemo\\\\Sikuli_Locators\\\\flipkart_login.PNG");
  }
}
