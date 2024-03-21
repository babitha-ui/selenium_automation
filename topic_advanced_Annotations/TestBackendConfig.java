package topic_advanced_Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestBackendConfig {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest----login");
	
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("BeforeTest----logout");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite----setup");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite----tearDown");
  }
  
  

}
