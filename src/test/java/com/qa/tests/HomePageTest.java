package com.qa.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.Homepage;
import com.pages.LoginPage;
import com.qa.baseTest.BaseTest;
import com.qa.framework.config.ConfigReader;

public class HomePageTest extends BaseTest{
	Homepage homepage; // am updated from VS code.. in feature_Ora3 branch
	LoginPage loginpage;  // am into Branch ORA3
	@BeforeMethod
	public void initPages() {
		loginpage=new LoginPage(); 
		homepage=loginpage.doLogin(ConfigReader.get("username"), ConfigReader.get("password")); // am adding from VS_code...
	}
	
	@Test(priority = 1)
	public void verifyHomepage() {
		assertTrue(homepage.verifyHomepage_Notes(), "Homepage Notes is not found..");
	}
	
	
	

}
