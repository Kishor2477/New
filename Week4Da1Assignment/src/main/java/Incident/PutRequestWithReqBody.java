package Incident;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutRequestWithReqBody {
	
	public static void main(String args[]) {
		RestAssured.baseURI = "https://dev113605.service-now.com/api/now/table/change_request/01e82d1c1baa85104408ec23604bcb89";
		
		RestAssured.authentication = RestAssured.basic("admin", "Sh8fT4LqzXtV");
		
		Response put = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"category\": \"Software\",\r\n"
				+ "    \"short_description\": \"New Record\"\r\n"
				+ "}").put();
		
		System.out.println(put.statusCode());
		put.prettyPrint();
	}

}
