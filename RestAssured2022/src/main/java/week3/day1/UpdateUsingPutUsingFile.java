package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateUsingPutUsingFile {

	@Test
	public void putRequest() {
		RestAssured.baseURI = "https://dev109262.service-now.com/api/now/table/change_request/68a6330b974d5110a85632f6f053af8c";
		RestAssured.authentication = RestAssured.basic("admin", "llXHRy=@lH93");
		Response response = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"short_description\": \"Updated Success\"\r\n"
				+ "}")
					.put();
		System.out.println(response.statusCode());
		response.prettyPrint();
		
	}
}
