package week3.day1.chaning;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateChangeRequest extends BaseClass{

	@Test
	public void changeRequest() {
		Response response = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"category\": \"Software\",\r\n"
				+ "    \"short_description\": \"RestAssur learning\"\r\n"
				+ "}").post("change_request");
		
		JsonPath jsonPath = response.jsonPath();
		sysid = jsonPath.get("result.sys_id");
		System.out.println(sysid);
		System.out.println(response.statusCode());
	}
	
}
