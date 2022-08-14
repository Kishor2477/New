package Mock;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LearnRec {

	@Test
	public void createChangeRequest() {
		RestAssured.baseURI ="http://localhost:8080/api/now/table/change_request";
		RestAssured.authentication = RestAssured.basic("admin", "DhS%fXw9d4D-");
		Response response = RestAssured.given().accept(ContentType.JSON).when().post().then().statusCode(201).extract().response();
		System.out.println(response.statusCode());
		response.prettyPrint();
	}

}
