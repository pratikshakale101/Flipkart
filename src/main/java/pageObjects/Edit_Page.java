package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Edit_Page {

	//driver
	public WebDriver driver;
	
	//Initializing locators
	By email = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By password = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	By loginButton = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span");
	By userButton = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div");
	By myprofile = By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[1]/a/div");
	By perEdit = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div[1]/div[1]/div/span[2]");
	By clearfirst = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div[1]/div[1]/form/div[1]/div[1]/div/input");
	By clearlast = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div[1]/div[1]/form/div[1]/div[2]/div/input");
	By firstName = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div[1]/div[1]/form/div[1]/div[1]/div/input");
	By lastName = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div[1]/div[1]/form/div[1]/div[2]/div/input");
	By save = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/div/div[1]/div[1]/form/div[1]/button");
	
	
	public Edit_Page(WebDriver driver) {
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
	
	public WebElement getperEdit(){
		return driver.findElement(perEdit) ;
	}
	
	public WebElement getfirst(){
		return driver.findElement(clearfirst) ;
	}
	
	public WebElement getlast(){
		return driver.findElement(clearlast) ;
	}
	
	public WebElement getfirstName(){
		return driver.findElement(firstName) ;
	}
	
	public WebElement getlastName(){
		return driver.findElement(lastName) ;
	}
	
	public WebElement getsave(){
		return driver.findElement(save) ;
	}
	
	
}
