package com.leaftaps.ui.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leaftaps.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	@FindBy(id = "username")
	WebElement elementusername;
	@FindBy(id = "password") WebElement elementpassword;
	@FindBy(className = "decorativeSubmit") WebElement elementLogin;
	
	public LoginPage(RemoteWebDriver driver,ExtentTest node) {
		this.driver = driver;
		this.node = node;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickUsername(String uname) throws IOException {
		try {
			elementusername.sendKeys(uname);
			reportStep("The Username typed is Correct", "pass");
		} catch (Exception e) {
			reportStep("The Username typed is InCorrect", "fail");
			
		}
		return this;
	}
	
	public LoginPage typePassword(String password) throws IOException {
		try {
			elementpassword.sendKeys(password);
			reportStep("The Password typed is Correct", "pass");
		} catch (Exception e) {
			
			reportStep("The Password typed is InCorrect", "fail");
		}
		return this;
	}
	public LoginPage clickLogin() throws IOException {
		try {
			elementLogin.click();
			
			reportStep("Login Clicked Successfully", "pass");
		} catch (Exception e) {
			reportStep("Login is not Clicked Successfully", "fail");
		}
		return this;
	}
	

}
