package com.eDermx.Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.eDermx.PageObjects.SchedulePage;
import com.eDermx.PageObjects.LoginPage;
import com.eDermx.generics.TestBase;

public class SchedulePageTest extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void scheduleForAppointment() throws InterruptedException {
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(lp.selectPractice());
		
		SchedulePage hp=new SchedulePage(TestBase.driver);
		sa.assertTrue(hp.verifyVisibilityOFEverything());
		hp.quickAdd();
		hp.scheduleInfo();
		hp.scheduleCalender();
		hp.confirmBooking();
		hp.cancelBooking();
		
		//sa.assertTrue(lp.signOut());
	}
	
	

}
