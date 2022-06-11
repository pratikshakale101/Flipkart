package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import pageObjects.Edit_Page;
import pageObjects.Login_Page;
import resources.base;

public class StepDefinitions_Edit extends base{
	 @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
		 driver =initializeDriver();
	    }
	 
	   @And("^Navigate to \"([^\"]*)\" Site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
		    driver.get(strArg1);
         }
	   

	    @And("^Click on Login link in home page to land on Secure login in Page$")
	    public void click_on_login_link_in_home_page_to_land_on_secure_login_in_page() throws Throwable {
	    	Login_Page o = new Login_Page(driver);
	    	o.getloginButton().click();
	    }

	    @When("^User enters (.+) and (.+) and logs in$")
	    public void user_enters_and_and_logs_in(String email, String password) throws Throwable {
	    	Login_Page o = new Login_Page(driver);
	    	o.getemail().sendKeys("pratikshakale0707@gmail.com");
	    	o.getpassword().sendKeys("Unipune@0707");
	     }

	    @Then("^Verify that user is succesfully logged in application$")
	    public void verify_that_user_is_succesfully_logged_in_application() throws Throwable {
	    }

	    @Then("^Click on username $")
	    public void click_on_username() throws Throwable {
      	      Edit_Page o = new Edit_Page(driver);
     	      o.getuserButton();
	    }
	    
	    @And("^Click on My Profile link$")
	    public void click_on_my_profile_link() throws Throwable {
	    	Edit_Page o = new Edit_Page(driver);
	    	o. getmyprofile().click();
	     }
	    
	    
	    @Then("^Click on Edit link for personal information$")
	    public void click_on_edit_link_for_personal_information() throws Throwable {
	    	Edit_Page o = new Edit_Page(driver);
	    	o.getperEdit().click();
	     }
	    
	    @Then("^clear first and last name$")
	    public void clear_first_and_last_name() throws Throwable {
	    	Edit_Page o = new Edit_Page(driver);
	    	o.getfirst().clear();
	    	o.getlast().clear();
	        throw new PendingException();
	    }

	    @And("^Enter (.+) and (.+)$")
	    public void enter_and(String firstname, String lastname) throws Throwable {
	    	Edit_Page o = new Edit_Page(driver);
	    	o.getfirstName().sendKeys("	Lalita");
	    	o.getlastName().sendKeys("Kale");
	     }

	    @Then("^Click on Save link$")
	    public void click_on_save_link() throws Throwable {
	    	Edit_Page o = new Edit_Page(driver);
	    	o.getsave().click();
	    }

	   
        @And("^close browsers2$")
	    public void close_browsers2() throws Throwable {
	    	driver.close();
        }
}
