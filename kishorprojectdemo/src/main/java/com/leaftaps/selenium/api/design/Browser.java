package com.leaftaps.selenium.api.design;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface Browser {
	
	public RemoteWebDriver startApp(String url) ;
	
	public RemoteWebDriver startApp(String browser, String url);
	
	public WebElement locateElement(String value);
	
	public WebElement locateElement(String locator,String value);
	
	public void click(WebElement ele);
	
	public void switchToAlert();
	

}
