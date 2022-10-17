package com.inteBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends Baseclass {

	@Test
	public void VerifyLogin()
	{
		driver.get(baseUrl);
		LoginPage lp= new LoginPage(driver);
		lp.setUsername(uname);
		lp.setPassword(upass);
		lp.clickSubmit();
	}
}
