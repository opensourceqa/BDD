package org.opensourceqa.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.opensourceqa.helper.DropDownHelper;
import org.opensourceqa.helper.LogHelper;
import org.opensourceqa.helper.WaitHelper;

public class UserRegistrationPage {
	WebDriver driver;
	private final Logger logger = LogHelper.getLogs(UserRegistrationPage.class);
	WaitHelper control;
	DropDownHelper dropdown = new DropDownHelper(driver);
	
	@FindBy(id = "uniform-id_gender1")
	WebElement mr_radio_btn;
	
	@FindBy(id = "customer_firstname")
	WebElement users_firstname;
	
	@FindBy(id = "customer_lastname")
	WebElement users_lastname;
	
	@FindBy(id = "email")
	WebElement user_email;
	
	@FindBy(id = "passwd")
	WebElement newpassword;
	
	@FindBy(id = "days")
	WebElement date;
	
	@FindBy(id = "months")
	WebElement month;
	
	@FindBy(id = "years")
	WebElement year;
	
	@FindBy(id = "firstname")
	WebElement address_firstname;
	
	@FindBy(id = "lastname")
	WebElement address_lastname;
	
	@FindBy(id = "company")
	WebElement company_name;
	
	@FindBy(id = "address1")
	WebElement street_address;
	
	@FindBy(id = "city")
	WebElement city_name;
	
	@FindBy(id = "id_state")
	WebElement state;
	
	@FindBy(id = "postcode")
	WebElement postalcode;
	
	@FindBy(id = "id_country")
	WebElement country;
	
	@FindBy(id = "phone_mobile")
	WebElement mobile_number;
	
	@FindBy(id = "alias")
	WebElement address_alias;
	
	@FindBy(id = "submitAccount")
	WebElement register_btn;
	
	public UserRegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		control = new WaitHelper(driver);
		control.waitForElementToBeClickable(driver, register_btn, 100);
	}

	public void selectMrRadioButton(){
		logger.info("Selecting Mr radio button");
		mr_radio_btn.click();
	}
	
	public void enterUsersFirstName(String usersFirstName){
		logger.info("Entering users first name");
		users_firstname.sendKeys(usersFirstName);
	}
	
	public void enterUsersLastName(String usersLastName){
		logger.info("Entering users first name");
		users_lastname.sendKeys(usersLastName);
	}
	
	public void enterEmail(String email){
		logger.info("Entering users first name");
		user_email.sendKeys(email);
	}
	
	public void enterPassword(String password){
		logger.info("Entering users first name");
		newpassword.sendKeys(password);
	}
	
	public void selectDate(String date){
		logger.info("Selecting date");
		dropdown.selectAnOption(this.date, date);
	}
	
	public void selectMonth(String month){
		logger.info("Selecting month");
		dropdown.selectAnOption(this.month, month);
	}
	
	public void selectYear(String year){
		logger.info("Selecting year");
		dropdown.selectAnOption(this.year, year);
	}
	
	public void enterCompanyName(String companyName){
		logger.info("Entering users company name");
		company_name.sendKeys(companyName);
	}
	
	public void enterStreetAddress(String street_address){
		logger.info("Entering users street address");
		this.street_address.sendKeys(street_address);
	}
	
	public void enterCity(String city){
		logger.info("Entering users city name");
		this.city_name.sendKeys(city);
	}
	
	public void selecState(String state){
		logger.info("Selecting users state");
		dropdown.selectAnOption(this.state, state);
	}
	
	public void enterPostalCode(String postalcode){
		logger.info("Entering users postcode");
		this.postalcode.sendKeys(postalcode);
	}
	
	public void selecCountry(String country){
		logger.info("Selecting users state");
		dropdown.selectAnOption(this.country, country);
	}
	
	public void enterMobileNumber(String mobile_number){
		logger.info("Entering users mobile number");
		this.mobile_number.sendKeys(mobile_number);
	}
	
	public void enterAddressAlias(String address_alias){
		logger.info("Entering users postcode");
		this.address_alias.sendKeys(address_alias);
	}
	
	
	
}
