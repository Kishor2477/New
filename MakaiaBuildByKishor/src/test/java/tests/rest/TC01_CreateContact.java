package tests.rest;

import java.io.File;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;
import lib.rest.RESTAssuredBaseSalesForce;


public class TC01_CreateContact extends RESTAssuredBaseSalesForce{
	
	@BeforeTest//Reporting
	public void setValues() {
		testCaseName = "Create a new Contact (REST)";
		testDescription = "Create a new Contact and Verify";
		nodes = "Incident";
		authors = "Kishor";
		category = "REST";
		//dataProvider
		dataFileName = "TC007";
		dataFileType = "JSON";
	}

	@Test(dataProvider = "fetchData")
	public void createContact(File file) {		
				
		Response response = postWithBodyAsFileAndUrl(file, "Contact");
		response.prettyPrint();
		verifyContentType(response, "application/json");
		
		verifyResponseCode(response, 201);
		
		//verifyContentWithKey(response, "result.short_description", "This is Rest Assured Automation framework - Makaia");
		sysID = getContentWithKey(response, "id");
	}


}




















