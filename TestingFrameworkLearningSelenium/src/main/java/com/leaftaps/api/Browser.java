package com.leaftaps.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface Browser {
	
	public RemoteWebDriver startApp(String url);
	
	public RemoteWebDriver startApp(String browser,String url);

	public void click(WebElement ele);
	
	public WebElement locateElement(String id);
	
	public WebElement locateElement(String locator,String value);
	
	public void switchToAlert();
	
	public void acceptAlert();
	
	public void dismissAlert();
	
	public void getAlertText();
	
	public void alertSendValues(String value);
	
	public void switchtoFrame(int index);
	
	public void switchtoFrame(String nameId);
	
	public void switchtoFrame(WebElement ele);
	
	public void switchtoDefaultContent();
	
	public void switchtoParentFrame();
	
	public void switchToWindow();
	
	public void switchToWindows(int index);
	
	public void quit();
	
	
	
	

}
