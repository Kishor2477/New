package com.leaftaps.seleniumapi.wrapper;

import static org.testng.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.api.Browser;
import com.leaftaps.utils.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium extends Reporter implements Browser{
	
	public RemoteWebDriver driver ;
	
	public RemoteWebDriver startApp(String url) {
		return startApp("chrome", url);
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		}catch(Exception e) {
			
	}
		return driver;
	}

	@Override
	public void takeSnap() {
		int randomnum = (int) (Math.random()*99999+10000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File ("./screenshots/img"+randomnum+".png");
		try {
			FileUtils.copyFile(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
