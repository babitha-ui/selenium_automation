package topic_ITest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestresContext {
	WebDriver driver;
  @BeforeMethod
  public void setUp(ITestContext testcontext) {
	  System.out.println("my setUp method");
	  String Browser = testcontext.getCurrentXmlTest().getParameter("browser");
	  
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
  @Test
  public void sdPage() throws InterruptedException {
  //go to url
	driver.get("https://www.saucedemo.com/");

	Thread.sleep(2000);
	//manage the browser window to maximize
	driver.manage().window().maximize();
  }
}
