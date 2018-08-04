package org.opensourceqa.stepdefs;

import org.opensourceqa.helper.TestHelper;
import org.opensourceqa.pageobjects.AuthenticationPage;
import org.opensourceqa.pageobjects.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	HomePage homePage = new HomePage(TestHelper.driver);
	AuthenticationPage authenticationPage = new AuthenticationPage(TestHelper.driver);
	
/*	@Given("^navigate to application$")
	public void navigate_to_application() throws Throwable {
	    TestHelper.driver.get("http://automationpractice.com/index.php");
	}*/
	
	@Then("^click on signin link$")
	public void click_on_signin_link() throws Throwable {
	    homePage.clickOnSignInLink();
	}

	/*@Then("^enter an email address as\"([^\"]*)\"$")
	public void enter_an_email_address_as(String arg1) throws Throwable {
	   authenticationPage.enterNewEmailaddress(arg1);;
	}*/
	

	@Then("^click on create an account button$")
	public void click_on_create_an_account_button() throws Throwable {
	    
	}

	@Then("^select title as \"([^\"]*)\"$")
	public void select_title_as(String arg1) throws Throwable {
	    
	}

	@Then("^enter first name as \"([^\"]*)\"$")
	public void enter_first_name_as(String arg1) throws Throwable {
	    
	}

	@Then("^enter last name as\"([^\"]*)\"$")
	public void enter_last_name_as(String arg1) throws Throwable {
	    
	}

	@Then("^enter password as\"([^\"]*)\"$")
	public void enter_password_as(String arg1) throws Throwable {
	   
	}

	@Then("^select date of birth as \"([^\"]*)\"-\"([^\"]*)\"-\"([^\"]*)\"$")
	public void select_date_of_birth_as(String arg1, String arg2, String arg3) throws Throwable {
	    
	}

	@Then("^enter address first name as \"([^\"]*)\"$")
	public void enter_address_first_name_as(String arg1) throws Throwable {
	    
	}

	@Then("^enter address last name as \"([^\"]*)\"$")
	public void enter_address_last_name_as(String arg1) throws Throwable {
	    
	}

	@Then("^enter company name as \"([^\"]*)\"$")
	public void enter_company_name_as(String arg1) throws Throwable {
	    
	}

	@Then("^enter address as \"([^\"]*)\"$")
	public void enter_address_as(String arg1) throws Throwable {
	    
	}

	@Then("^enter city as \"([^\"]*)\"$")
	public void enter_city_as(String arg1) throws Throwable {
	    
	}

	@Then("^select state as \"([^\"]*)\"$")
	public void select_state_as(String arg1) throws Throwable {
	    
	}

	@Then("^enter zip code as \"([^\"]*)\"$")
	public void enter_zip_code_as(String arg1) throws Throwable {
	    
	}

	@Then("^select country as \"([^\"]*)\"$")
	public void select_country_as(String arg1) throws Throwable {
	    
	}

	@Then("^enter mobile number as \"([^\"]*)\"$")
	public void enter_mobile_number_as(String arg1) throws Throwable {
	    
	}

	@Then("^enter address alias as \"([^\"]*)\"$")
	public void enter_address_alias_as(String arg1) throws Throwable {
	    
	}

	@When("^click on Register button$")
	public void click_on_Register_button() throws Throwable {
	    
	}

	@Then("^verify regiestration status$")
	public void verify_regiestration_status() throws Throwable {
	    
	}



}
