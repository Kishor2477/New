package week3.day1.chaning;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRequest extends BaseClass{

	@Test(dependsOnMethods = "week3.day1.chaning.UpdateRequest.putRequest")
	public void deleteMethod() {
		Response response = RestAssured.given().delete("change_request/"+sysid);
	System.out.println(response.statusCode());	
	}
}
