package com.leaftaps.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leaftaps.seleniumapi.wrapper.Selenium;
import com.leaftaps.utils.DataLibrary;

public class ProjectSpecificMethods extends Selenium {
	public String excelFileName;
	@BeforeMethod
	public void beforeMethod() {
		startApp("http://leaftaps.com/opentaps/control/main");
		node = test.createNode(testname);
	}
	
	@AfterMethod
	public void tearDown() {
		quit();
	}
	
	@DataProvider(name = "readData")
	public Object[][] readData() throws IOException {
		return DataLibrary.readExcelFromData(excelFileName);
	}

}
