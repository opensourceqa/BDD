package org.opensourceqa.pageobjects;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.opensourceqa.helper.LogHelper;
import org.opensourceqa.helper.WaitHelper;

public class UserAccount {
	WebDriver driver;
	//private final Logger logger = LogHelper.getLogs(HomePage.class);
	WaitHelper control;
	
	@FindBy(xpath = "//*[text()= 'Order history and details']")
	WebElement orderHistory_tab;
	
	@FindBy(xpath = "//*[text()= 'My credit slips']")
	WebElement credit_Slips_tab;
	
	@FindBy(xpath = "//*[text()= 'My addresses']")
	WebElement addresses_tab;
	
	@FindBy(xpath = "//*[text()= 'My personal information']")
	WebElement personalInfo_tab;
	
	@FindBy(xpath = "//*[text()= 'My wishlists']")
	WebElement wishlists_tab;

	public UserAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		control = new WaitHelper(driver);
		control.waitForElementToBeClickable(driver, wishlists_tab , 100);
	}
	
	
	
}
