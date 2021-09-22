package oto;

import org.testng.annotations.Test;

import Base.Apache_POI_TC;
import pages.Addstockpage;
import pages.DashBoardPage;

public class AddStockTest extends Apache_POI_TC {
	
	@Test(priority=1)
	public void verifyStockClick() throws InterruptedException
	{
		
	    logger=DashboardTest.report.createTest("Click on Stock Link and Add Stock Link");
	    driver1.findElementByXPath(DashBoardPage.getStockLink()).click();
		
	    logger.info("Stock Link is clicked");
	    	    
	    Thread.sleep(5000);
	    
		/*********** Click Add Stock *********/
	    
        driver1.findElementByXPath(DashBoardPage.getStockAddIcon()).click();
		
	    logger.info("Add Stock Link is clicked");
	    	    
	    Thread.sleep(5000);
	    
	}
	
	@Test(priority=2)
	public void verifyFillStockForm() throws InterruptedException
	{
		driver1.findElementByXPath(Addstockpage.getMakeModel()).click();
		driver1.findElementByXPath(Addstockpage.getSearchBrandTextbox()).click();
		driver1.findElementByXPath(Addstockpage.getSearchBoxVal()).sendKeys("Honda Civic");
		driver1.findElementByXPath(Addstockpage.getVersion()).click();
		driver1.findElementByXPath(Addstockpage.getSearchVersionVal()).click();
		driver1.findElementByXPath(Addstockpage.getMfgYear()).click();
		driver1.findElementByXPath(Addstockpage.getOKbutton()).click();
		driver1.findElementByXPath(Addstockpage.getColor()).click();
		driver1.findElementByXPath(Addstockpage.getkmsdriven()).sendKeys("3000");
		driver1.findElementByXPath(Addstockpage.getNumberofowners()).click();
		driver1.findElementByXPath(Addstockpage.getNumberofownerselect()).click();
		driver1.findElementByXPath(Addstockpage.getRegmonthandyear()).click();
		driver1.findElementByXPath(Addstockpage.getRegmonthandyearselection()).click();
		driver1.findElementByXPath(Addstockpage.getRegisrationcity()).click();
		driver1.findElementByXPath(Addstockpage.getRegisrationcityselect()).click();
		driver1.findElementByXPath(Addstockpage.getplateNo()).click();
		driver1.findElementByXPath(Addstockpage.getplateNotype()).click();
		driver1.findElementByXPath(Addstockpage.getplateValidity()).click();
		driver1.findElementByXPath(Addstockpage.getplateValidity()).click();
		driver1.findElementByXPath(Addstockpage.getplateValiditySelection()).click();
		driver1.findElementByXPath(Addstockpage.getStockprice()).sendKeys("42535658");
		driver1.findElementByXPath(Addstockpage.getDownpayment()).sendKeys("3222525");
		driver1.findElementByXPath(Addstockpage.getInstallment()).click();
		driver1.findElementByXPath(Addstockpage.getInstallmentMonth()).click();
		driver1.findElementByXPath(Addstockpage.getInsuranceType()).click();
		driver1.findElementByXPath(Addstockpage.getInsuranceTypeSelecion()).click();
		driver1.findElementByXPath(Addstockpage.getDescription()).sendKeys("test");
		driver1.findElementByXPath(Addstockpage.getAddStock()).click();
	}

}
