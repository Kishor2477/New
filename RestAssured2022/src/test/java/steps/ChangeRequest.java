package steps;

import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.binary.StringUtils;
import org.codehaus.groovy.transform.EqualsAndHashCodeASTTransformation;

import io.cucumber.datatable.internal.difflib.StringUtills;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ChangeRequest {
	public Response response;
	@Given("Setup the Endpoint")
	public void setEndpoint() {
		RestAssured.baseURI ="https://dev109262.service-now.com/api/now/table/change_request";
	}
	@And("Provide Authorization")
	public void setAutorization() {
		RestAssured.authentication = RestAssured.basic("admin", "llXHRy=@lH93");		
	}
	
	
	
	@When("Send the request")
	public void sendRequest() {
		Map<String, String> queryMap = new HashMap<String, String>();
		queryMap.put("sysparm_fields", "sys_id,number,priority,category");
		queryMap.put("category", "Hardware");
		response = RestAssured.given().queryParams(queryMap).get();
	}
	@Then("Validate the response is {int}")
	public void validateResponse(int code) {
		response.then().assertThat().statusCode(code);
	}
	@And("Print the response")
	public void printResponse() {
		response.prettyPrint();
	}
	@When("send the request with short_description as {string} and category as {string}")
	public void sendPostRequest(String short_desc,String category) {
		response = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
				+ "    \"category\": \""+category+"\",\r\n"
				+ "    \"short_description\": \""+short_desc+"\"\r\n"
				+ "}").post();
	}
	@And("response including the following")
	public void validateResponse(Map<String,String> responseFields) {
		for(Map.Entry<String, String> eachEntry : responseFields.entrySet()) {
			System.out.println(eachEntry.getKey() + ":" + eachEntry.getValue());
			if(org.apache.commons.lang3.StringUtils.isNumeric(eachEntry.getValue())){
				//response.then().body(eachEntry.getKey(), Integer.parseInt(eachEntry.getValue()));
				//response.then().body(eachEntry.getKey(),(Integer.parseInt(eachEntry.getValue())));
				response.then().body(eachEntry.getKey(), equalTo(Integer.parseInt(eachEntry.getValue())));
			}
			else {
				response.then().body(eachEntry.getKey(), equalTo(eachEntry.getValue()));
				//response.then().body(eachEntry.getKey(), eachEntry.getValue());
			}
		}
	}
}
