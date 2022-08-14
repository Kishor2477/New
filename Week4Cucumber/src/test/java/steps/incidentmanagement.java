package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class incidentmanagement {
	
	public Response response;
	
	@Given("setup the endpoint")
	public void setendpoint() {
	//RestAssured.baseURI = "https://dev113605.service-now.com/api/now/table/change_request";
	RestAssured.baseURI = "https://dev93998.service-now.com/api/now/table/change_request";
	}

	// multiple queryparam
	// Map<String, String> allQueryParams = new Hashmap<String, String> ();

	// Add Request
	@And("setup the Authorization")
	public void setAuthentication() {
	//RestAssured.authentication = RestAssured.basic("admin", "Sh8fT4LqzXtV");
		RestAssured.authentication = RestAssured.basic("admin", "JzKfa00MFayJ");
	}
	@When("get all change request")
	public void getincident() {
	// Send Request
	 response = RestAssured
			.given()
			.queryParam("sysparm_fields", "sys_id,number,short_description,category")
			.get();
	}
	@When("Create new change request with short description as {string} and category as {string}")
	public void createincident(String shortdesc,String category) {
		response = RestAssured
				.given()
				//.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.body("{\"short_description\":\""+shortdesc+"\",\"category\":\""+category+"\"}")
				.post();
	}
	
	@Then("verify statuscode as {int}")
	public void getstatuscode(int code) {
		response.then()
		.assertThat()
		.statusCode(code);
		
	}
	
	@And("print the response")
	public void printResponse() {
		response.prettyPrint();
	}

	

}
