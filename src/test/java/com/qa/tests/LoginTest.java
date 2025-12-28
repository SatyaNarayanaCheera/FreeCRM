package com.qa.tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.Utility;
import com.qa.baseTest.BaseTest;
import com.qa.framework.config.ConfigReader;

public class LoginTest extends BaseTest{
	
	LoginPage loginpage;

	@BeforeMethod
	public void initPages() {
		loginpage=new LoginPage();
	}
	@Test(priority = 1)

	public void verifyLoginPageTitleTest() {
		String loginPage_title=loginpage.getLoginPageTitle();
		Assert.assertEquals(loginPage_title, Utility.loginPage_Title,"Login page Title is not correct");
	}
	
	@Test(priority = 2)
	public void verifyForgotPasswordLinkTest() {
		assertTrue(loginpage.forgotPasswordLink(), "Missing Forgot Password Link on Login page");
	}
	
@Test(priority = 3)
public void verifyLoginPageTest() {
	loginpage.doLogin(ConfigReader.get("username"), ConfigReader.get("password"));
	System.out.println("verifyLoginPageTest...");
}


}
