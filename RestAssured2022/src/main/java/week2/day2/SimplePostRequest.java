package week2.day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimplePostRequest {
	@Test
	public void postRequest() {
		RestAssured.baseURI = "https://dev109262.service-now.com/api/now/table/change_request";
		RestAssured.authentication = RestAssured.basic("admin", "llXHRy=@lH93");
		
		RequestSpecification accept = RestAssured.given().log().all().contentType(ContentType.JSON).accept(ContentType.XML);
		
		Response post = accept.post();
		
		int statusCode = post.statusCode();
		System.out.println(statusCode);
		post.prettyPrint();
	}
	
}
