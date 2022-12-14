package week2.day2;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleGetRequestAsXML {
	
	@Test
	public void getRequestMethod() {
		RestAssured.baseURI = "https://dev109262.service-now.com/api/now/table/change_request";
		RestAssured.authentication = RestAssured.basic("admin", "llXHRy=@lH93");
		
		//Multiple Query Params
		Map<String, String> allQueryParams = new HashMap<String, String>();
		allQueryParams.put("sysparm_fields", "sys_id,number,priority,category");
		allQueryParams.put("category", "Hardware");
		
				
		
		//RequestSpecification queryParam = RestAssured.given().queryParam("sysparm_fields", "sys_id,number,priority,category");
		RequestSpecification accept = RestAssured.given()
				.log()
				.all()
				.queryParams(allQueryParams);
				
		
				
		Response response = accept.get();
		
		int statusCode = response.statusCode();
		System.out.println(statusCode);
		response.prettyPrint();
	}
	
}
