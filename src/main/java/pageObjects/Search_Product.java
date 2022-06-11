package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search_Product {

	    //driver
		public WebDriver driver;
		
		//Initializing locators
		By email = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
		By password = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
		By loginButton = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span");
		By userButton = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div");
		By myprofile = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[1]/a/div");
		By myorders = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/div/a");
		By value = By.className("_1uMrhc");
		By search = By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[3]/div[2]/div[1]/button/div/span");

		
		public Search_Product(WebDriver driver) {
			// TODO Auto-generated constructor stub

			this.driver=driver;
	   }
		
		//Finding Elements using locator
		public WebElement getemail(){
			return driver.findElement(email) ;
		}

		public WebElement getpassword() {
			return driver.findElement(password) ;
		}
		
		public WebElement getloginButton() {
			return driver.findElement(loginButton);
		}

		public WebElement getuserButton(){
			return driver.findElement(userButton) ;
		}
		
		public WebElement getmyprofile(){
			return driver.findElement(myprofile) ;
		}
		
		public WebElement getmyorders(){
			return driver.findElement(myorders) ;
			
		}
		
		public WebElement getvalue(){
			return driver.findElement(value) ;
		}
		
		public WebElement getsearch(){
			return driver.findElement(search) ;
		}
}
