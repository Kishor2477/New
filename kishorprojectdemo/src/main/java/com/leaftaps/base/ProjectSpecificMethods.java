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
	
	public static ExtentHtmlReporter reporter;
	
	public static ExtentReports extent;
	
	public String testcasename,testcasedesc,testAuthor,testCategory;

	public String excelName;
	
	public String datasheetname;
	
	public static ExtentTest test;
	
	@DataProvider(name = "fetchdata")
	public Object[][] fetchdata() throws IOException {
		return DataLibrary.readExcelData(datasheetname);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		startApp("http://leaftaps.com/opentaps");
		
		//return this;
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@BeforeSuite
	public void startReport() {
		reporter = new ExtentHtmlReporter("./report/new.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@BeforeClass
	public void testCaseDetails() {
		test = extent.createTest(testcasename, testcasedesc);
		test.assignAuthor(testAuthor);
		test.assignCategory(testCategory);
	}
	@AfterSuite
	public void closeReport() {
		extent.flush();
	}
	public void reportStep(String desc, String status) throws IOException {
		if(status.equalsIgnoreCase("pass")) {
			test.pass(desc,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
		}else if(status.equalsIgnoreCase("fail")) {
			test.fail(desc,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
			throw new RuntimeException("Check Report");
		}
	}
	
	public int takeSnap() throws IOException {
		int randomNum = (int) (Math.random()*99999+10000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File file = new File ("./snaps/img"+randomNum+".png");
		FileUtils.copyFile(source, file);
		return randomNum;
	}
	
	
	
}
