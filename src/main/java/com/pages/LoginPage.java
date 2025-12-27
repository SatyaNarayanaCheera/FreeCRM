package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.framework.driver.DriverManager;


public class LoginPage{

	@FindBy(css = "div.rd-navbar-wrap>div~div ul a[href=\"https://ui.freecrm.com\"]")
	WebElement login_link;
	
	@FindBy(css = "input[name='email']")
	WebElement userName;

	@FindBy(css="input[name='password']")
	WebElement password;
	
	
	@FindBy(xpath="//div[text()=\"Login\"]")
	WebElement sign_in;
	
	//div//a[text()="Forgot your password?"]
	
	@FindBy(xpath="//div//a[text()=\"Forgot your password?????\"]")
	WebElement loginpage_Forgotpassword_Link;
	
public LoginPage() {
	PageFactory.initElements(DriverManager.getDriver(), this);
}


public String getLoginPageTitle() {
	return DriverManager.getDriver().getTitle();
}


public boolean forgotPasswordLink() {
	login_link.click();
	return loginpage_Forgotpassword_Link.isDisplayed();
	
}
public Homepage doLogin(String uname, String pwd) {
	login_link.click();
	userName.sendKeys(uname);
	password.sendKeys(pwd);
	sign_in.click();
	return new Homepage();
	
	
}


}
