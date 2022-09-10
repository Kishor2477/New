package com.leaftaps.utils;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public abstract class Reporter extends AbstractTestNGCucumberTests{
	
	public ExtentHtmlReporter reporter;
	public ExtentTest test,node;
	public ExtentReports report;
	public String testname,description,testauthor,testcategory;
	public String excelFileName;
	
	@BeforeSuite
	public void startReport() {
		reporter = new ExtentHtmlReporter("./report/report.html");
		reporter.setAppendExisting(true);
		report = new ExtentReports();
		report.attachReporter(reporter);
	}
	
	@BeforeClass
	public void reportDetails() {
		test = report.createTest(testname,description);
		test.assignAuthor(testauthor);
		test.assignCategory(testcategory);
	}

	@AfterSuite
	public void closeReport() {
		report.flush();
	}
	public abstract int takeSnap();
	
	public void reportStep(String desc, String status) {
		if(status.equalsIgnoreCase("pass")) {
			try {
				node.pass(desc,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
				//test.pass(desc,MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
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
}
