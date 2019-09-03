package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPage 
{
	// created page by Gitx users
	   public WebDriver driver;
	   By Account_Settings=By.xpath("//div[@id='logoutMenu']");
	   By Logout=By.xpath("//span[contains(text(),'Log Out')]");
	   
	   public LogOutPage(WebDriver driver) 
	   {
		this.driver=driver;// TODO Auto-generated constructor stub
	   }
	   
	   public WebElement Account_Settings()
	   {
		   return driver.findElement(Account_Settings); 
	   }
	   
	   public WebElement Logout()
	   {
		   return driver.findElement(Logout); 
	   }


}
