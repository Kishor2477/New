package assertions;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class CreateChangeRequest extends BaseClass{

	@BeforeMethod
	public void postMethod() {
		Response response = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"category\": \"Software\",\r\n"
				+ "    \"short_description\": \"RestAssur learning\"\r\n"
				+ "}").post("change_request");
		
		response.then().body(containsString("sys_id"));
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, 201);
		
		JsonPath jsonPath = response.jsonPath();
	   sysid = jsonPath.get("result.sys_id");
	   
	   System.out.println(sysid);
		
	}
	
	@Test(invocationCount = 2)
	public void deleteMethod() {
		Response response = RestAssured.given().delete("change_request/"+sysid);
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, 204);
	}
	
}
