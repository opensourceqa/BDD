package org.opensourceqa.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.opensourceqa.helper.LogHelper;
import org.opensourceqa.helper.WaitHelper;

public class AuthenticationPage {
	
	WebDriver driver;
	private final Logger logger = LogHelper.getLogs(HomePage.class);
	WaitHelper control;
	
	@FindBy( className = "icon-home")
	WebElement home_icon;

	@FindBy(id = "SubmitCreate")
	WebElement createAnAcount_btn;
	
	@FindBy(id = "email_create")
	WebElement newEmailAddress;
	
	@FindBy(id = "email")
	WebElement registeredEmailAddress;
	
	@FindBy(id = "passwd")
	WebElement password;
	
	@FindBy(xpath = "//*[contains(text(),'Sign in')]")
	WebElement signin_btn;
	
	public AuthenticationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		control = new WaitHelper(driver);
		control.waitForElementToBeClickable(driver, signin_btn, 100);
	}
	
	public HomePage clickOnHomeIcon(WebDriver driver){
		logger.info("Go back to Home Page");
		home_icon.click();
		return new HomePage(driver);
	}
	
	public void enterNewEmailaddress(String emailAddress){
		logger.info("Entering email address as "+emailAddress);
		this.newEmailAddress.sendKeys(emailAddress);
	}
	
	public void enterRegisteredEmailAddress(String emailAddress){
		logger.info("Entering email address as "+emailAddress);
		this.registeredEmailAddress.sendKeys(emailAddress);
	}
	
	public void enterPassword(String password){
		logger.info("Entering email address as "+password);
		this.password.sendKeys(password);
	}
	
	public UserAccount clickOnSigninButton(){
		logger.info("Go back to Home Page");
		signin_btn.click();
		return new UserAccount(driver);
	}

}
