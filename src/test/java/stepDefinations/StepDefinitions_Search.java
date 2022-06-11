package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import pageObjects.Edit_Page;
import pageObjects.Login_Page;
import pageObjects.Search_Product;
import resources.base;


@RunWith(Cucumber.class)

public class StepDefinitions_Search extends base{
	 @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
		   driver =initializeDriver();
	    }
	 
	    @And("^Navigate to \"([^\"]*)\" Site on chrome$")
	    public void navigate_to_something_site_on_chrome(String strArg1) throws Throwable {
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

	    @Then("^Click on My Orders link$")
	    public void click_on_my_orders_link() throws Throwable {
	    	Search_Product o = new Search_Product(driver);
	    	o.getmyorders();
	    }

	    @Then("^Click on search Bar$")
	    public void click_on_search_bar() throws Throwable {
	    	Search_Product o = new Search_Product(driver);
	    	o.getvalue().click();
	    }

	    
	    @And("^Enter (.+)$")
	    public void enter(String productname) throws Throwable {
	    	Search_Product o = new Search_Product(driver);
	    	o.getvalue().sendKeys("SAMSUNG Galaxy F12");
	    }

	    @And("^Click on Search Orders$")
	    public void click_on_search_orders() throws Throwable {
	    	Search_Product o = new Search_Product(driver);
	    	o.getsearch().click();
	    }
	    
	    @Then("^close browsers$")
	    public void close_browsers() throws Throwable {
	         driver.close();
	    }
	  
}
