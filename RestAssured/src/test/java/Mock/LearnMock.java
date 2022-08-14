package Mock;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class LearnMock {
	@Test
	public void getEbookDetails() {
		RestAssured.baseURI ="http://localhost:8080/testleaf/training/ebooks";
		 RestAssured
		.given()
		.queryParam("book_name", "Java")
		.queryParam("type", "Free")
		.get().prettyPrint();
	}

}
