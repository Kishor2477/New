package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/feature/IncidentManagement.feature"}
,glue = {"steps"}
,tags = "@smoketest"
,monochrome = true)
public class cucumberRunner extends AbstractTestNGCucumberTests {

}
