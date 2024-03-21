package topic_Sikuli;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_sikuli {
	
	 @Test
	 public void sikuli_perform() throws InterruptedException, FindFailed {
		 //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		  //go to test URL
		  driver.get("https://smallpdf.com/word-to-pdf");
		  Thread.sleep(2000);
		  
		  //maximize the browser window
		  driver.manage().window().maximize();
		 //implementing sikuli
		  
		  Screen s =new Screen();
		  s.click("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\Sikuli_Locators\\clickChooseFile.PNG");
		  Thread.sleep(2000);
		  
		  Pattern fileinput=new Pattern("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\Sikuli_Locators\\type_path.PNG");
		  Thread.sleep(2000);
		  //send the path of the file
		  s.type(fileinput,"E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\Sikuli_Locators\\s4 Hana Conversion.docx");
		  Thread.sleep(5000);
		  
		  s.click("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\Sikuli_Locators\\click_open.PNG");
		  Thread.sleep(15000);
		  
		  s.click("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\Sikuli_Locators\\click_download.PNG");
		  Thread.sleep(15000);
		  
		  driver.close();
	  }

}
