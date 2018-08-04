package org.opensourceqa.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.opensourceqa.helper.LogHelper;
import org.opensourceqa.helper.WaitHelper;

public class HomePage {
	
	WebDriver driver;
	private final Logger logger = LogHelper.getLogs(HomePage.class);
	WaitHelper control;
	
	@FindBy(xpath = "//*[contains(text(),'Sign in')]")
	WebElement signInLink;
	
	@FindBy( id = "homepage-slider")
	WebElement homepage_slider;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		control = new WaitHelper(driver);
		control.waitForElementToBeClickable(driver, homepage_slider, 100);
	}

	public AuthenticationPage clickOnSignInLink(){
		logger.info("Click on Sign in link");
		signInLink.click();
		return new AuthenticationPage(driver) ;
	}

}
