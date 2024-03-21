package webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18_HandlingNestedFrames {

	public static void main(String[] args) throws InterruptedException {
		
			// TC1:Launch Chrome Browser
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
			//TC2:Go to the test URL https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
				
				driver.get("https://demoqa.com/nestedframes");
				
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
				
				String ptext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
				
				System.out.println(ptext);
				
				Thread.sleep(2000);
				
			//TC5: switch to frame2
				
				driver.switchTo().frame(0);
				
				Thread.sleep(2000);
				
			//TC6: get the text displayed on console frame2
				
				String ptext2 = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
				System.out.println(ptext2);
				Thread.sleep(2000);
				
				
				
			//close the browser
				
				driver.close();
				//to interact with 1st frame if the control is in 0th frame
				//driver.switchTo().parentFrame();
				//driver.switchTo().defaultContent()

	}

}
