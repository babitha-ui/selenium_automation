package package3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test1_Edge {
	WebDriver driver;
  @Test
  public void setUp_Edge() throws InterruptedException {
	  driver=new EdgeDriver();
	  //go to test URL
	  driver.get("https://www.selenium.dev");
	  Thread.sleep(2000);
	  //close the browser
	  driver.close();
	  
  }
}
