package topic_ITest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestresContext2 {
	WebDriver driver;
	@Parameters({"browser"})
  @BeforeMethod
  public void setUp(String Browser) {
	  System.out.println("my setUp method");
	  
	  
	  if (Browser.equalsIgnoreCase("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(Browser.equalsIgnoreCase("edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  else if(Browser.equalsIgnoreCase("ff"))
	  {
		  driver=new FirefoxDriver();
	  }
  }
  @AfterMethod
  public void tearDown() {
	  driver.close();
  }
 
  @Parameters({"username","password"})
  @Test
  public void sdLogin(String uname,String pwd) throws InterruptedException {
		//Goto the URL
		driver.get("https://www.saucedemo.com/");

		Thread.sleep(2000);
		//manage the browser window to maximize
		driver.manage().window().maximize();
		
		//Fill username textBox with input
		driver.findElement(By.id("user-name")).sendKeys(uname);
		Thread.sleep(2000);
		//Fill password textBox with input
		
		driver.findElement(By.id("password")).sendKeys(pwd);
		Thread.sleep(2000);
		
		//Click on the login button
		driver.findElement(By.id("login-button")).click();

		//verify login
		String expectedURL="https://www.saucedemo.com/inventory.html";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);

	  
  }
}
