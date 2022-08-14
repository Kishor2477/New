package contact;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class UpdateContact extends BaseClass {
	@Test(dependsOnMethods = "contact.CreateContact.getRequest")
	public void updateContact() {
		Response patch = RestAssured.given().log().all().contentType(ContentType.JSON).accept(ContentType.JSON)
				.body("{\r\n"
						+ "    \"MailingState\": \"New updated\"\r\n"
						+ "}")
				.patch("/"+id);
		int statusCode = patch.getStatusCode();
		System.out.println(statusCode);
		JsonPath jsonPath = patch.jsonPath();
		patch.prettyPrint();
		//Object object = jsonPath.get("MailingState");
		System.out.println(mailing_state);
	}

}
