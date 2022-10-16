package com.inteBanking.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	
	
	ReadConfig rd =new ReadConfig();
	public String baseUrl=rd.getAppUrl();
	public String uname=rd.getUserName();
	public String upass=rd.getPassword();
	public static WebDriver driver;
	public Logger logger;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		if(br.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
	}
	
	public void capturescreenshot(WebDriver driver,String tcname) throws IOException
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir")+"/Screenshots/"+tcname+ ".png");
		FileUtils.copyFile(f, destFile);
		System.out.println("screenshot taken");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	
}
