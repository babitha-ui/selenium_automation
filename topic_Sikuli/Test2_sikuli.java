package topic_Sikuli;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.testng.annotations.Test;

public class Test2_sikuli {
  @Test
  public void type_credentials() throws InterruptedException, FindFailed, IOException {
	  
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		  //go to test URL
		  driver.get("https://www.saucedemo.com/");
		  Thread.sleep(2000);
		  
		  //maximize the browser window
		  driver.manage().window().maximize();
		 //implementing sikuli
		  
		  Screen s =new Screen();
		  s.type("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\Sikuli_Locators\\type_username.PNG",
				  "standard_user");
		  Thread.sleep(2000);
		  
		  ScreenImage si=s.capture();
		  BufferedImage bi=si.getImage();
		  File f1=new File("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\Sikuli_Locators\\fullScreenshpt.PNG");
		  ImageIO.write(bi,"PNG",f1);
		  s.type("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\Sikuli_Locators\\type_password.PNG",
				  "secret_sauce");
		  Thread.sleep(2000);
		  ScreenImage si1=s.capture();
		  BufferedImage bi1=si1.getImage();
		  File f2=new File("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\Sikuli_Locators\\fullScreenshpt2.PNG");
		  ImageIO.write(bi1,"PNG",f2);
		  
		  s.click("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\Sikuli_Locators\\click_login.PNG");
		  Thread.sleep(2000);
		  
		  driver.close();
		  
  }
}
