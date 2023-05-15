package com.eDermx.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.eDermx.PageObjects.BillingPage;
import com.eDermx.PageObjects.DashboardPage;
import com.eDermx.PageObjects.LoginPage;
import com.eDermx.PageObjects.PatientsPage;
import com.eDermx.PageObjects.SchedulePage;
import com.eDermx.generics.TestBase;

public class EDermxEndToEnd extends TestBase {

	

	@Test(priority = 1)
	public void logInNegative() throws InterruptedException {
		LoginPage lp = new LoginPage(TestBase.driver);
		Assert.assertTrue(lp.negativeLoginTest());
	}

	@Test(priority = 2)
	public void logInPositive() throws InterruptedException {
		LoginPage lp = new LoginPage(TestBase.driver);
		Assert.assertTrue(lp.positiveLoginTest());
		Assert.assertTrue(lp.selectPractice());

	}

	@Test(priority = 3)
	public void dashBoard() {
		DashboardPage dp = new DashboardPage(TestBase.driver);
		Assert.assertTrue(dp.verifyDisplayOfAllElements());
		Assert.assertTrue(dp.searchPatient());

	}

	@Test(priority = 4)
	public void schedule() throws InterruptedException {
		SchedulePage hp = new SchedulePage(TestBase.driver);
		Assert.assertTrue(hp.verifyVisibilityOFEverything());
		hp.quickAdd();
		hp.scheduleInfo();
		hp.scheduleCalender();
		hp.confirmBooking();
		hp.cancelBooking();
		hp.goBackToDashboard();
	}

	@Test(priority = 5)
	public void patient() throws InterruptedException {
		PatientsPage pp = new PatientsPage(TestBase.driver);
		Assert.assertTrue(pp.verifyVisibilityAllElement());
		pp.searchForPatient();
		pp.patientProfile();
		pp.addAndRemoveContact();
		pp.goBackToDashboard();

	}

	@Test(priority = 6)
	public void Billing() throws InterruptedException {
		BillingPage bp = new BillingPage(TestBase.driver);
		Assert.assertTrue(bp.visibilityCheckOfAllElements());
		bp.clickOnTabs();

	}

	@Test(priority = 7)
	public void logOut() {
		LoginPage lp = new LoginPage(TestBase.driver);
		Assert.assertTrue(lp.signOut());
	}
}
