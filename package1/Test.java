package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		//launch the chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Goto the URL
		driver.get("https://www.facebook.com");

		Thread.sleep(2000);
		
		//close browser
		driver.close();
	}

}
