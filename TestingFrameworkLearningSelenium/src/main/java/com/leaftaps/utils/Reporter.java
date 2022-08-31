package com.leaftaps.utils;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public abstract class Reporter {
	
	public ExtentHtmlReporter reporter;
	public ExtentTest test;
	public ExtentReports report;
	
	
	@BeforeSuite
	public void startReport() {
		reporter = new ExtentHtmlReporter("./reports/report.html");
		reporter.setAppendExisting(true);
		report = new ExtentReports();
		report.attachReporter(reporter);
	}
	
	@BeforeClass
	public void reportDetails(String testname, String description, String testauthor, String testcategory) {
		test = report.createTest(testname,description);
		test.assignAuthor(testauthor);
		test.assignCategory(testcategory);
	}

	public abstract void takeSnap();
	
}
