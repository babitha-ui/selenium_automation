package module11_OR_Assignment4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_ReadProperties {
	WebDriver driver;
	
  @Test
  public void sd_login() throws IOException, InterruptedException {
	  
	  Properties prop=new Properties();
	  FileInputStream ip=new FileInputStream("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\src\\test\\java\\module11_OR_Assignment4\\config.properties");
	  prop.load(ip);
	 
	  //url
	  String URL=prop.getProperty("url");
	  System.out.println(URL);
	  //browser
	  String Browser=prop.getProperty("browser");
	  System.out.println(Browser);
	  
	  if(Browser.equals("chrome"))
	  {
		  driver=new ChromeDriver();
		  
	  }
	  else if(Browser.equals("edge"))
	  {
		  driver=new EdgeDriver();
		  
	  }
	  else if(Browser.equals("ff"))
	  {
		  driver=new FirefoxDriver();
	  }
	  
	  
	  //Go to URL
	  driver.get(URL);
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath(prop.getProperty("UsernameField"))).sendKeys(prop.getProperty("username"));
	  driver.findElement(By.xpath(prop.getProperty("PasswordField"))).sendKeys(prop.getProperty("password"));
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(prop.getProperty("LoginBtn"))).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(prop.getProperty("logOutMenu"))).click();
	  driver.findElement(By.xpath(prop.getProperty("logoutbtn"))).click();
	  driver.close();
	  
			  
			  
			  
	  
	  
  }
}
