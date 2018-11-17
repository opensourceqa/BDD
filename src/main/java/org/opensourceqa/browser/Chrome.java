package org.opensourceqa.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chrome {
	public Capabilities getChromeCapabilities(){
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		DesiredCapabilities chrome = DesiredCapabilities.chrome();
		chrome.setJavascriptEnabled(true);
		chrome.setCapability(ChromeOptions.CAPABILITY, option);
		return chrome;
	}
	
	public WebDriver getChromeDriver(Capabilities cap){
		
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\BDDCucumberWithTestNG\\src\\main\\resources\\driver\\chromedriver.exe");
		return 	new ChromeDriver();

	}
}
