package module11_POM_Assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC2_productModuleText {
	static Page_login login;
	static WebDriver driver;
  @Test
  public void verifyText() throws InterruptedException {
	  
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
		
		//verify products login
		String expectedtext="Products";
		String actualText=login.capture_producttxt();
		Assert.assertEquals(actualText, expectedtext);
		Thread.sleep(2000);
		//click on add to cart button
		login.click_addTocart();
		Thread.sleep(2000);
		
		//click on cart icon
		login.click_cartmenu();
		Thread.sleep(2000);
		
		//verify your cart text
		String expectedCartText="Your Cart";
		String actualCartText=login.capture_text_cart();
		Assert.assertEquals(actualCartText, expectedCartText);
		Thread.sleep(2000);
		
		driver.close();
  }
}
