package Chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident extends BaseClass{
	
	@Test(dependsOnMethods = "Chaining.UpdateIncident.putmethod")
public void delete() {
	Response delete = RestAssured.given().delete("change_request/"+sysid);
	System.out.println(delete.statusCode());
}
}
