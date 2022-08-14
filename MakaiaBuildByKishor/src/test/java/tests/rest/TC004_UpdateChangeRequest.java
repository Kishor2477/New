package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class TC004_UpdateChangeRequest extends RESTAssuredBase{
	@BeforeTest//Reporting
	public void setValues() {
		testCaseName = "Update a new Change Request (REST)";
		testDescription = "Update a new Change Request and Verify";
		nodes = "Change Request";
		authors = "Kishor";
		category = "REST";
		//dataProvider
		dataFileName = "TC004";
		dataFileType = "JSON";

}
	@Test(dependsOnMethods = "tests.rest.TC003_CreateChangeRequest.createCR",dataProvider = "fetchData")
	//@Test(dataProvider = "fetchData")
	public void updateCR(File file) {		
				
		Response response = putWithBodyParamUrl(file, "change_request"+"/"+sysID);
		System.out.println(response.getStatusCode());
		
		
		verifyContentType(response, "application/json");
		
		verifyResponseCode(response, 200);
		
	verifyContentWithKey(response, "result.short_description", "Software Update");
		//sysID = getContentWithKey(response, "result.sys_id");
		response.prettyPrint();
		JsonPath jsonPath = response.jsonPath();
		Object object = jsonPath.get("result.short_description");
		System.out.println("The short_description is updated with value as "+object);
	}
	
}
