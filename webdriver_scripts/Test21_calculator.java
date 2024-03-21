package webdriver_scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21_calculator {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TC1:Launch Chrome Browser
				//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				//WebDriver driver = new ChromeDriver();
			//TC2:Go to the test URL https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
				
				//driver.get("https://smallpdf.com/word-to-pdf");
				
			//wait time
				
				//Thread.sleep(2000);
			
			//TC3:manage the browser window to minimized to maximize
				
			//	driver.manage().window().maximize();
				
				
				
		    //wait time
				
			//	Thread.sleep(2000);
				
		  Runtime.getRuntime().exec("Calc.exe");
				
				Robot r = new Robot();
				
				r.keyPress(KeyEvent.VK_7);
				r.keyRelease(KeyEvent.VK_7);
				Thread.sleep(2000);
				
				r.keyPress(KeyEvent.VK_ADD);
				r.keyRelease(KeyEvent.VK_ADD);
				Thread.sleep(2000);
				
				r.keyPress(KeyEvent.VK_5);
				r.keyRelease(KeyEvent.VK_5);
				Thread.sleep(2000);
				
				r.keyPress(KeyEvent.VK_EQUALS);
				r.keyRelease(KeyEvent.VK_EQUALS);
				Thread.sleep(2000);
				
				r.keyPress(KeyEvent.VK_ALT);
				r.keyPress(KeyEvent.VK_F4);
				r.keyPress(KeyEvent.VK_F4);
				r.keyPress(KeyEvent.VK_ALT);
				
				

	}

}
