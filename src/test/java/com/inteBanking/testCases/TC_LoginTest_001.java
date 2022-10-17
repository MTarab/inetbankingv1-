package com.inteBanking.testCases;

import javax.management.DescriptorKey;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends Baseclass {

	//login test
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
