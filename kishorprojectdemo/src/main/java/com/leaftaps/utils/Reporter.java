package com.leaftaps.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.leaftaps.base.ProjectSpecificMethods;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public abstract class Reporter extends AbstractTestNGCucumberTests {
	
	public static ExtentHtmlReporter reporter;
	
	public static ExtentReports extent;
	
	public String testcasename,testcasedesc,testAuthor,testCategory;
	
	public ExtentTest test, node;

	
	
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
	public void reportStep(String desc, String status) {
		if(status.equalsIgnoreCase("pass")) {
			try {
				node.pass(desc,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(status.equalsIgnoreCase("fail")) {
			try {
				node.fail(desc,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			throw new RuntimeException("Check Report");
		}
	}
	
	public abstract int takeSnap();

	
}
