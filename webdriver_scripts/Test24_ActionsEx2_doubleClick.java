package webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test24_ActionsEx2_doubleClick {

	public static void main(String[] args) throws InterruptedException {
		//launch the chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Goto the URL
		driver.get("https://only-testing-blog.blogspot.com/2014/09/selectable.html");

		Thread.sleep(2000);
		//manage the browser window to maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click' )]"));
		
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.doubleClick(doubleclick).build().perform();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		driver.close();
	}

}
