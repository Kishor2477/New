package week2day2;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Creatingissueinjira {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creatingissueinjira.sendpostaissue();
	}
	public static void sendpostaissue() {
		
		RestAssured.baseURI = "https://testrestapijira.atlassian.net/rest/api/2/issue/";
		
		File inputfile = new File("./data/jirainput.json");
		
		RestAssured.authentication=RestAssured.preemptive().basic("kishorkumar2477@gmail.com", "uEBZRcACRfURfJYRilx025A2");
		
		RequestSpecification inputrequest = RestAssured
				.given()
				.log()
				.all()
				//.queryParam("jql","project=AP")
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.body(inputfile);
				/*.body("{\r\n"
						+ "	\"summary\": \"project\",\r\n"
						+ "	\"description\": \"updated\"\r\n"
						+ "}"); */
		
		Response post = inputrequest.post();
		
		//int statusCode = post.statusCode();
		//System.out.println(statusCode);
		
		post.prettyPrint();
		System.out.println("Status Code : "+post.statusCode());
		
	}
}
