package org.opensourceqa.configuration;

import java.util.Properties;

import org.apache.log4j.Level;
import org.opensourceqa.browser.Browser;
import org.opensourceqa.utils.Resource;




public class ConfigurationSetup implements Configuration{

	private Properties configdata = null;
	
	
	
	public ConfigurationSetup() {
		configdata = new Properties();
		try{
			configdata.load(Resource.getResourceInputStream("/src/main/resources/configfiles/config.properties"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public String getUserName(){
		return configdata.getProperty("Username");
	}
	
	public String getPassword(){
		return configdata.getProperty("Password");
	}
	
	public int getImplicitWait(){
		return Integer.parseInt(configdata.getProperty("ImplicitWait"));
	}
	
	public int getExplicitWait(){
		return Integer.parseInt(configdata.getProperty("ExplicitWait"));
	}
	
	public int getPageLoadTime(){
		return Integer.parseInt(configdata.getProperty("PageLoadTime"));
	}
	
	public String getAppUrl(){
		return configdata.getProperty("AppURL");
	}
	
	public Level  getLoggerLevel(){
		switch (configdata.getProperty("Logger.Level")){
		
		case "DEBUG":
			return Level.DEBUG;
		case "INFO":
			return Level.INFO;
		case "WARN":
			return Level.WARN;	
		case "ERROR":
			return Level.ERROR;
		case "FATAL":
			return Level.FATAL;
		}
		return Level.ALL;
	}
	
	public Browser getBrowser() {
		return Browser.valueOf(configdata.getProperty("Browser"));
	}
	
	public String getDbType(){
		return configdata.getProperty("DataBase.Type");
	}
	
	public String getDbConnStr(){
		return configdata.getProperty("DataBase.ConnectionStr");
	}

}
