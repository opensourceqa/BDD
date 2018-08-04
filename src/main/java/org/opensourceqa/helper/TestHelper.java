package org.opensourceqa.helper;

import java.util.Calendar;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import java.text.SimpleDateFormat;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

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
	
}
