package com.eDermx.PageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.eDermx.generics.GeneralFunctions;

public class PatientsPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(PatientsPage.class);

	@FindBy(xpath = "//span[contains(text(),'Patients')]")
	private WebElement patient;

	@FindBy(xpath = "//input[@id='patient-query']")
	private WebElement patientSearch;

	@FindBy(xpath = "//a[contains(text(),'Patients')]")
	private WebElement patientsPageVerification;

	@FindBy(xpath = "//*[@id='patient-grid-list']/table/thead/tr/th")
	private List<WebElement> tableColumns;

	@FindBy(xpath = "//td[contains(text(),'Samaleswar Mishra')]")
	private WebElement searchResult;

	@FindBy(xpath = "//div[@id='patient-modify-header']//h2[contains(text(),\"Samaleswar \")]")
	private WebElement patientProfileVerify;

	@FindBy(xpath = "//li/a/i[@class='fa fa-calendar']")
	private WebElement visit;

	@FindBy(xpath = "//a[normalize-space()='Demographics']")
	private WebElement demographics;

	@FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Address']")
	private WebElement address;

	@FindBy(xpath = "//a[normalize-space()='Residence']")
	private WebElement addressPageResidance;

	@FindBy(xpath = "//a[normalize-space()='Contacts']")
	private WebElement contacts;

	@FindBy(xpath = "//b[normalize-space()='Add New Contact']")
	private WebElement addContact;

	@FindBy(xpath = "//div[contains(text(),'Contact Type')]")
	private WebElement addContactType;

	@FindBy(xpath = "//a[@class='dropdown-item']//span[contains(text(),'Guardian')]")
	private WebElement addContactTypeGaurdian;

	@FindBy(xpath = "//button[@title='Relation Type']//div[contains(text(),'Relation Type')]")
	private WebElement addContactRelation;

	@FindBy(xpath = "//a[@class='dropdown-item']//span[contains(text(),'Father')]")
	private WebElement addContactRelationOther;

	@FindBy(xpath = "//input[@class='form-control first-name']")
	private WebElement addContactFirstName;

	@FindBy(xpath = "//input[@class='form-control last-name']")
	private WebElement addContactLastName;

	@FindBy(xpath = "//button[@class='btn btn-info btn-block contact-save mb-1']")
	private WebElement saveBtn;

	@FindBy(xpath = "//a[normalize-space()='Father Guardian']")
	private WebElement addContactSelectThenewContact;

	@FindBy(xpath = "//button[@class='btn btn-info btn-block contact-remove mb-1']")
	private WebElement removeBtn;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	private WebElement removeOKBtn;
	
	@FindBy(xpath = "//a[@href='#insuranceTab']")
	private WebElement insurance;
	
	@FindBy(xpath = "//div[contains(text(),'Add New Insurance')]")
	private WebElement addInsurance;
	
	@FindBy(xpath = "//a[@href='#documentsTab']")
	private WebElement documents;
	
	@FindBy(xpath = "//a[@href='#accountTab']")
	private WebElement accounts;
	

	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	private WebElement dashboard;
	
	public void goBackToDashboard() {
		click(dashboard);
	}
	
	
	public PatientsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyVisibilityAllElement() {
		boolean verifyAll = false;
		click(patient);
		boolean vCheckPatient = visibilityCheck(patientsPageVerification);
		boolean vChecksearch = visibilityCheck(patientSearch);

		if (vCheckPatient & vChecksearch)
			verifyAll = true;

		return verifyAll;
	}

	public boolean searchForPatient() throws InterruptedException {
		sendKeys(patientSearch, "Samaleswar");
		Thread.sleep(3000L);
		boolean patientTable = visibilityCheck(searchResult);
		return patientTable;
	}

	public boolean patientProfile() {
		click(searchResult);
		boolean vCheckPP = visibilityCheck(patientProfileVerify);
		click(visit);
		click(demographics);
		click(address);
		// click(addressPageResidance);
		return vCheckPP;
	}

	public void addAndRemoveContact() throws InterruptedException {
		click(contacts);
		click(addContact);
		click(addContactType);
		Thread.sleep(2000L);
		click(addContactTypeGaurdian);
		click(addContactRelation);
		Thread.sleep(2000L);
		click(addContactRelationOther);
		sendKeys(addContactFirstName, "FirstName");
		sendKeys(addContactLastName, "LastName");
		click(saveBtn);
		Thread.sleep(4000L);
		click(addContactSelectThenewContact);
		click(removeBtn);
		click(removeOKBtn);
		Thread.sleep(4000L);

	}

}
