package webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17_HndlingFrames {

	public static void main(String[] args) throws InterruptedException {
		
			// TC1:Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
			//TC2:Go to the test URL https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
				
				driver.get("https://demoqa.com/frames");
				
			//wait time
				
				Thread.sleep(2000);
			
			//TC3:manage the browser window to minimized to maximize
				
				driver.manage().window().maximize();
				
	        //wait time
				
				Thread.sleep(2000);
				
			//TC4:switch to frame
				
				driver.switchTo().frame("frame1");
				
				Thread.sleep(2000);
			//TC4:to get the text inside the frame
				
				String ptext = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
				
				System.out.println(ptext);
				
			//switch to default content
				
				driver.switchTo().defaultContent();
				
			//TC5: swich to frame2
				
				driver.switchTo().frame("frame2");
				
			//TC6: get the text displayed on console fram frame2
				
				String ptext2 = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
				System.out.println(ptext2);
				
				
				
			//close the browser
				
				driver.close();

	}

}
