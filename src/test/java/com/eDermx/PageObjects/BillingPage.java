package com.eDermx.PageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.eDermx.generics.GeneralFunctions;

public class BillingPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(BillingPage.class);
	
	@FindBy(xpath = "//span[contains(text(),'Billing')]")
	private WebElement billing;

	@FindBy(xpath = "//div[@class='block-header']//h2[1]")
	private WebElement verifyBillingPage;

	@FindBy(xpath = "//a[@href='#dashboard-tab']")
	private WebElement dashboard1;

	@FindBy(xpath = "//a[@id='navbarDropdown']")
	private WebElement queues;

	@FindBy(xpath = "//a[@href='#claim-inspector-tab']")
	private WebElement claimInspector;

	@FindBy(xpath = "//a[@href='#remittance-inspector-tab']")
	private WebElement remittanceInspector;

	@FindBy(xpath = "//a[@href='#insurance-pay-tab']")
	private WebElement insurancePayment;

	@FindBy(xpath = "//a[@href='#bank-book-tab']")
	private WebElement bankBook;

	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	private WebElement dashboard;
	
	public void goBackToDashboard() {
		click(dashboard);
	}
	
	public BillingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean visibilityCheckOfAllElements() {
		
		click(billing);
		boolean vtestAll=false;
		boolean vTest = visibilityCheck(verifyBillingPage);
		boolean vTest1 = visibilityCheck(dashboard1);
		boolean vTest2 = visibilityCheck(queues);
		boolean vTest3 = visibilityCheck(claimInspector);
		boolean vTest4 = visibilityCheck(remittanceInspector);
		boolean vTest5 = visibilityCheck(insurancePayment);
		boolean vTest6 = visibilityCheck(bankBook);
		
		if(vTest && vTest1 && vTest2 && vTest3 && vTest4 && vTest5 && vTest6)
		vtestAll=true;
			
		return vtestAll;
	}

	public void clickOnTabs() throws InterruptedException {
		click(dashboard1);
		Thread.sleep(3000L);
		click(queues);
		Thread.sleep(3000L);
		click(claimInspector);
		Thread.sleep(3000L);
		click(remittanceInspector);
		Thread.sleep(3000L);
		click(insurancePayment);
		Thread.sleep(3000L);
		click(bankBook);
		Thread.sleep(3000L);
		
	}

	
}
