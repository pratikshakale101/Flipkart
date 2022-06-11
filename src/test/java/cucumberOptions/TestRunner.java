package cucumberOptions;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//Adding feature and step definition file
@CucumberOptions(  
		    features = "src/test/java/features",
		    glue="StepDefinitions_Login")
			
	public class TestRunner extends AbstractTestNGCucumberTests{

		
}
