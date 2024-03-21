package webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10_google {
	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	
	
	//To get the URL of page
	driver.get("https://www.google.com/");

	Thread.sleep(2000);
	//TC-3 maximize the browser window

	//driver.manage().window().maximize();

	//4. TC-4 get the title of page
	Thread.sleep(2000);
	String pgTitle = driver.getTitle();
	System.out.println(pgTitle);

	Thread.sleep(5000);
	//TC-5 click on know more link text
	driver.findElement(By.name("q")).sendKeys("amazon");

	driver.findElement(By.name("btnK")).click();
	//driver.findElement(By.xpath("//a[normalize-space()='Register Now']")).click();
}
}
