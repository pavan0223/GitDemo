package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import resources.Base;



public class HomePage  extends Base

{
	@BeforeTest
	public void initilize() throws IOException
	{
		driver=initialzeDriver();
		driver.get(prop.getProperty("URL"));
	}
	
	@Test(dataProvider="getdata")
	public void Navigation(String Uname,String Pass) throws IOException, InterruptedException
	{
		
		LoginPage lp= new LoginPage(driver);
		lp.Emaild().sendKeys(Uname);
		lp.Password().sendKeys(Pass);
		//System.out.println(text);
		lp.submit().click();
		Thread.sleep(3000);
		
		
		
	}
	//GitUserX is created method
	@Test
	public void Logout()
	{
		
	}
	
	@AfterTest
	public void driverclose()
	{
		driver.close();
		driver=null;
	}
	@DataProvider
	public Object[][] getdata()
	{
		
		return new Object[][]{{"hiremath.pavan123@gmail.com","sonukumar"}};
	}

}
