package week2day2;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NewGetRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NewGetRequest.sendgetrequest();
	}

	public static void sendgetrequest() {
		//URL End point
		RestAssured.baseURI= "https://dev113605.service-now.com/api/now/table/change_request";
		
		//Authentication
		RestAssured.authentication = RestAssured.basic("admin", "Sh8fT4LqzXtV");
		
		
		//multiple query
		//Map<String, String> allQueryParams = new HashMap<String, String>();
		//	allQueryParams.put("sysparm_fields","priority");
		//	allQueryParams.put("priority", "4");
		
		
			
		
		
		RequestSpecification given = RestAssured
				.given()
				.log()
				.all()
				.queryParam("sysparm_fields","priority")
				.queryParam("priority", "4")
				
				//.queryParam(allQueryParams)
				//.queryParam(allQueryParams)
				//.queryParams(allQueryParams)
				.accept(ContentType.JSON);
		
				//accept(Content_Type.XML);
		
		//sendrequest
		Response response = given.get();
		
		//to validate and Print
		int statusCode = response.statusCode();
		System.out.println(statusCode);
		response.prettyPrint();
		
	}
}
