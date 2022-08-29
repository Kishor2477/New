package com.leaftaps.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leaftaps.selenium.base.SeleniumBase;
import com.leaftaps.utils.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase{
//	public String dataSheetName;		
//
//	@DataProvider(name = "fetchData")
//	public Object[][] fetchData() throws IOException {
//		return DataLibrary.readExcelData(dataSheetName);
//	}	

	public String excelName;
	
	public String datasheetname;
	
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

}
