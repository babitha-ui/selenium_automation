package webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test23_ActionsEx1_moveToElement {

	public static void main(String[] args) throws InterruptedException {
		//launch the chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Goto the URL
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);
		//manage the browser window to maximize
		driver.manage().window().maximize();
		
		//move mouse towards fashion
		
		driver.findElement(By.xpath("//label[contains(text(),'Enter Email')]/preceding::*[6]")).click();
		
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Thread.sleep(2000);
		Actions a= new Actions(driver);//interface object
		a.moveToElement(fashion).build().perform();
		Thread.sleep(2000);
		
		//move the mouse towards women ethnic

		WebElement womenEthnic = driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
		
		a.moveToElement(womenEthnic).build().perform();
		Thread.sleep(2000);
		
		//click on women sarees
		
		WebElement womensarees = driver.findElement(By.xpath("//a[text()='Women Sarees']"));
		driver.findElement(By.xpath("//a[text()='Women Sarees']")).click();
		
		driver.close();
 
	}

}
