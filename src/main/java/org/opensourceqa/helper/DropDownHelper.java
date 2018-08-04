package org.opensourceqa.helper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper {
	WebDriver driver;
	private final Logger logger = LogHelper.getLogs(DropDownHelper.class);
	
	public DropDownHelper(WebDriver driver) {
		this.driver = driver;
		logger.debug("DropDownHelper : " +this.driver.hashCode());
	}
	
	public void selectAnOption(WebElement dropDown, String option){
		Select control = new Select(dropDown);
		control.selectByVisibleText(option);
		logger.info("Locator : "+dropDown+" and option : "+option);
	}
	

}
