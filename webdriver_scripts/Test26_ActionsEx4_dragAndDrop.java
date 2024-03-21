package webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test26_ActionsEx4_dragAndDrop {

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
		WebElement draganddrop = driver.findElement(By.xpath("//div[@id='slider']"));
		
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDropBy(draganddrop, 60, 0).build().perform();
		Thread.sleep(2000);
		//close the window
		
		driver.close();


	}

}
