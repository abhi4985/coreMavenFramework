package oto;

import org.testng.annotations.Test;

import Base.Apache_POI_TC;
import pages.DashBoardPage;
import pages.StockListPage;

public class DashboardTest extends Apache_POI_TC {
	
	
	@Test
	public void verifyLoanClick() throws InterruptedException
	{
		Thread.sleep(4000);
	    logger=report.createTest("Click on Loan Link");
		
		
		driver1.findElementByXPath(DashBoardPage.getLoanLink()).click();
		
		logger.info("Loan Link is clicked");
		
		Thread.sleep(5000);
		
	}
	
	
	@Test
	public void verifySubmitApplicationclick() throws InterruptedException
	{
		
	    logger=report.createTest("Click on Submit Application");
		
		
		driver1.findElementByXPath(DashBoardPage.getSubmitLink()).click();
		
		logger.info("Submit Application is clicked");
		
		Thread.sleep(5000);
		
	}
	
	
}


