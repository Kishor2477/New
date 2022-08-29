package com.leaftaps.selenium.api.design;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface Browser {
	
	public RemoteWebDriver startApp(String url) ;
	
	public RemoteWebDriver startApp(String browser, String url);

}
