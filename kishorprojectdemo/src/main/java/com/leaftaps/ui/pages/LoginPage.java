package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	@FindBy(id = "username")
	WebElement elementusername;
	@FindBy(id = "password") WebElement elementpassword;
	@FindBy(className = "decorativeSubmit") WebElement elementLogin;
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickUsername(String uname) {
		elementusername.sendKeys(uname);;
		return this;
	}
	
	public LoginPage typePassword(String password) {
		elementpassword.sendKeys(password);
		return this;
	}
	public LoginPage clickLogin() {
		elementLogin.click();
		return this;
	}
	

}
