package com.leaftaps.ui.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class Login extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		datasheetname = "TC001";
		testcasename = "First Login";
		testcasedesc = "Validating login";
		testCategory = "Smoke testing";
		testAuthor = "Author";
	}
	
@Test
public void simpleLogin() {
	
	String title = driver.getTitle();
	System.out.println(title);
}
@Test(dataProvider = "fetchdata")
public void loginPage(String uname,String password) throws InterruptedException, IOException {
	/*
	 * driver.findElement(By.id("username")).sendKeys(uname);
	 * driver.findElement(By.id("password")).sendKeys(password); Thread.sleep(2000);
	 */
	new LoginPage(driver,node).clickUsername(uname).typePassword(password).clickLogin();
	
	
}
}
