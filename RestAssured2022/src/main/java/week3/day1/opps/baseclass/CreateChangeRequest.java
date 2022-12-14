package week3.day1.opps.baseclass;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateChangeRequest extends BaseClass{

	@Test
	public void changeRequest() {
		Response response = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"category\": \"Software\",\r\n"
				+ "    \"short_description\": \"RestAssur learning\"\r\n"
				+ "}").post("change_request");
		
		System.out.println(response.statusCode());
		response.prettyPrint();
	}
	
}
