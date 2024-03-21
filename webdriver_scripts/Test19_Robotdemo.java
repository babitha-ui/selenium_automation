package webdriver_scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test19_Robotdemo {

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
		
   //TC4:Click on the choose file button
		
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		
	//Load the path of file in clipboard
		
		StringSelection s= new StringSelection("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\s4 Hana Conversion.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
	//send the data from clipboard to screen
	//paste operation CONTROL+V
		//Implement java robot
		
		Robot r = new Robot();
		//paste
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		//Enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//Thread.sleep(15000);
		
		//driver.findElement(By.xpath("//span[text()='Download']")).click();
		WebElement clickDownload= new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Download']")));
		clickDownload.click();
		Thread.sleep(8000);
		
		driver.close();
		
		
		//java wait
		//Thread.sleep(2000);
		
		//selenium implicit wait
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		//selenium explicit wait
		//in selenium 3
		//WebDriverWait w=new WebDriverWait(driver,100)
		//w.until(ExpectedConditions.
		//invisibilityOfElementLocated(By.className("")));
		
		//WebElement clickDownload= new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Download']")));
		
		
		
		
		
		
	}

}
