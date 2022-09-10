package com.leaftaps.tests;

import javax.security.auth.login.LoginContext;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class CreateLogin extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setUp() {
		testname = "New Login setup";
		description = "Setup Working fine ";
		testauthor = "Kishore";
		testcategory = "Functional";
		excelFileName = "TC001";
	}

	@Test(dataProvider = "readData")
	public void create(String uname,String pword,String Cname) throws Exception{
		new LoginPage(driver, node).typeUsername(uname).typePassword(pword).clickLogin().HomePage()
		.verifyHomePage().clickCreate().verifyCreateLead().typeCompanyName().typeFirstName(Cname);
	}
}
