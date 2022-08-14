package week2day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostRequest.sendpostrequest();
	}
public static void sendpostrequest() {
	RestAssured.baseURI = "https://dev113605.service-now.com/api/now/table/change_request";
	
	RestAssured.authentication = RestAssured.basic("admin", "Sh8fT4LqzXtV");
			
			RequestSpecification given = RestAssured
			.given()
			.log()
			.all()
			.queryParam("sysparm_fields", "sys_id,number")
			.accept(ContentType.JSON)
			.contentType(ContentType.JSON)
			.body("{\r\n"
					+ "	\"category\": \"Hardware\",\r\n"
					+ "	\"short_description\": \"updated\"\r\n"
					+ "}");
			
			Response post = given.post();
			
			//int statusCode = post.statusCode();
			post.prettyPrint();
			System.out.println("Status Code : "+post.statusCode());
			
	
	
}
}
