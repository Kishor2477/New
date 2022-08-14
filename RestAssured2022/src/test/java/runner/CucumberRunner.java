package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/java/feature/ChangeRequestManagement.feature"},
							glue = "steps"
							,tags = "@DemoRun"
							,monochrome = true)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
