package week3.day1.opps.baseclass;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateRequest extends BaseClass{

	@Test
	public void putRequest() {
		Response response = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"short_description\": \"New Updates Successfull\"\r\n"
				+ "}").put("change_request/");
		
		System.out.println(response.statusCode());
	}
}
