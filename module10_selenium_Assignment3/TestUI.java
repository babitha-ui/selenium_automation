package module10_selenium_Assignment3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestUI {
  
 
  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest---UI login");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest---UI logout");
  }
  
  @Test(groups="UI")
  public void accessHomePage() {
	  System.out.println("accessHomePage");
  }
  @Test(groups="UI")
  public void accessContactPage() {
	  System.out.println("accessContactPage");
  }
  @Test(groups="UI")
  public void accesscompaingnPage() {
	  System.out.println("accesscompaingnPage");
  }
 

}
