package hooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class JiraSetUp {
	
	//@Before
	public void jiraSetUp() throws FileNotFoundException, IOException{ 
		Properties prop = new Properties();
		//load the Data from config.properties
		prop.load(new FileInputStream(new File("./src/test/resources/config.properties")));
		RestAssured.baseURI = "https://"+prop.getProperty("jiraserver")+"/"+prop.getProperty("jiraresources")+"/";
		RestAssured.authentication = RestAssured.preemptive().basic(prop.getProperty("jirausername"), prop.getProperty("jirapassword"));
	}
	
	//@After
	public void tearDown(){ 
	}
}
