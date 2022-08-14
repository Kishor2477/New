package steps;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import java.util.Map;
import java.util.Map.Entry;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import gherkin.deps.com.google.gson.JsonArray;
import gherkin.deps.com.google.gson.JsonObject;

public class SalesForceContact extends baseAPI{
	

	@Given("enable salesforcelogs")
	public void salesForceSetUp(){ 
		request = given().log().all();
	}
	
	

	@When("Create new contact in salesforce {string}")
	public void a_new_contact_created(String table){
		response = request.when().contentType(ContentType.JSON)
				.body("{\r\n"
						+ "    	\"FirstName\": \"leaf\",\r\n"
						+ "    	\"LastName\": \"test\"\r\n"
						+ "	}")
				.post(table);
		response.prettyPrint();
		JsonPath jsonPath = response.jsonPath();
		sys_id = jsonPath.get("id");
		
	}
	
	@When("Update the contact Request in Sales Force {string}")
	@Test(dependsOnMethods = "steps.SalesForceContact.a_new_contact_created")
	public void a_new_contact_updated(String short_desc){
		response = request.when().contentType(ContentType.JSON).body("{\"MailingState\":\""+short_desc+"\"}")
				.patch("contact" + "/" + sys_id);
		response.prettyPrint();
	
	}
	
	@When("Verify Mailing State {string}")	

	public void verify_mailing_state(String state) {
		response = request.when().accept(ContentType.JSON).contentType(ContentType.JSON).get("contact" + "/" + sys_id);
		JsonPath jsonPath = response.jsonPath();
		Object object = jsonPath.get("MailingState");
		System.out.println(object);
		Assert.assertEquals(object, ""+state+"");
		System.out.println("The Newly updated Mailing state is "+object +"="+ ""+state+"");
	}
	
	@And("List All the Contacts")
	public void list_contacts() {
		response = request.and().accept(ContentType.JSON).contentType(ContentType.JSON).get("contact" + "/");
		response.prettyPrint();
	//	JsonObject obj = new JsonObject(response);
		//JsonArray asJsonArray = obj.getAsJsonArray("id");
		 // JsonPath jsonPath = response.jsonPath();
		  //jsonPath.getJ
		
		//System.out.println(object);
		//Assert.assertEquals(object, sys_id);
	}
//@And("Print only specific values {string} and {string}")
	//public void print_values() {
	//	request = request.given()
	//	.queryParam("sysparm_fields", "short_description,description");
		
	//}
	
	/*@When("get all incidents")
	public void get_all_incidents(){
		response = request.when().contentType(ContentType.JSON).get("incident");
		response.prettyPrint();
	}

	@Then("the status code is (\\d+)$")// \d+ ->only Digit += 1 or more number
	public void verify_status_code(int statusCode){
		json = response.then().statusCode(statusCode);
	}

	@And("response includes the following$")
	public void response_equals(Map<String,String> responseFields){
		
		for (Entry<String, String> eachEntry : responseFields.entrySet()) {
			
			if(StringUtils.isNumeric(eachEntry.getValue())) {
				response
				.then()
				.body(eachEntry.getKey(), equalTo(Integer.parseInt(eachEntry.getValue())));
			} else {
				response
				.then()
				.body(eachEntry.getKey(), equalTo(eachEntry.getValue()));
			}
		}
	}	
	
	@When("Create new issue in Jira sample")
	public void create_new_jira_issue() {
		request.when().accept(ContentType.JSON).contentType(ContentType.JSON).body("{\r\n"
				+ "    \"fields\":{\r\n"
				+ "        \"project\":\r\n"
				+ "        {\r\n"
				+ "            \"key\":\"PROJ\"\r\n"
				+ "        \r\n"
				+ "        },\r\n"
				+ "        \"summary\":\"create issue in RA project\",\r\n"
				+ "        \"description\":\"creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "        \"issuetype\":{\r\n"
				+ "        \"name\": \"Bug\"\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}").post();
	}
	
	
	@And("response includes the following in any order$")
	public void response_contains_in_any_order(Map<String,String> responseFields){
		for (Map.Entry<String, String> field : responseFields.entrySet()) {
			if(StringUtils.isNumeric(field.getValue())){// checking
				json.body(field.getKey(), containsInAnyOrder(Integer.parseInt(field.getValue())));
			}
			else{
				json.body(field.getKey(), containsInAnyOrder(field.getValue()));
			}
		}
	} */
}


