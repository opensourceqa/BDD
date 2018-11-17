package org.opensourceqa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;



public class Resource {
	public static String getResourcePath(String resource){
		String path = getResourceBasePath()+ resource;
		return path;
	}
	
	public static String getResourceBasePath(){
		String path = System.getProperty("user.dir");
		return path;
	}
	
	public static InputStream getResourceInputStream(String resource) throws FileNotFoundException{
		return new FileInputStream(Resource.getResourcePath(resource));
	}
}
