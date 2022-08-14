package ServiceNowWithBaseClass;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateChangeRequest extends BaseClass {
	@Test
	public void updatechangerequest(){
		Response put = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"category\": \"Software\",\r\n"
				+ "    \"short_description\": \"New Record Upded\"\r\n"
				+ "}").put("change_request/ba5bb91c1bea85104408ec23604bcbe4");
		put.prettyPrint();
		System.out.println(put.statusCode());
	}

}
