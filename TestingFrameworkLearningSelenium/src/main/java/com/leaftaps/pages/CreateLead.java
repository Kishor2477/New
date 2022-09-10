package com.leaftaps.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leaftaps.base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{

	CreateLead(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
	}
	public CreateLead clickCreate() {
		click(locateElement("text", "Create Lead"));
		return this;
	}
	public CreateLead verifyCreateLead() {
		String text = locateElement("text", "Create Lead").getText();
		if(text.contains("Create Lead")) {
			System.out.println("Landed on Correct page");
		}
		return this;
	}
	
	public CreateLead typeFirstName(String cname) throws Exception{
		locateElement("createLeadForm_firstName").sendKeys(cname);
		Thread.sleep(2000);
		return this;
	}
	public CreateLead typeCompanyName() {
		//clearAndType(locateElement("createLeadForm_companyName"), cname);
		locateElement("createLeadForm_companyName").sendKeys("value");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
}
