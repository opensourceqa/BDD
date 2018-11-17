package org.opensourceqa.helper;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.opensourceqa.browser.Browser;
import org.opensourceqa.browser.Chrome;
import org.opensourceqa.configuration.Config;
import org.opensourceqa.configuration.ConfigurationSetup;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestHelper {
	
	public static WebDriver driver;
	
	private final Logger logger = LogHelper.getLogs(TestHelper.class);
	
	public static ExtentReports report;
	
	public static ExtentTest test;
	
	static{
		Calendar timeInstance = Calendar.getInstance();
		SimpleDateFormat  timestamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		report = new ExtentReports(System.getProperty("user.dir")+"/BDDCucumberWithTestNG/reports"+timestamp.format(timeInstance.getTime())+".html",false);
	}
	
	public void getresult(ITestResult result){
		if(result.getStatus() == ITestResult.SUCCESS){
			test.log(LogStatus.PASS, result.getName()+" test is PASS");
		}else if(result.getStatus() == ITestResult.SKIP){
			test.log(LogStatus.SKIP, result.getName()+" test is skipped and skip reason is "+result.getThrowable());
		}else if(result.getStatus() == ITestResult.FAILURE){
			test.log(LogStatus.ERROR, result.getName()+"test is failed "+result.getThrowable());
		}else if(result.getStatus() == ITestResult.STARTED){
			test.log(LogStatus.INFO, result.getName()+"test started ");
		}
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result){
		getresult(result);
	}
	
	@BeforeMethod
	public void beforMethod(Method result){
		test = report.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName()+ " test started");
	}
	
	@AfterClass (alwaysRun = true)
	public void endTest(Method method){
		report.endTest(test);
		report.flush();
	}
	
	
	public WebDriver getBrowserObject(Browser browser) throws Exception{
		
		try{
			logger.info(browser);
			switch(browser){
			
			case Chrome:
				Chrome chrome = Chrome.class.newInstance();
				return chrome.getChromeDriver(chrome.getChromeCapabilities());
			default:
				throw new Exception("Driver not found : " + new ConfigurationSetup().getBrowser());
			}
		}catch(Exception e){
			logger.equals(e);
			throw e;
		}
	}
	
	public void setupDriver(Browser bType) throws Exception{
		driver = getBrowserObject(bType);
		logger.debug("Initialize Webdriver : "+driver.hashCode());
		driver.manage().timeouts().pageLoadTimeout(Config.data.getPageLoadTime(), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Config.data.getImplicitWait(), TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Before
	public void before() throws Exception {
		
		Config.data = new ConfigurationSetup();
		setupDriver(Config.data.getBrowser());
			logger.info(Config.data.getBrowser());
	}
	
	@After
	public void after(Scenario scenario){
		//driver.quit();
		logger.info("");
	}
	
	
	
	

	
}
