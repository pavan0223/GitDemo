package Academy;


import java.io.IOException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import resources.Base;

public class PageTitleValidation extends Base 

{
	
	@BeforeTest
	public void Initialze() throws IOException
	{
		driver=initialzeDriver();
		driver.get(prop.getProperty("URL"));
		
	}
	
	@Test
	public void Navigation()throws IOException
	{
		
		
		LoginPage LP=new LoginPage(driver);
		String actualTitle="Facebook – log in or sign-up1";
		String expectedTitle=driver.getTitle();
		//System.out.println(actualTitle);
		Assert.assertNotSame(expectedTitle,actualTitle); 
		
		
			screenshots(expectedTitle);
		
	    
		//System.out.println("PageTitle Matched");
		
	}
	@AfterTest
	public void driverclose()
	{
		driver.close();
		driver=null;
	}
	

}
