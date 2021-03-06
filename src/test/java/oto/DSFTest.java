package oto;

import org.testng.annotations.Test;

import pages.DSFFinancerPage;
import pages.FinancerListPage;
import pages.StockListPage;
import utility.CommonUtilMethods;

public class DSFTest  {
	
	
	@Test(priority=1)
	public void verifyFirstStockClick() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Click on First Stock");
		
		
	    DashboardTest.driver1.findElementByXPath(StockListPage.getStockFirst()).click();
		
	    DashboardTest.logger.info("First Stock is clicked");
	    DashboardTest.logger.info("Financer List is opened");
	    
	    Thread.sleep(5000);
		
	}
	
	@Test(priority=2)
	public void verifyDSFClick() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Click on DSF Financier");
		
		
	    DashboardTest.driver1.findElementByXPath(FinancerListPage.getDSFLink()).click();
		
	    DashboardTest.logger.info("DSF Financier is clicked");
	    Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void addDSFFormBasicDetails() throws InterruptedException
	{
		
	    DashboardTest.logger=DashboardTest.report.createTest("Start filling DSF Form");
		
		
	    DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getCustomerType()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getIndividual()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getCustRegion()).click();
		Thread.sleep(4000);
	    
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getCustRegionValJava()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getPlateNumberRegion()).click();
		Thread.sleep(4000);
	    
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getPlateNumberRegionVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getBrand()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getSearchBrandTextbox()).sendKeys("Honda");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getSearchBoxVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getModel()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getSearchModelTextbox()).sendKeys("Accord");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getSearchModelTextboxVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getVersion()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getSearchVersionVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getMfgYear()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getMfgYearVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".className(\"android.widget.ScrollView\")).scrollIntoView("+"new UiSelector().text(\"Continue\"));");	
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getInsuranceType()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getInsuranceTypeVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getTenure()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getTenureVal()).click();
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getMRPTextbox()).sendKeys("30000001");
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getContinueButton()).click();
		Thread.sleep(5000);
		
		
	}
	
	@Test(priority=4)
	public void addDSFPaymentDetails() throws InterruptedException
	{
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getPaymentEditBox()).sendKeys("2000000");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getContinueButtonP()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"+".className(\"android.widget.ScrollView\")).scrollIntoView("+"new UiSelector().text(\"Proceed\"));");	
		Thread.sleep(4000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getProceedButton()).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=5)
	public void addDSFCustDetails() throws InterruptedException
	{
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getCustName()).sendKeys("testtt");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getCustPhone()).sendKeys("824072438255");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getCustType()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getNewAPP()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getLeadSource()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getDealershipVal()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getFinancierBranch()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getBranchName()).sendKeys("DSF Gresik");
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getBranchNameVal()).click();
		Thread.sleep(5000);
		
		CommonUtilMethods cmn=new CommonUtilMethods(DashboardTest.driver1);
		cmn.scrollDown();
		
		Thread.sleep(10000);
		
		
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getselectall()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(DSFFinancerPage.getbtnSubmit()).click();
		Thread.sleep(5000);
		
	}
	
	
	/*@Test(priority=6)
	public void addDocument() throws InterruptedException
	{
		
		
		DashboardTest.driver1.findElementByXPath(FinancerAddPage.getFrontSide()).click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		Thread.sleep(5000);
		
		DashboardTest.driver1.findElementByXPath(FinancerAddPage.getFrontSide()).click();
		
		Thread.sleep(5000);
		
        DashboardTest.driver1.findElementByXPath(FinancerAddPage.getCameraIcon()).click();
		
		Thread.sleep(5000);
		
        DashboardTest.driver1.findElementByXPath(FinancerAddPage.getCamera()).click();
		
		Thread.sleep(10000);
		
        DashboardTest.driver1.findElementByXPath(FinancerAddPage.getIdCardCustomer()).click();
		
		Thread.sleep(5000);
		
		
	}*/
}


