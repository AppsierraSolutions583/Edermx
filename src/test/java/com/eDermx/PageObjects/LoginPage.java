package com.eDermx.PageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.eDermx.generics.GeneralFunctions;

public class LoginPage extends GeneralFunctions {

	public WebDriver driver;
	public static Logger log = Logger.getLogger(LoginPage.class);

	private String username = "VGoel";
	private String pass = "Password1!";

	@FindBy(xpath = "//input[@id='login-name']")
	private WebElement id;

	@FindBy(xpath = "//input[@id='login-password']")
	private WebElement password;

	@FindBy(xpath = "//button[contains(text(),'SIGN IN')]")
	private WebElement signIn;

	@FindBy(xpath = "//a[@id='forgot-password-link']")
	private WebElement forgotPassword;

	@FindBy(xpath = "//a[contains(text(),'SUPPORT')]")
	private WebElement support;

	@FindBy(xpath = "//div[contains(text(),'Please reset your password')]")
	private WebElement errorMsg;

	@FindBy(xpath = "//small[contains(text(),'Super Admin')]")
	private WebElement verifyLogin;

	@FindBy(xpath = "//input[@id='practice-list-criteria']")
	private WebElement searchBarPractice;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]")
	private WebElement selectFromTable;

	@FindBy(xpath = "//small[contains(text(),'Welcome to eDerm')]")
	private WebElement daasboardVerify;

	@FindBy(xpath = "//a[@class='mega-menu do-logout-link']")
	private WebElement logout;
	
	@FindBy(xpath = "//h5[contains(text(),'Log in')]")
	private WebElement logoutVerify;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean positiveLoginTest() {
		
		sendKeys(id, username);
		sendKeys(password, pass);
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(signIn);
		
		
		
		boolean plTest = visibilityCheck(verifyLogin);
		log.info("SignIn is Done.");
		return plTest;
	}

	public boolean negativeLoginTest() {
		sendKeys(id, "Testing");
		sendKeys(password, "Testing");
		click(signIn);
		boolean nlTest = visibilityCheck(errorMsg);
		log.info("Negative SignIn is Verified.");
		return nlTest;
	}

	public boolean selectPractice() {
		sendKeys(searchBarPractice, "dermatology of boca");
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(selectFromTable);
		log.info("Dermatology of Boca is Selected as Practice.");
		boolean verify = daasboardVerify.isDisplayed();
		return verify;
	}

	public boolean signOut() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(logout);
		boolean logoutVfy = visibilityCheck(logoutVerify);
		log.info("LogOut is Done.");
		return logoutVfy;

	}

}
