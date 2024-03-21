package testAutomationFW.HybridFW_DataDriven_POM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TC1_Login {
	static Page_login login;
	static WebDriver driver;
  @Test(dataProvider="sd_testdata")
  public void verifySDLogin(String uname,String pwd) throws InterruptedException {
	  
      //launch the chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//Goto the URL
		driver.get("https://www.saucedemo.com/");

		Thread.sleep(2000);
		//manage the browser window to maximize
		driver.manage().window().maximize();
		login=new Page_login(driver) ;
		
		//Fill User name textbox with input
		login.type_Username(uname);
		//Fill password textbook with input
		login.type_password(pwd);
		//click on login button
		login.click_Login();
		
		//verify login
		
		String expectedURL="https://www.saucedemo.com/inventory.html";
		String actualURL=driver.getCurrentUrl();
		
		Assert.assertEquals(actualURL, expectedURL);
        Thread.sleep(3000)	;
        
        //close the browser
        driver.close();
  }
        
  @DataProvider(name="sd_testdata") 
  public Object[][] readExcel() throws BiffException, IOException{
	  
	  //open the excel file for read and write ,which is available in same package
	  File f=new File("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\src\\test\\resources\\allResources\\SauceDemo.xls");
	  Workbook w=Workbook.getWorkbook(f);
	  Sheet s=w.getSheet(0);
	  
	  int noOfRows=s.getRows();
	  int noOfColumns=s.getColumns();
	  //create an array to store the data of an excel sheet
	  String inputData[][]=new String[noOfRows-1][noOfColumns];
	  int count=0;
	  for(int i=1;i<noOfRows;i++)
	  {
		  for(int j=0;j<noOfColumns;j++)
		  {
           Cell c=s.getCell(j, i);
           inputData[count][j]=c.getContents();
		  }
		count++;  
	  }
	return inputData;
	 
  }
  	
		
		
  
}
