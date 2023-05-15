package com.eDermx.Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.eDermx.PageObjects.LoginPage;
import com.eDermx.generics.TestBase;

public class LoginPageTest extends TestBase {

	SoftAssert sa=new SoftAssert();
	

	@Test
	public void LoginAction() {
		LoginPage lp=new LoginPage(TestBase.driver);
		sa.assertTrue(lp.negativeLoginTest());
		sa.assertTrue(lp.positiveLoginTest());
		
	}
	
	

}
