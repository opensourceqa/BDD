package org.opensourceqa.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogHelper {
	
	private static boolean root = false;

	@SuppressWarnings("rawtypes")
	public static Logger getLogs(Class classname){
		
		if(root){
			return Logger.getLogger(classname);
		}
		PropertyConfigurator.configure("E:\\workspace\\BDDCucumberWithTestNG\\src\\main\\resources\\logger\\log4j.properties");
		root = true;
		return Logger.getLogger(classname);
	}
}
