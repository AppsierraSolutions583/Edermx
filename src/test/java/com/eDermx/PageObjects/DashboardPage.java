package com.eDermx.PageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.eDermx.generics.GeneralFunctions;

public class DashboardPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(DashboardPage.class);
	

	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	private WebElement dashboard;


	@FindBy(xpath = "(//*[contains(text(),'Dashboard')])[2]")
	private WebElement dashboardVerify;

	@FindBy(xpath = "//body/section[1]/div[2]/div[1]/div[1]/div[1]")
	private WebElement visitReports;

	@FindBy(xpath = "//h4[contains(text(),'Vanya Goel')]")
	private WebElement userName;

	@FindBy(xpath = "//span[contains(text(),'Dermatology of Boca')]")
	private WebElement selectedPractice;

	@FindBy(xpath = "//span[contains(text(),'Schedule')]")
	private WebElement schedule;

	@FindBy(xpath = "//span[contains(text(),'Patients')]")
	private WebElement patients;

	@FindBy(xpath = "//span[contains(text(),'Billing')]")
	private WebElement billing;

	@FindBy(xpath = "//span[contains(text(),'ePrescribing')]")
	private WebElement ePrescribing;

	@FindBy(xpath = "//span[contains(text(),'Pathology')]")
	private WebElement pathology;

	@FindBy(xpath = "//span[contains(text(),'Document Management')]")
	private WebElement documentManagement;

	@FindBy(xpath = "//span[contains(text(),'Reports')]")
	private WebElement reports;

	@FindBy(xpath = "//span[contains(text(),'Patient Name, MRN, Phone, SSN, ...')]")
	private WebElement searchBar;

	@FindBy(xpath = "//input[@placeholder='Type to search...']")
	private WebElement searchBarTxt;

	@FindBy(xpath = "//b[contains(text(),'MRN:7398463')]")
	private WebElement searchBarSelect;

	@FindBy(xpath = "(//*[contains(text(),'Samaleswar Mishra')])[2]")
	private WebElement verifyAfterSearch;

	@FindBy(xpath = "//a[@class='mega-menu do-logout-link']")
	private WebElement logOutBtn;

	@FindBy(xpath = "//a[@id='js-right-sidebar-button']")
	private WebElement settingBtn;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyDisplayOfAllElements() {
		boolean verifyAll = false;
		boolean dash = visibilityCheck(dashboardVerify);
		log.info("Checked Dashboard");
		boolean vReports = visibilityCheck(visitReports);
		log.info("Checked Visit Reports");
		boolean uName = visibilityCheck(userName);
		log.info("Checked the username");
		boolean sPractice = visibilityCheck(selectedPractice);
		log.info("Checked the Selected Practice");
		boolean schBtn = visibilityCheck(schedule);
		log.info("Checked The Schedule");
		boolean patBtn = visibilityCheck(patients);
		log.info("Checked The Patients");
		boolean bil = visibilityCheck(billing);
		log.info("Checked The Billing");
		boolean ePre = visibilityCheck(ePrescribing);
		log.info("Checked The ePrescribing");
		boolean patho = visibilityCheck(pathology);
		log.info("Checked The  Pathology");
		boolean docVerify = visibilityCheck(documentManagement);
		log.info("Checked The Document Management");
		boolean rpt = visibilityCheck(reports);
		log.info("Checked The Reports");
		boolean schBar = visibilityCheck(searchBar);
		log.info("Checked The Sraech Bar");
		boolean lOut = visibilityCheck(logOutBtn);
		log.info("Checked The LogOut");
		boolean setBtn = visibilityCheck(settingBtn);
		log.info("Checked The Setting");

		if (dash && vReports && uName && sPractice && schBtn && patBtn && bil && ePre && patho && docVerify && rpt
				&& schBar && lOut && setBtn) {
			verifyAll = true;
			log.info("Everything Is Displayed.");
		}

		return verifyAll;
	}

	public boolean searchPatient()  {
		click(searchBar);
		sendKeys(searchBarTxt, "Samaleswar");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(searchBarSelect);
		boolean pntVrfy = visibilityCheck(verifyAfterSearch);
		return pntVrfy;
	}

	
}
