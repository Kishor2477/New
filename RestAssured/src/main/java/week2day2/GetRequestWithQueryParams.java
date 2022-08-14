package week2day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestWithQueryParams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetRequestWithQueryParams.sendgetrequest();
	}
	public static void sendgetrequest() {
		
			// Endpoint
			RestAssured.baseURI = "https://dev113605.service-now.com/api/now/table/change_request";

			// multiple queryparam
			// Map<String, String> allQueryParams = new Hashmap<String, String> ();

			// Add Request
			RestAssured.authentication = RestAssured.basic("admin", "Sh8fT4LqzXtV");
			RequestSpecification inputrequest = RestAssured
					.given()
					.queryParam("sysparm_fields","category, sys_id, number")
					.accept(ContentType.JSON);
			
		
			
			

			// Send Request
			Response response = inputrequest.get();
			

			// validate response
			int statuscode = response.statusCode();
			System.out.println(statuscode);
			response.prettyPrint();
	}
}
