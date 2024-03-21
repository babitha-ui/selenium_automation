package webdriver_scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test20_NewTab_New_window {

	public static void main(String[] args) throws InterruptedException, AWTException {
	// TC1:Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//TC2:Go to the test URL https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
		
		driver.get("https://smallpdf.com/word-to-pdf");
		
	//wait time
		
		Thread.sleep(2000);
	
	//TC3:manage the browser window to minimized to maximize
		
		driver.manage().window().maximize();
		
		
		
    //wait time
		
		Thread.sleep(2000);
		
  
		
		Robot r = new Robot();
	//scroll one step down
	
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	Thread.sleep(2000);
	
	//scroll one step up
	r.keyPress(KeyEvent.VK_PAGE_UP);
	r.keyRelease(KeyEvent.VK_PAGE_UP);
	Thread.sleep(2000);
	
	//scroll to botton
	r.keyPress(KeyEvent.VK_END);
	r.keyRelease(KeyEvent.VK_END);
	Thread.sleep(5000);
	//scroll to the top
	r.keyPress(KeyEvent.VK_END);
	r.keyRelease(KeyEvent.VK_HOME);
	Thread.sleep(5000);
	//open a new tab
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_CONTROL);
	
	Thread.sleep(5000);
	//go to test URL
	driver.navigate().to("https://www.bhanusaii.worpress.com");
	//close the tab
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_W);
	r.keyRelease(KeyEvent.VK_W);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	//create new window
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	
	
	//close the browser	
		
	driver.close();
		
		
		
		
		
		
	}

}
