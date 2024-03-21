package webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test27_ActionsEx5_dragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		//launch the chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Goto the URL
		driver.get("https://demoqa.com/droppable/");

		Thread.sleep(2000);
		//manage the browser window to maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDrop(draggable,droppable).build().perform();
		Thread.sleep(2000);
		//close the window
		
		driver.close();


	}

}
