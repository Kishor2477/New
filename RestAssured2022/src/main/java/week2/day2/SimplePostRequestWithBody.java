package week2.day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimplePostRequestWithBody {
	@Test
	public void postRequest() {
		RestAssured.baseURI = "https://dev109262.service-now.com/api/now/table/change_request";
		RestAssured.authentication = RestAssured.basic("admin", "llXHRy=@lH93");
		
		RequestSpecification accept = RestAssured.given().log().all().contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.queryParam("sysparm_fields", "number,sys_id")
				.body("{\r\n"
						+ "    \"category\": \"Software\",\r\n"
						+ "    \"short_description\": \"Newly learning\"\r\n"
						+ "}");
		
		Response post = accept.post();
		
		int statusCode = post.statusCode();
		System.out.println(statusCode);
		post.prettyPrint();
	}
	
}
