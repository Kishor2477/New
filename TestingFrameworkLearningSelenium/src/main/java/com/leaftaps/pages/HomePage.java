package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	HomePage(RemoteWebDriver driver ,ExtentTest node){
		this.driver = driver;
		this.node = node;
	}
	
	public HomePage HomePage() {
		click(locateElement("text", "CRM/SFA"));
		return this;
	}
	public CreateLead verifyHomePage() {
		
		  String text = locateElement("xpath", "//*[text()='CRM/SFA']").getText();
		  System.out.println(text);
		 
		String title = driver.getTitle();
		System.out.println(title);
		//String text = driver.findElement(By.xpath("//*[text()='CRM/SFA']")).getText();
		System.out.println(text);
		
		  boolean equals = text.equals("CRM/SFA");
		  if(equals = true) {
		  System.out.println("Correct page"); 
		  }else { 
			  System.out.println("Wrong Page");
		  }
		 
		return new CreateLead(driver, node);
	}
}
