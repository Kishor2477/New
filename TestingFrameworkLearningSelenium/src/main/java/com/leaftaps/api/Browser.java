package com.leaftaps.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface Browser {
	
	public RemoteWebDriver startApp(String url);
	
	public RemoteWebDriver startApp(String browser,String url);

	void takeSnap();
	

}
