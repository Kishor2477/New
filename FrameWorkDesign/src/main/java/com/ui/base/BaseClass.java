package com.ui.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	
	@FindBy(id ="username")
	WebElement username;
	
	BaseClass(){
		PageFactory.initElements(driver, this);
	}
	@Test
	public void beforeMethod() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/main");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(new File("./src/main/java/com/ui/utils/config.properties"));
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		//username.sendKeys(prop.getProperty("username"));
		//username.sendKeys(prop.getProperty("username"));
		username.sendKeys("DemoSalesManager");
		
		
	}
	
}
