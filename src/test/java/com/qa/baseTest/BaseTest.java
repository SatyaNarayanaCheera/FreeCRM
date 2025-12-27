package com.qa.baseTest;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.pages.Utility;
import com.qa.framework.config.ConfigReader;
import com.qa.framework.driver.DriverFactory;
import com.qa.framework.driver.DriverManager;

public class BaseTest {
	
	@BeforeMethod
	@Parameters("browser")
	public void setUp(String browser) {
	    WebDriver driver = DriverFactory.createDriver(browser);
	    DriverManager.setDriver(driver);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.IMPLICIT_WAIT));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.PAGE_LOAD_TIMEOUT));
	    
	    driver.get(ConfigReader.get("URL"));
	    
	}

	@AfterMethod
	public void tearDown() {
	    DriverManager.unload();
	}

}
