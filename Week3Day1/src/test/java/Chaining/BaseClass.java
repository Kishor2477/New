package Chaining;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClass {
	//Declaring Sysid
	
public static String sysid;
public static String mailing_state;
	
	@BeforeMethod
	public void baseclass()
	{
RestAssured.baseURI = "https://dev113605.service-now.com/api/now/table/";
		
		RestAssured.authentication = RestAssured.basic("admin", "Sh8fT4LqzXtV");
	}

}
