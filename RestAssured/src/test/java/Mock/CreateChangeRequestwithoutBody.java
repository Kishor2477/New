package Mock;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateChangeRequestwithoutBody {
	/*@BeforeMethod
	public void incidentStub() {
		stubFor(post("/api/now/table/change_request")
				.willReturn(
						aResponse()
						.withStatus(201)
						.withHeader("content-type", "application/json")
						.withBody("{ \\\"short_description\\\": \\\"Create Inccident with body as File 1\\\", \\\"category\\\": \\\"hardware\\\" }")
						));
	} */
	@Test
	public void createChangeRequest() {
		RestAssured.baseURI ="http://localhost:8080/api/now/table/change_request";
		RestAssured.authentication = RestAssured.basic("admin", "DhS%fXw9d4D-");
		Response response = RestAssured.given().accept(ContentType.JSON).when().post().then().statusCode(201).extract().response();
		System.out.println(response.statusCode());
		response.prettyPrint();
	}

}
