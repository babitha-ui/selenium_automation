package module9_testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment2_DataDrivenTesting {

	/*Write a Test Script to Automate www.saucedemo.com Login in TestNG.
● Apply Data Driven Testing Framework
● Use JXL jar file*/
	
	public WebDriver driver;
	
	  @Test(dataProvider="sd_testdata")
	  public void sdLogin(String Uname,String pwd) throws InterruptedException {
	           //launch the chrome Browser
				
			    driver=new ChromeDriver();
				//Goto the URL
				driver.get("https://www.saucedemo.com/");

				Thread.sleep(2000);
				//manage the browser window to maximize
				driver.manage().window().maximize();
				
				//Fill username textBox with input
				driver.findElement(By.id("user-name")).sendKeys(Uname);
				Thread.sleep(2000);
				//Fill password textBox with input
				
				driver.findElement(By.id("password")).sendKeys(pwd);
				Thread.sleep(2000);
				
				//Click on the login button
				driver.findElement(By.id("login-button")).click();
				
				//verify login
				String expectedURL="https://www.saucedemo.com/inventory.html";
				String actualURL=driver.getCurrentUrl();
				Assert.assertEquals(actualURL, expectedURL);
				
	  
	  }
	  @AfterMethod
	  public void getResult(ITestResult testResult)
	  {
		  System.out.println("Testcase Name:"+testResult.getName());
		  System.out.println("testcase result:"+testResult.getStatus());
		  int status=testResult.getStatus();
		  if(status==1)
		  {
			  driver.close();
		  }
		  else
//		  {
//			  //take the entire screenshot
//			  File outfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			  try {
//				FileUtils.copyFile(outfile, new File("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\src\\test\\resources\\allResources"+testResult.getParameters()[0]+"Defect.jpeg"));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			  //close the browser
//			  driver.close();
//			  
//		  }
		  {
			  //Take screenshot for specific element
			  WebElement errmsg=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface:')]"));
			  File outfile=((TakesScreenshot)errmsg).getScreenshotAs(OutputType.FILE);
			  try {
				FileUtils.copyFile(outfile, new File("E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\src\\test\\resources\\allResources"+testResult.getParameters()[0]+"Defect.jpeg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  //close the browser
			  driver.close(); 
		  }
		  
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
	 


