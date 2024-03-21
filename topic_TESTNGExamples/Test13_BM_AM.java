package topic_TESTNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class Test13_BM_AM {
	public WebDriver driver;
  @BeforeClass
  public void setUp() {
	  driver=new ChromeDriver();
	  
  }
  @AfterClass
  public void tearDown() {
	  driver.close();
  }
  @Test(priority=1)
  public void verifySDPage() throws InterruptedException {
	  driver.get("https://www.saucedemo.com/");
	  Thread.sleep(4000);
	  String expectedTitle="Swag Labs";
	  String actualTitle=driver.getTitle();
	  
	  Assert.assertEquals(expectedTitle, actualTitle);
  }
  @Test(priority=2)  
  public void verifyGooglePage() throws InterruptedException {
	  driver.get("https://www.google.com/");
	  Thread.sleep(4000);
	  String expectedTitle="Google";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle, actualTitle);
  }
  @Test(priority=3)
  public void verifyAmazonPage() throws InterruptedException {
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(4000);
	  String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(expectedTitle, actualTitle);
  }
	  }
	  
  

