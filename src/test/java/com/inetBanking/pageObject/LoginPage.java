package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//identification part
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnlogin")
	@CacheLookup
	WebElement btnLogin;
	
	
	//operation part
	public void setUsername(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	public void setPassword(String upass)
	{
		txtUsername.sendKeys(upass);
	}

	public void clickSubmit()
	{
		txtUsername.click();
	}

	
}
