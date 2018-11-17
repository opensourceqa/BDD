package org.opensourceqa.configuration;

import org.apache.log4j.Level;
import org.opensourceqa.browser.Browser;



public interface Configuration {

	public String getUserName();
	public String getPassword();
	public int getImplicitWait();
	public int getExplicitWait();
	public int getPageLoadTime();
	public String getAppUrl();
	public Level getLoggerLevel();
	public Browser getBrowser();
}
