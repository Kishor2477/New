package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
//Page Factory - Object Repository
	/*
	 * @FindBy(id="username") WebElement username;
	 * 
	 * @FindBy(id="password") WebElement password;
	 * 
	 * @FindBy(xpath="//input[@class='decorativeSubmit']") WebElement loginBtn;
	 * 
	 * @FindBy(id="username") WebElement username;
	 */
	
	@FindBy(how = How.ID,using = "username") private
	WebElement username;
	
	@FindBy(how = How.ID,using ="password") private
	WebElement password;
	
	@FindBy(how = How.XPATH,using ="//input[@class='decorativeSubmit']") private
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	/*
	 * public LoginPage enterUsername() {
	 * username.sendKeys(prop.getProperty("username")); return this; } public
	 * LoginPage enterPassword() { password.sendKeys(prop.getProperty("password"));
	 * return this; } public HomePage clickLogin() { loginBtn.click(); return new
	 * HomePage(); }
	 */
	
	public HomePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
}
