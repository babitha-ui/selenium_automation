package module11_POM_Assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1_Login {
	static Page_login login;
	static WebDriver driver;
  @Test
  public void verifySDLogin() throws InterruptedException {
	  
      //launch the chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Goto the URL
		driver.get("https://www.saucedemo.com/");

		Thread.sleep(2000);
		//manage the browser window to maximize
		driver.manage().window().maximize();
		login=new Page_login(driver) ;
		
		//Fill User name textbox with input
		login.type_Username("standard_user");
		//Fill password textbook with input
		login.type_password("secret_sauce");
		//click on login button
		login.click_Login();
		
		//verify login
		
		String expectedURL="https://www.saucedemo.com/inventory.html";
		String actualURL=driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);
        Thread.sleep(3000)	;
        
        //close the browser
        driver.close();
  }
        
       
		
		
		
  
}
