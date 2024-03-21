package topic_advanced_Annotations;

import org.testng.annotations.Test;

public class TestSecurity {
  @Test(groups="security")
  public void openFileDialog() {
	  System.out.println("openFileDialog");
	  }
  @Test(groups="security")
  public void openCongirmationDialog() {
	  System.out.println("openCongirmationDialog");
  }
  @Test(groups="security")
  public void closeFileDialog() {
	  System.out.println("closeFileDialog");
  }
  }

