package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Adding feature and step definition file
public class EditRunner {
	@CucumberOptions(  
		    features = "src/test/java/features",
		    glue="StepDefinations")
			
	public class TestRunner extends AbstractTestNGCucumberTests{

	}
}
