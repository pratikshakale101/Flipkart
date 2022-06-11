package flipkart;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjects.Search_Product ;
import resources.base;

public class validateSearchFunction extends base{

	public static Logger log =LogManager.getLogger(base.class.getName());
		@Test
		public void initialize() throws IOException, InterruptedException
		{
			//Initialized the driver
			driver =initializeDriver();
			driver.get(prop.getProperty("url"));
			
			//Constructor of edit page
			Search_Product o=new Search_Product (driver);
			
			//Objects of constructor o
			o.getemail().sendKeys("pratikshakale0707@gmail.com");
			 Thread.sleep(2000);
			o.getpassword().sendKeys("Unipune@0707");
			 Thread.sleep(2000);
			o.getloginButton().click();
			o.getuserButton();
			o.getmyprofile().click();
			 Thread.sleep(2000);
			o.getmyorders().click();
			 Thread.sleep(5000);
			o.getvalue().sendKeys("SAMSUNG Galaxy F12");
			 Thread.sleep(5000);
			o.getsearch().click();
			 Thread.sleep(5000);
			
			
    		driver.close();
			driver=null; 
		}
}


