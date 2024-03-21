package webdriver_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11_tagNameLinks {

	public static void main(String[] args) throws InterruptedException {
//TC1: Launch the chrome browser
		
		WebDriver driver = new ChromeDriver();
		
//TC2: go to test URL https://www.selenium.dev/
		
		driver.get("https://www.selenium.dev/");
		
        //wait time for 5 secs
		Thread.sleep(5000);
		
		//get the no of links and its count
		
		List<WebElement> list = driver.findElements(By.tagName("span"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		

		/*List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}*/
		
		
		driver.close();

	}

}
