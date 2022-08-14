package hooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class SalesForceSetUp {
	
	//@Before
	public void salesForceSetUp() throws FileNotFoundException, IOException{ 
		Properties prop = new Properties();
		//load the Data from config.properties
		prop.load(new FileInputStream(new File("./src/test/resources/config.properties")));
		RestAssured.baseURI = "https://"+prop.getProperty("salesserver")+"/"+prop.getProperty("salesresources")+"/";
		RestAssured.authentication = RestAssured.oauth2(prop.getProperty("salesAuth"));
	}
	
	//@After
	public void tearDown(){ 
	}
}
