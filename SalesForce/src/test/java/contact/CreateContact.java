package contact;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateContact extends BaseClass {
	@Test
	public void getRequest() {
	
		
		Response post = RestAssured.given().accept(ContentType.JSON).contentType(ContentType.JSON)
				.body("{\r\n"
						+ "    \"FirstName\": \"string\",\r\n"
						+ "    \"LastName\": \"string\"\r\n"
						+ "}")  
				.post();
		post.prettyPrint();
		
		int statusCode = post.getStatusCode();
		System.out.println(statusCode);
		
		JsonPath jsonPath = post.jsonPath();
		id = jsonPath.get("id");
		System.out.println(id);
		mailing_state = jsonPath.get("MailingState");
				
		
	}

}
