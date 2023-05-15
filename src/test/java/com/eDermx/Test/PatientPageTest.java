package com.eDermx.Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.eDermx.PageObjects.LoginPage;
import com.eDermx.PageObjects.PatientsPage;
import com.eDermx.generics.TestBase;

public class PatientPageTest extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void scheduleForAppointment() throws InterruptedException {
		LoginPage lp=new LoginPage(TestBase.driver);
		
		sa.assertTrue(lp.positiveLoginTest());
		sa.assertTrue(lp.selectPractice());
		
		PatientsPage pp=new PatientsPage(TestBase.driver);
		pp.verifyVisibilityAllElement();
		pp.searchForPatient();		
		pp.patientProfile();
		pp.addAndRemoveContact();
		//sa.assertTrue(lp.signOut());
	}
	
	

}
