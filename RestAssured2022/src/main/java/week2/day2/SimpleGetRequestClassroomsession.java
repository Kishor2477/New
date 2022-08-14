package week2.day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleGetRequestClassroomsession {
	
	@Test
	public void getRequestMethod() {
		RestAssured.baseURI = "https://dev109262.service-now.com/api/now/table/change_request";
		RestAssured.authentication = RestAssured.basic("admin", "llXHRy=@lH93");
		RequestSpecification queryParam = RestAssured.given().queryParam("sysparm_fields", "sys_id,number,priority,category");
		Response response = queryParam.get();
		
		int statusCode = response.statusCode();
		System.out.println(statusCode);
		response.prettyPrint();
	}
	
}
