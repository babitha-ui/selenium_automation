package package3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1_chrome {
	WebDriver driver;
  @Test
  public void setUp_chrome() throws InterruptedException {
	  driver=new ChromeDriver();
	  //go to test URL
	  driver.get("https://www.selenium.dev");
	  Thread.sleep(2000);
	  //close the browser
	  driver.close();
	  
  }
}
