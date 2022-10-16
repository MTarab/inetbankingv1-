package com.inetBanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	//we use constructor so whenever we call this class automatically constructor get executed
	public ReadConfig()
	{
	 File f= new File("./Configurationfiles/config.properties");
	 try {
		FileInputStream fis = new FileInputStream(f);
		pro= new Properties();
		pro.load(fis);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	 //to read value of config property file 
//to read each and every variable we use method for fetching values for the same 	 
	
	public String getAppUrl()
	{
		String url=pro.getProperty("baseUrl");
		return url;
	}
	 
	public String getUserName()
	{
		String usernm=pro.getProperty("uname");
		return usernm;
	}
	
	public String getPassword()
	{
		String upasswrd=pro.getProperty("upass");
		return upasswrd;
	}

}
