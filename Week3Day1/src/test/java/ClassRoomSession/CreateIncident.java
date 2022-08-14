package ClassRoomSession;

import org.testng.Assert;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class CreateIncident extends BaseClass{
	@BeforeMethod
	public void postmethod()
	{
		Response response = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"category\": \"Software\",\r\n"
				+ "    \"short_description\": \"New Record\"\r\n"
				+ "}").post("change_request");
//ValidatableResponse body = response.then().body(containsString ("sys_id"));
	
		JsonPath jsonPath = response.jsonPath();
		 sysid = jsonPath.get("result.sys_id");
		System.out.println(sysid);
		System.out.println(response.statusCode());
		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 201);
		
	}
	@Test(invocationCount = 3)
public void delete() {
	Response delete = RestAssured.given().delete("change_request/"+sysid);
	System.out.println(delete.statusCode());
	int statusCode = delete.statusCode();
	Assert.assertEquals(statusCode, 204);
}
	
}
