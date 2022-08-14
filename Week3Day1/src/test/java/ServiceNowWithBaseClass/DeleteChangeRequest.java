package ServiceNowWithBaseClass;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteChangeRequest extends BaseClass {
	@Test
	public void updatechangerequest(){
		Response put = RestAssured.given().delete("change_request/ba5bb91c1bea85104408ec23604bcbe4");
		put.prettyPrint();
		System.out.println(put.statusCode());
	}


}
