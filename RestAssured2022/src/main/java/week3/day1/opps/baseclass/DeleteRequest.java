package week3.day1.opps.baseclass;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteRequest extends BaseClass{

	@Test
	public void deleteMethod() {
		Response response = RestAssured.given().delete("change_request/84134cdf974d5110a85632f6f053af17");
	System.out.println(response.statusCode());	
	}
}
