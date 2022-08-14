package ServiceNowWithBaseClass;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClass {
	
	@BeforeMethod
	public void createbaseclass()
	{
RestAssured.baseURI = "https://dev113605.service-now.com/api/now/table/";
		
		RestAssured.authentication = RestAssured.basic("admin", "Sh8fT4LqzXtV");
	}

}
