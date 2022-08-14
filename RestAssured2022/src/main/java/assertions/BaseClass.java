package assertions;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClass {

	public static String sysid;
	
	@BeforeMethod
	public void setUp() {
		RestAssured.baseURI = "https://dev109262.service-now.com/api/now/table/";
		RestAssured.authentication = RestAssured.basic("admin", "llXHRy=@lH93");
	}
	
}
