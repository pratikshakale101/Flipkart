package flipkart;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjects.Edit_Page;
import resources.base;

public class validateEditFunction extends base {

	public static Logger log =LogManager.getLogger(base.class.getName());
	@Test
	public void initialize() throws IOException
	{
		//Initialized the driver
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		//Constructor of edit page
		Edit_Page o=new Edit_Page(driver);
		
		//Objects of constructor o
		o.getemail().sendKeys("pratikshakale0707@gmail.com");
		o.getpassword().sendKeys("Unipune@0707");
		o.getloginButton().click();
		o.getuserButton();
		o.getmyprofile().click();
		o.getperEdit().click();
		o.getfirst().click();
		o.getlast().click();
		o.getfirst().clear();
		o.getlast().clear();
		o.getfirstName().sendKeys("Lalita");
		o.getlastName().sendKeys("Kale");
		o.getsave().click();
		
//	    driver.close();
//		driver=null; 
	}
}

