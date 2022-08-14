package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class TestBase {
	public static Properties prop;
	public static ChromeDriver driver;

	public TestBase() {

		prop = new Properties();

		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\kishor\\eclipse-workspace1\\FreeCRMTest\\src\\main\\java\\com\\qa\\crm\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initialization() {
		String browsername = prop.getProperty("browser");

		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();

		if (browsername.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/");
	}

}
