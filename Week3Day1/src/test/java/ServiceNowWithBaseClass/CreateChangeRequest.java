package ServiceNowWithBaseClass;

//import java.net.URI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateChangeRequest extends BaseClass {
	@Test
	public void createchangerequest() {
		
		Response post = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"category\": \"Software\",\r\n"
				+ "    \"short_description\": \"New Record\"\r\n"
				+ "}").post("change_request");
		post.prettyPrint();
		System.out.println(post.statusCode());
		
	}

}
