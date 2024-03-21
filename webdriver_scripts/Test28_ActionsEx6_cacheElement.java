package webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test28_ActionsEx6_cacheElement {

	public static void main(String[] args) throws InterruptedException {
		//launch the chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Goto the URL
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);
		//manage the browser window to maximize
		driver.manage().window().maximize();
		//to close the login
		driver.findElement(By.xpath("//label[contains(text(),'Enter Email')]/preceding::*[6]")).click();
		Thread.sleep(2000);
		
		//automate cache element
		WebElement sbox = driver.findElement(By.xpath("//input[@name='q']"));
		Actions a= new Actions(driver);
		a.click(sbox).sendKeys("smartphones").build().perform();
		Thread.sleep(2000);
		a.click(sbox).sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		a.click(sbox).sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		a.click(sbox).sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		a.click(sbox).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.close();
 
	}

}
