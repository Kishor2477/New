package week2day2;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RoughClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoughClass.sendgetallissues();
	}
public static void sendgetallissues() {
	//to URL point
	RestAssured.baseURI = "https://restapijira.atlassian.net/rest/api/2/issue";
	
	//Authentication
	File inputfile = new File("./data/jirainput.json");
	
	RestAssured.authentication=RestAssured.preemptive().basic("RestAPIJira@gmail.com", "LQHwrjixuCa4eXz5mVKH7489");
	
	RequestSpecification given = RestAssured.given().log().all()
			.queryParam("jql","project=AP")
			.accept(ContentType.JSON)
			.contentType(ContentType.JSON)
			.body(inputfile);
			
	       
	//to get response
	
	Response response = given.post();
	
	int statusCode = response.statusCode();
	System.out.println(statusCode);
	response.prettyPrint();
}
}