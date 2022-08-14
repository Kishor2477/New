package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;
import lib.rest.RESTAssuredBaseSalesForce;

public class TC02_UpdateContact extends RESTAssuredBaseSalesForce{
	@BeforeTest//Reporting
	public void setValues() {
		testCaseName = "Update a new Contact Request (REST)";
		testDescription = "Update a new Change Request and Verify";
		nodes = "Change Request";
		authors = "Kishor";
		category = "REST";
		//dataProvider
		dataFileName = "TC009";
		dataFileType = "JSON";

}
	@Test(dependsOnMethods = "tests.rest.TC01_CreateContact.createContact",dataProvider = "fetchData")
	//@Test(dataProvider = "fetchData")
	public void updateContact(File file) {		
				
		Response response = patchWithBodyParamUrl(file, "Contact"+"/"+sysID);
		System.out.println(response.getStatusCode());
		
		
		//verifyContentType(response, "application/json");
		
		verifyResponseCode(response, 204);
		
	//verifyContentWithKey(response, "MailingState", "California");
		//sysID = getContentWithKey(response, "result.sys_id");
		//response.prettyPrint();
		//JsonPath jsonPath = response.jsonPath();
		//Object object = jsonPath.get("MailingState");
		//System.out.println("The short_description is updated with value as "+object);
	}
	
}
