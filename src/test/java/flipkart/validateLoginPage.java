package flipkart;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import resources.base;

public class validateLoginPage extends base{
	
	public static Logger log =LogManager.getLogger(base.class.getName());
		@Test
		public void initialize() throws IOException, InterruptedException
		{
			//Initialized the driver
			driver =initializeDriver();
			driver.get(prop.getProperty("url"));
			
			//Constructor of edit page
			Login_Page o=new Login_Page(driver);
			 Thread.sleep(2000);
			 
			//Objects of constructor o
			o.getemail().sendKeys("pratikshakale0707@gmail.com");
			 Thread.sleep(2000);
			o.getpassword().sendKeys("Unipune@0707");
			 Thread.sleep(2000);
			o.getloginButton().click();
			
			
//			driver.close();
//			driver=null; 
		}
}
