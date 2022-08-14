package Chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateIncident extends BaseClass{
	@Test(dependsOnMethods = "Chaining.CreateIncident.postmethod")
	public void putmethod()
	{
		Response response = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"category\": \"Software\",\r\n"
				+ "    \"short_description\": \"New Updated Record\"\r\n"
				+ "}").put("change_request/"+sysid);
		System.out.println(response.statusCode());
		response.prettyPrint();
		
	}

}
