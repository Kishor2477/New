package com.crm.qa.base;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*
		 * if(browsername.equals("Chrome")) { WebDriverManager.chromedriver().setup();
		 * driver = new ChromeDriver(); }
		 */
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leaftaps.com");
	}

}
