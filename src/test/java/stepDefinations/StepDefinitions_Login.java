package stepDefinations;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.Login_Page;
import resources.base;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

public class StepDefinitions_Login extends base {
	 @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
		 driver =initializeDriver();
	        throw new PendingException();
	    }

	  @And("^Navigate to \"([^\"]*)\" Site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
			driver.get(strArg1);
	        throw new PendingException();
	    }
	  

	    @And("^Click on Login link in home page to land on Secure login in Page$")
	    public void click_on_login_link_in_home_page_to_land_on_secure_login_in_page() throws Throwable {
	    	Login_Page o = new Login_Page(driver);
	    	o.getloginButton().click();
	        throw new PendingException();
	    }
	    
	    
		@When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String email, String password) throws Throwable {
			Login_Page o = new Login_Page(driver);
	    	o.getemail().sendKeys("pratikshakale0707@gmail.com");
	    	o.getpassword().sendKeys("Unipune@0707");
	        throw new PendingException();
	    }
		
		   


	    @Then("^Verify that user is succesfully logged in $")
	    public void verify_that_user_is_succesfully_logged_in() throws Throwable {
	        throw new PendingException();
	    }

	 

	    @And("^close browsers$")
	    public void close_browsers() throws Throwable {
	    	driver.close();
	        throw new PendingException();
	    }

	}


