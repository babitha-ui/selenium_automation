package topic_advanced_Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestUI2 {
  
 
 
  
  @Test(groups="UI")
  public void accessHomePage1() {
	  System.out.println("accessHomePage1");
  }
  @Test(groups="UI")
  public void accessContactPage2() {
	  System.out.println("accessContactPage2");
  }
  @Test(groups="UI")
  public void accesscompaingnPage3() {
	  System.out.println("accesscompaingnPage3");
  }
 

}
