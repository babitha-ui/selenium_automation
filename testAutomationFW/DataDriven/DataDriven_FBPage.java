package testAutomationFW.DataDriven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven_FBPage {
public WebDriver driver;
	
  @Test(dataProvider="sd_testdatafb")
  public void sdLogin(String fname,String lname,String email,String pwd) throws InterruptedException {
           //launch the chrome Browser
			
		    driver=new ChromeDriver();
			//Goto the URL
			driver.get("https://www.facebook.com/");

			Thread.sleep(2000);
			//manage the browser window to maximize
			driver.manage().window().maximize();
			
			driver.findElement(By.linkText("Create new account")).click();
			//wait time
			Thread.sleep(5000);
			
			//Fill firstname textBox with input
			driver.findElement(By.name("firstname")).sendKeys(fname);
			Thread.sleep(2000);
			//Fill lastname textBox with input
			
			driver.findElement(By.name("lastname")).sendKeys(lname);
			Thread.sleep(2000);
			
			//Fill email textBox with input
			
			driver.findElement(By.name("reg_email__")).sendKeys(email);
			Thread.sleep(2000);

			
			//Fill newpassword textBox with input
			
			driver.findElement(By.name("reg_passwd__")).sendKeys(pwd);
			Thread.sleep(2000);
			
			//wait time
			Thread.sleep(2000);

			Select select = new Select(driver.findElement(By.name("birthday_day")));
			select.selectByIndex(9);

			//wait time
			Thread.sleep(2000);

			Select select1 = new Select(driver.findElement(By.name("birthday_month")));

			select1.selectByVisibleText("Apr");

			Select select2 = new Select(driver.findElement(By.name("birthday_year")));

			select2.selectByValue("2018");

			//click on Male RadioButton

			By maleRB=RelativeLocator.with(By.tagName("input")).below(By.id("month"));
			driver.findElement(maleRB).click();

			
			//Click on the login button
			driver.findElement(By.name("websubmit")).click();
			
			
			
  
  }
 @AfterMethod
 public void tearDown() {
	 driver.close();
 }
  

  @DataProvider(name="sd_testdatafb") 
  public Object[][] readExcel() throws BiffException, IOException{
	  
	  //open the excel file for read and write ,which is available in same package
	  File f=new File("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\src\\test\\resources\\allResources\\TestData_FB_Registration.xls");
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
 
  

