package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.framework.driver.DriverManager;

public class Homepage {
	
	
	@FindBy(xpath = "(//div[@class=\"header\"][text()=\"Release Notes\"])[1]")
	WebElement homePage_notes;
	
	public Homepage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
		
	}
	
	public boolean verifyHomepage_Notes() {
		return homePage_notes.isDisplayed();
	}

}
