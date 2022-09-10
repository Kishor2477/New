package com.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;
import com.leaftaps.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(RemoteWebDriver driver, ExtentTest node){
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.node = node;
	}
	
	@FindBy(id ="username") WebElement eleUsername;
	@FindBy(id="password") WebElement elepassword;
	@FindBy(className = "decorativeSubmit") WebElement elelogin;
	
	public LoginPage typeUsername(String uname) {
		eleUsername.sendKeys(uname);
		return this;
	}
	public LoginPage typePassword(String pword) {
		elepassword.sendKeys(pword);
		return this;
	}
	public HomePage clickLogin() {
		click(elelogin);
		return new HomePage(driver, node);
	}
	
}
