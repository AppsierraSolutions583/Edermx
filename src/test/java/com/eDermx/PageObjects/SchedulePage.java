package com.eDermx.PageObjects;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.eDermx.generics.GeneralFunctions;

public class SchedulePage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(SchedulePage.class);
	public String randomEmail = generateRandomEmail();
	public String firstname = generateRandomFirstName();
	public String lastname = generateRandomLastName();

	@FindBy(xpath = "//input[@id='practice-list-criteria']")
	private WebElement searchBarPractice;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]")
	private WebElement selectFromTable;

	@FindBy(xpath = "//small[contains(text(),'Welcome to eDerm')]")
	private WebElement daasboardVerify;

	@FindBy(xpath = "//span[contains(text(),'Schedule')]")
	private WebElement schedule;

	@FindBy(xpath = "//button[contains(text(),'Quick Add')]")
	private WebElement quickadd;

	@FindBy(xpath = "//button[@class='btn dropdown-toggle bs-placeholder btn-light']//div[@class='filter-option-inner-inner'][normalize-space()='Mr, Mrs...']")
	private WebElement title;

	@FindBy(xpath = "//span[contains(text(),'Mr.')]")
	private WebElement selectTitle;

	@FindBy(xpath = "//input[@id='quick-add-first-name']")
	private WebElement fName;

	@FindBy(xpath = "//input[@id='quick-add-last-name']")
	private WebElement lName;

	@FindBy(xpath = "//div[contains(text(),\"Select patient's gender\")]")
	private WebElement gender;

	@FindBy(xpath = "//span[contains(text(),'Male')]")
	private WebElement selectGender;

	@FindBy(xpath = "//label[@for='quick-add-dob']//b[contains(text(),'Date of Birth')]/parent::label/following::div/div/div/input")
	private WebElement dob;

	@FindBy(xpath = "//div[contains(text(),'Other')]")
	private WebElement maritalStatus;

	@FindBy(xpath = "//span[contains(text(),'Single')]")
	private WebElement SelectMaritalStatus;

	@FindBy(xpath = "//input[@id='quick-add-home-phone']")
	private WebElement cellPhone;

	@FindBy(xpath = "//input[@id='quick-add-email']")
	private WebElement emailQuickadd;

	@FindBy(xpath = "//span[contains(text(),'Select primary provider')]")
	private WebElement provider;

	@FindBy(xpath = "//a[contains(text(),'Case, Laurie (Dermatology)')]")
	private WebElement selectProviderQuickadd;

	@FindBy(xpath = "//input[@id='quick-add-self-insured']")
	private WebElement selfPay;

	@FindBy(xpath = "//button[@form='quick-add-form']")
	private WebElement save;

	@FindBy(xpath = "(//button[contains(@class,'add-to-schedule-btn')])[1]")
	private WebElement addNewSchedule;

	@FindBy(xpath = "//form[@id='schedule-appt-demo-form']/div/div/div/div/div[2]/div/a")
	private WebElement patient;

	@FindBy(xpath = "//*[@id=\"schedule-appt-demo-form\"]/div[1]/div[1]/div/div/div[2]/div/div/div/div/input")
	private WebElement patientTxt;

	@FindBy(xpath = "//a[@data-id='7398463']")
	private WebElement selectPatient;

	@FindBy(xpath = "//input[@id='schedule-mobile-phone']")
	private WebElement cellphone;

	@FindBy(xpath = "//input[@id='schedule-email']")
	private WebElement email;

	@FindBy(xpath = "//b[contains(text(),'Location')]/parent::label/following::div[1]")
	private WebElement locationDropdown;

	@FindBy(xpath = "//div[@class='dropdown-menu selectdrop-dropdown-menu mt-2 show']//input[@placeholder='Type to search...']")
	private WebElement locationSearch;

	@FindBy(xpath = "(//b[contains(text(),'Provider')]/parent::label/following::div[1])[2]")
	private WebElement providerDropdown;

	@FindBy(xpath = "//div[@class='dropdown-menu selectdrop-dropdown-menu mt-2 show']//input[@placeholder='Type to search...']")
	private WebElement providerSearch;

	@FindBy(xpath = "//a[contains(text(),'Dermatology of Boca')]")
	private WebElement selectFromLocationDropdown;

	@FindBy(xpath = "//a[contains(text(),'Case, Laurie (Dermatology)')]")
	private WebElement selectFromProviderDropdown;

	@FindBy(xpath = "(//label[contains(text(),'Referring Provider')]/following::div[1])[3]")
	private WebElement referingProviderDropdown;

	@FindBy(xpath = "//div[@class='dropdown-menu selectdrop-dropdown-menu mt-2 show']//input[@placeholder='Type to search...']")
	private WebElement referingProviderSearch;

	@FindBy(xpath = "//a[contains(text(),'Adler, Howard, MD (Dermatology, Outside)')]")
	private WebElement selectReferingProvider;

	@FindBy(xpath = "//b[contains(text(),'Appointment Type')]/parent::label/following::div[1]")
	private WebElement appointmentTypeDropdown;

	@FindBy(xpath = "//button[@id='schedule-appt-demo-next-btn']")
	private WebElement nextBtn;

	@FindBy(xpath = "//span[contains(text(),'Select appointment Type')]")
	private WebElement selectAppointment;

	@FindBy(xpath = "//div[@class='dropdown-menu selectdrop-dropdown-menu mt-2 show']//input[@placeholder='Type to search...']")
	private WebElement selectAppointmentSearch;

	@FindBy(xpath = "//a[contains(text(),'Copper and Eye mask - 60 min')]")
	private WebElement selectAppointmentType;

	@FindBy(xpath = "//a[contains(text(),'Fri')]")
	private WebElement fridayFilter;

	@FindBy(xpath = "//div[@class='card ']/div[2]/div[2]/a")
	private WebElement selectTimeSlot;

	@FindBy(xpath = "//*[@id='schedule-appt-time-next-btn']")
	private WebElement nextBtn2;

	@FindBy(xpath = "//input[@id='schedule-notes']")
	private WebElement comments;

	@FindBy(xpath = "//button[contains(text(),'Add to Schedule')]")
	private WebElement addToSchedule;

	@FindBy(xpath = "//i[@class='zmdi zmdi-filter-list']")
	private WebElement filterList;

	@FindBy(xpath = "//label[contains(text(),'Laurie Case')]/parent::div/input")
	private WebElement selectProvider;

	@FindBy(xpath = "//a[contains(text(),'Facilities')]")
	private WebElement facilities;

	@FindBy(xpath = "//div[@id='_u5_']//div[@class='pilldrop-list']//div[1]//input[1]")
	private WebElement selectFaciity;

	@FindBy(xpath = "//div[@class='card-footer text-center']//button[@type='button'][normalize-space()='Close']")
	private WebElement closeBtn;

	@FindBy(xpath = "//a[@class='btn-sched-action btn-action-confirm card-link-hide text-info text-nowrap']")
	private List<WebElement> confirmAptBtn;

	@FindBy(xpath = "//a[@class='btn-sched-action btn-action-cancel card-link-hide text-danger text-nowrap']")
	private List<WebElement> cancelAptBtn;

	@FindBy(xpath = "//a[@class='mega-menu do-logout-link']")
	private WebElement logout;

	@FindBy(xpath = "//h2[contains(text(),'Registration')]")
	private WebElement registrationTab;

	@FindBy(xpath = "//h2[contains(text(),'Insurance')]")
	private WebElement insuranceTab;

	@FindBy(xpath = "//h2[contains(text(),'Reschedule')]")
	private WebElement rescheduleTab;

	@FindBy(xpath = "//h2[contains(text(),'Templates')]")
	private WebElement templatesTab;

	@FindBy(xpath = "//h2[contains(text(),'Types')]")
	private WebElement typesTab;

	@FindBy(xpath = "//h2[contains(text(),'Blocks')]")
	private WebElement blocksTab;

	@FindBy(xpath = "//p[contains(text(),'Please select less than 10 facilites or 10 provide')]")
	private WebElement filterMessage;

	@FindBy(xpath = "//*[@id='cancel-appt-form']/div/div/button")
	private WebElement cancelReason;

	@FindBy(xpath = "//span[text()='Other']")
	private WebElement cancelReasonOther;

	@FindBy(xpath = "//button[text()='Cancel Only']")
	private WebElement cancelOnlyBtn;

	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	private WebElement dashboard;

	public void goBackToDashboard() {
		click(dashboard);
	}

	public SchedulePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean verifyVisibilityOFEverything() {

		click(schedule);
		log.info("Landed at Schedule Page.");
		boolean verifyAll = false;
		boolean regTab = visibilityCheck(registrationTab);
		log.info("Checked Visibility of registrationTab.");
		boolean insTab = visibilityCheck(insuranceTab);
		log.info("Checked Visibility of insuranceTab.");
		boolean resTab = visibilityCheck(rescheduleTab);
		log.info("Checked Visibility of rescheduleTab.");
		boolean tempTab = visibilityCheck(templatesTab);
		log.info("Checked Visibility of the templatesTab.");
		boolean tTab = visibilityCheck(typesTab);
		log.info("Checked Visibility of typesTab.");
		boolean bTab = visibilityCheck(blocksTab);
		log.info("Checked Visibility of blocksTab.");
		boolean filMsg = visibilityCheck(filterMessage);
		log.info("Checked Visibility of The Message Shown.");

		if (regTab && insTab && resTab && tempTab && tTab && bTab && filMsg) {
			verifyAll = true;
			log.info("Everything of Schedule Page Is Displayed.");
		}
		return verifyAll;
	}

	public void quickAdd() throws InterruptedException {

		Thread.sleep(7000L);
		click(addNewSchedule);
		log.info("Clicked on Add new appointment.");
		click(quickadd);
		log.info("Clicked on Quick Add.");
		click(selfPay);
		click(title);
		click(selectTitle);
		sendKeys(fName, firstname);
		sendKeys(lName, lastname);
		click(gender);
		click(selectGender);
		sendKeys(dob, "09191998");
		click(maritalStatus);
		click(SelectMaritalStatus);
		sendKeys(cellPhone, "7008528750");
		sendKeys(emailQuickadd, randomEmail);
		click(provider);
		Thread.sleep(3000L);
		click(selectProviderQuickadd);
		click(save);
		log.info("Add new patient Form filled.");
	}

	public void scheduleInfo() throws InterruptedException {

		Thread.sleep(4000L);
		click(patient);
		sendKeys(patientTxt, "Samaleswar mishra");
		Thread.sleep(5000L);
		click(selectPatient);
		click(locationDropdown);
		sendKeys(locationSearch, "boca");
		Thread.sleep(3000L);
		click(selectFromLocationDropdown);
		click(providerDropdown);
		sendKeys(providerSearch, "Case");
		Thread.sleep(3000L);
		click(selectFromProviderDropdown);
		click(referingProviderDropdown);
		Thread.sleep(2000L);
		sendKeys(referingProviderSearch, "adler");
		click(selectReferingProvider);
		click(selectAppointment);
		sendKeys(selectAppointmentSearch, "Copper and Eye");
		Thread.sleep(3000L);
		click(selectAppointmentType);
		Thread.sleep(2000L);
		click(nextBtn);
		Thread.sleep(4000L);
		log.info("Appointment Details are Filled.");
	}

	public void scheduleCalender() throws InterruptedException {

//		click(fridayFilter);
//		log.info("Filter Applied for Friday.");
		Thread.sleep(4000L);
		click(selectTimeSlot);
		log.info("Time Slot is Selected.");
		Thread.sleep(2000L);
		click(nextBtn2);
		sendKeys(comments, "Schedule Appointment.");
		Thread.sleep(2000L);
		click(addToSchedule);
		log.info("Appoinement is scheduled.");
	}

	public void confirmBooking() throws InterruptedException {
		Thread.sleep(3000L);
		click(filterList);
		Thread.sleep(2000L);
		click(selectProvider);
		click(closeBtn);
		Thread.sleep(5000L);
		for (int i = 0; i < confirmAptBtn.size(); i++) {
			if (confirmAptBtn.get(i).isDisplayed()) {
				confirmAptBtn.get(i).click();
			}
		}
		log.info("Booking is Confirmed.");
		Thread.sleep(5000L);
	}

	public void cancelBooking() {

		for (int i = 0; i < cancelAptBtn.size(); i++) {
			if (cancelAptBtn.get(i).isDisplayed()) {
				cancelAptBtn.get(i).click();
			}
		}
		click(cancelReason);
		click(cancelReasonOther);
		click(cancelOnlyBtn);
		log.info("Booking is Cancelled.");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
