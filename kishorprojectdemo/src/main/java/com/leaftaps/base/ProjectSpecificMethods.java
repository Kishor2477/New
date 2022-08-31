package com.leaftaps.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.leaftaps.selenium.base.SeleniumBase;
import com.leaftaps.utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase{
	
 String excelName;
	
	public String datasheetname;
	

	
	@DataProvider(name = "fetchdata")
	public Object[][] fetchdata() throws IOException {
		return DataLibrary.readExcelData(datasheetname);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		startApp("http://leaftaps.com/opentaps");
		node = test.createNode(testcasename);
		
		//return this;
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
}
