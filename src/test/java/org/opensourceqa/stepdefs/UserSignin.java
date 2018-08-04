package org.opensourceqa.stepdefs;

import org.opensourceqa.helper.TestHelper;
import org.opensourceqa.pageobjects.AuthenticationPage;
import org.opensourceqa.pageobjects.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UserSignin {

	HomePage homePage = new HomePage(TestHelper.driver);
	AuthenticationPage authenticationPage = new AuthenticationPage(TestHelper.driver);
	
	@Given("^navigate to application$")
	public void navigate_to_application() throws Throwable {
	    TestHelper.driver.get("http://automationpractice.com/index.php");
	}
	
	@Then("^click on signin link$")
	public void click_on_signin_link() throws Throwable {
	    homePage.clickOnSignInLink();
	}

	@Then("^enter an email address as\"([^\"]*)\"$")
	public void enter_an_email_address_as(String arg1) throws Throwable {
	   authenticationPage.enterRegisteredEmailAddress(arg1);
	}
	
	@Then("^click on signin button$")
	public void click_on_signin_button() throws Throwable {
	   authenticationPage.clickOnSigninButton();
	}
}
