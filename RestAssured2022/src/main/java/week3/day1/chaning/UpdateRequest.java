package week3.day1.chaning;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateRequest extends BaseClass{

	@Test(dependsOnMethods = "week3.day1.chaning.CreateChangeRequest.changeRequest")
	public void putRequest() {
		Response response = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"short_description\": \"New Updates Successfull\"\r\n"
				+ "}").put("change_request/"+sysid);
		
		System.out.println(response.statusCode());
	}
}
