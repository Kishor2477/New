package Incident;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteReq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.baseURI = "https://dev113605.service-now.com/api/now/table/change_request/01e82d1c1baa85104408ec23604bcb89";
		
		RestAssured.authentication = RestAssured.basic("admin", "Sh8fT4LqzXtV");
		
		Response delete = RestAssured.given().delete();
		
		System.out.println(delete.statusCode());
		
	}

}
