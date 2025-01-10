package com.MyStore.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Read_Config_File {

	
	Properties prop;
	String configpath="C:\\Users\\ashvi\\eclipse-workspace\\BDD_Framework\\CodeStudio_Project\\Configuration_Folder\\Config.properties";
	
	
	//Constructor
	public Read_Config_File() {
		try {
			prop =new Properties();
		
		//To read file 		
			FileInputStream file=new FileInputStream(configpath);
			prop.load(file);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	// write method for read base URl:
	
	public String getBaseURL() {
		String urlValue=prop.getProperty("baseUrl");
		
		if(urlValue!=null) {
			return urlValue;
		}else {
			throw new RuntimeException("Url Not found");
		}
	}
	
	//  method for read  Browser:
	public String getBrowser() {
		String browserValue=prop.getProperty("browser");
		
		if(browserValue!=null) {
			return browserValue;
			}
		else {
			throw new RuntimeException("Browser Not FOund ");
			
		}
	}
	
//  method for read  UserName:
	public String getEmail() {
		String emailValue=prop.getProperty("email");
		
		if(emailValue!=null) {
			return emailValue;
			}
		else {
			throw new RuntimeException("Browser Not FOund ");
			
		}
	}
	
	
//  method for read  Password:
	public String getPassword() {
		String passwordValue=prop.getProperty("password");
		
		if(passwordValue!=null) {
			return passwordValue;
			}
		else {
			throw new RuntimeException("Browser Not FOund ");
			
		}
	}
}
