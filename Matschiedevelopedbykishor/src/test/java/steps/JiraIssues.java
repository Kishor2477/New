package steps;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;




public class JiraIssues extends baseAPI{
	
	@Given("enable jira logs")
	public void jiraSetUp(){ 
		request = given().log().all();
	}
	
	@When("Create new issue in Jira")
	public void create_new_jira_issue() {
		response = request.when().accept(ContentType.JSON).contentType(ContentType.JSON).body("{\r\n"
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
				+ "}").post("issue");
	response.prettyPrint();
	JsonPath jsonPath = response.jsonPath();
	sys_id = jsonPath.get("id");
	}
	
	@When("Duplicate Update the Change Request in service now {string}")
	@Test(dependsOnMethods = "steps.IncidentManagement.a_new_incident_created")
	public void a_new_chnage_request_updated(String short_desc){
		response = request.when().contentType(ContentType.JSON).body("{\"short_description\":\""+short_desc+"\"}")
				.put("change_request" + "/" + sys_id);
		response.prettyPrint();
	}
	
	@When("Update the description jira issue {string}")
	@Test(dependsOnMethods = "steps.JiraIssues.create_new_jira_issue")
	public void update_jira(String desc) {
		response = request.when().contentType(ContentType.JSON).body("{\"description\" : \""+desc+"\"}").put(sys_id);
		response.prettyPrint();
	}
	
	@When("Update the created jira issue {string}")
	@Test(dependsOnMethods = "steps.JiraIssues.create_new_jira_issue")
	public void update_jira_issue(String desc) {
		response = request.when().accept(ContentType.JSON).contentType(ContentType.JSON).body("{\r\n"
				+ "    \"fields\":{\r\n"
				+ "        \"project\":\r\n"
				+ "        {\r\n"
				+ "            \"key\":\"PROJ\"\r\n"
				+ "        \r\n"
				+ "        },\r\n"
				+ "        \"summary\":\""+desc+"\",\r\n"
				+ "        \"description\":\"creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "        \"issuetype\":{\r\n"
				+ "        \"name\": \"Bug\"\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}").put("issue"+"/"+sys_id);
		response.prettyPrint();
	}

	@When("Get All the issues in Jira")
	public void get_jira_issues() {
		 response = request.when().accept(ContentType.JSON)
				 .queryParam("jql", "project=\"proj\"")
				 .get("search");
		 response.prettyPrint();
	}
	
	@Then("the jira status code is (\\d+)$")// \d+ ->only Digit += 1 or more number
	public void verify_status_code(int statusCode){
		json = response.then().statusCode(statusCode);
		System.out.println("Returned Status Code "+statusCode);
	}
	

}
