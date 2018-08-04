package org.opensourceqa.helper;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	private WebDriver driver;
	private Logger logger = LogHelper.getLogs(WaitHelper.class);
	
	public WaitHelper(WebDriver driver) {
		this.driver = driver;
		logger.debug("WaitHelper : "+this.driver.hashCode());
	}
	
	public void waitImplicitly(long timeout, TimeUnit unit){
		logger.info("Waiting for "+timeout+" "+unit.toString());
		driver.manage().timeouts().implicitlyWait(timeout, unit);
	}
	
	public void waitForElementToBeVisible(WebDriver driver, WebElement element, long timeout ){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		logger.info("Element found "+element.getText());
	}
	
	public void waitForElementToBeClickable(WebDriver driver, WebElement element, long timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		logger.info("Element found "+element.getText());
	}
	
	public WebDriverWait waitMax(long timeoutInSecond, Duration pollingTimeInSecond){
		logger.debug("");
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSecond);
		wait.pollingEvery(pollingTimeInSecond);
		wait.ignoring(NoSuchFrameException.class);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		return wait;
	}
	
	public void waitForElementFluently(WebElement element, long timeout, Duration interval){
		WebDriverWait wait = waitMax(timeout, interval);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
