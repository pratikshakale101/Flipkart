package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Adding feature and step definition file
public class SearchRunner {
	@CucumberOptions(  
		    features = "src/test/java/features",
		    glue="StepDefinitions")
			
	public class TestRunner extends AbstractTestNGCucumberTests{

	}
}
