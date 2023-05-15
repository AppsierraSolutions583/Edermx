package com.eDermx.Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.eDermx.PageObjects.DashboardPage;
import com.eDermx.PageObjects.LoginPage;
import com.eDermx.generics.TestBase;

public class DashboardPageTest extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void dashboardVerification() {
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(lp.selectPractice());
		
		DashboardPage dp=new DashboardPage(TestBase.driver);
		sa.assertTrue(dp.verifyDisplayOfAllElements());
		sa.assertTrue(dp.searchPatient());
		
		sa.assertTrue(lp.signOut());
		
	}
	
	

}
