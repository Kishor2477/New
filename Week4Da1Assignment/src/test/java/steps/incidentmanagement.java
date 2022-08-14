package steps;

import java.io.File;

import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class incidentmanagement {
	
	public Response response;
	public String sys_id;
	
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
				.queryParam("sysparm_fields", "sys_id,number,short_description,category")
				.body("{\"short_description\":\""+shortdesc+"\",\"category\":\""+category+"\"}")
				.post();
		JsonPath jsonPath = response.jsonPath();
		sys_id=jsonPath.get("result.sys_id");
	}
	@When("Update incident with short_description as {string}")
	@Test(dependsOnMethods = "steps.incidentmanagement.createincident")
	public void updateincidnet(String shortdesc) {
		response = RestAssured
				.given()
				//.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.queryParam("sysparm_fields", "sys_id,number,short_description,category")
				.body("{\"short_description\":\""+shortdesc+"\"}")
				.put(sys_id);
	}
	
	//Delete the updated issue
	
	@When("Delete the updated issue")
	@Test(dependsOnMethods = "steps.incidentmanagement.updateincident")
	public void deleteincidnet() {
		response = RestAssured
				.given()				
				.delete(sys_id);
	}
	
	@When("Create new change request with body in file")
	public void createincidentusingbodyasfile() {
		File file = new File("./data/cucumber.json");
		response = RestAssured
				.given()
				//.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.body(file)
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
