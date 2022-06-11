package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {

	//driver
	public WebDriver driver;
	
	//Initializing locators
	By email = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By password = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By loginButton = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span");
	
	public Login_Page(WebDriver driver) {
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

	public WebElement getloginButton(){
		return driver.findElement(loginButton) ;
	}

}


