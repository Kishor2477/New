package week2day2;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SimpleGetRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGetRequest.sendGetRequest();
	}
		public static void sendGetRequest() {
			// Endpoint
			RestAssured.baseURI = "https://dev113605.service-now.com/api/now/table/change_request";

			// multiple queryparam
			// Map<String, String> allQueryParams = new Hashmap<String, String> ();

			// Add Request
			RestAssured.authentication = RestAssured.basic("admin", "Sh8fT4LqzXtV");

			// Send Request
			Response response = RestAssured.get();
			
			

			// validate response
			int statuscode = response.statusCode();
			System.out.println(statuscode);
			response.prettyPrint();
	}

}
