package com.leaftaps.selenium.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.selenium.api.design.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBase implements Browser{
	public RemoteWebDriver driver;
	
	public RemoteWebDriver startApp(String url) {
		return startApp("chrome",url);
	}
	
	public RemoteWebDriver startApp(String browser,String url) {
		try {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		catch(Exception e){
			System.out.println("No Exception occurs");
		}
		return driver;
		
		
	}

}
