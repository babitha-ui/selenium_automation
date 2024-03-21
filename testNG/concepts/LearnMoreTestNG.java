package testNG.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMoreTestNG {
	WebDriver driver;
	//Launch the chrome Browser
	@BeforeClass
	public void setUp() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	
	}
	@AfterClass
	public void tearDown() {
		driver.close();
		
	}
	@Test(priority=0)
	public void getURL1() throws InterruptedException {
	driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
	Thread.sleep(2000);
	}
	@Test(priority=1)
	public void username_text() throws InterruptedException {
		driver.findElement(By.cssSelector("#username")).sendKeys("LearnMore");
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void password_Text() throws InterruptedException {
		driver.findElement(By.cssSelector("#password")).sendKeys("learnmore@123");
		Thread.sleep(2000);
	}
	@Test(priority=3)
	public void login_App() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	@Test(priority=4)
	public void verify_Login() throws InterruptedException {
		String ActualURL1="https://learnmoreqa.github.io/EventCalendar/";
		String ExpectedURL=driver.getCurrentUrl();
		/*
		 * if(ActualURL1.equals(ExpectedURL)) { System.out.println("test Passed"); }
		 * else { System.out.println("Test failed"); }
		 */
		Assert.assertEquals(ActualURL1, ExpectedURL);
		Thread.sleep(2000);
				
	}
}
