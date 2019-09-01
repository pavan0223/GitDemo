 package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 

{
	   public WebDriver driver;
	   By pageTitle=By.id("pageTitle");
	   By username=By.id("email");
	   By Password=By.id("pass");
	   By Login=By.id("loginbutton");
	   By Account_Settings=By.xpath("//div[@id='logoutMenu']");
	   By Logout=By.xpath("//span[contains(text(),'Log Out')]");
	   
	   
	   
	   public LoginPage(WebDriver driver) 
	   {
		this.driver=driver;// TODO Auto-generated constructor stub
	}
	   
	   public WebElement PageTitle()
	   {
		   return driver.findElement(pageTitle);
	   }

	   public WebElement Emaild()
	   {
		   return driver.findElement(username);
	   }
	        
	   public WebElement Password()
	   {
		   return driver.findElement(Password);
	   }
	   
	   public WebElement submit()
	   {
		   return driver.findElement(Login);
	   }
	
}
