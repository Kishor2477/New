package week2day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JiraAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JiraAssignments.sendgetallissues();
	}
public static void sendgetallissues() {
	//to URL point
	RestAssured.baseURI = "https://restapijira.atlassian.net/rest/api/2/search";
	
	//Authentication
	
	RestAssured.authentication=RestAssured.preemptive().basic("RestAPIJira@gmail.com", "QX6sr4ydg7QQkqxF7Du5B98B");
	
	RequestSpecification given = RestAssured.given().log().all().accept(ContentType.JSON).queryParam("jql","project=AP");
			
	       
	//to get response
	
	Response response = given.get();
	
	int statusCode = response.statusCode();
	System.out.println(statusCode);
	response.prettyPrint();
}
}
