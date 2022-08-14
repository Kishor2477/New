package contact;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class BaseClass {
	
	public static String id;
	public static String mailing_state;
	
	@BeforeMethod
	public void baseClass() {
		RestAssured.baseURI="https://testleaf46-dev-ed.my.salesforce.com/services/data/v20.0/sobjects/Contact";
		RestAssured.authentication = RestAssured.oauth2("00D5i000000HPjn!AQ4AQBHRMVTjJ55RZkp_K9OpRhnhIVkOUmFh.qGaiPHMhT5ZeFFSd4ccv.t1KxfFcYzojnbhOhpvE0YIEsAlyzoSHwO47G9m");
	}

}
