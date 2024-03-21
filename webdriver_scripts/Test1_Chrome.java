/*Test scenarios
 TC1:Launch Chrome Browser
 TC2:Go to Test URL
 TC3:Minimize Browser window
 TC4:Maximize Browser window
 TC5:Get the Title of the page
 TC6:Get the current URL of the page
 Tc7:close the Browser*/



package webdriver_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TC1:Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//TC2:Go to Test URL
        driver.get("https://www.selenium.dev/");
        
        //wait time 5 sec 1sec = 1000ms
        Thread.sleep(5000);
        
        //TC3:Minimize Browser window
        driver.manage().window().minimize();
        Thread.sleep(3000);
        
        //TC4:Maximize Browser window
        
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        //TC5:Get the Title of the 

        String pgTitle = driver.getTitle();
        System.out.println(pgTitle);
        Thread.sleep(3000);
        
        //TC6:Get the current URL of the page
        
        String pgURL = driver.getCurrentUrl();
        System.out.println(pgURL);
        
        //TC7:close the Browser
        
        driver.close();
        
        
        
        
	}

}
