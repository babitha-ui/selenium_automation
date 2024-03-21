package framework.Hybrid.KeywordDrivenDD;

import java.io.IOException;

import org.testng.annotations.Test;

public class DriverScripts {
	@Test
	
	public void setup() throws IOException, InterruptedException {
		String spath="E:\\INTELLIPAT_COURSES\\seleniumConcepts\\Automation backup\\myAutomationProjectDemo\\src\\test\\resources\\allResources\\HybrideDriven.xlsx";
		ExcelUtils.setExcelFile(spath,"Sheet1");
		for(int iRow=1;iRow<=6;iRow++) {
			String sActionKeywords=ExcelUtils.getCellData(iRow, 3);
			String sTestData=ExcelUtils.getCellData(iRow,4);		
					if(sActionKeywords.equals("openBrowser"))
			{
				ActionKeywords.openBrowser();
			}
			if(sActionKeywords.equals("navigate"))
			{
				ActionKeywords.navigate(sTestData);
			}
			else if(sActionKeywords.equals("inputUserName"))
			{
				ActionKeywords.inputUserName(sTestData);
			}
			else if(sActionKeywords.equals("inputPassword"))
			{
				ActionKeywords.inputPassword(sTestData);
			}
			else if(sActionKeywords.equals("clickSigin"))
			{
				ActionKeywords.clickSigin();
			}
			else if(sActionKeywords.equals("closeBrowser"))
			{
				ActionKeywords.closeBrowser();
			}
		}
		
	}

}
