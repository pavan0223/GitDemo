package resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;

public class Base 
{   public Properties prop;
	public WebDriver driver;
    
	public WebDriver initialzeDriver() throws IOException
	{
	prop=new Properties();
	FileInputStream file=new FileInputStream("D:\\EclipsePractice\\E2EProject\\src\\main\\java\\resources\\Data.properties");
    prop.load(file);
    String browsername=prop.getProperty("Browser");
    if(browsername.equals("chrome"))
    {
    	System.out.println("Chrome browser executed");
    	ChromeOptions ops = new ChromeOptions();
    	ops.addArguments("--disable-notifications");	
    	System.setProperty("webdriver.chrome.driver", "D:\\EclipsePractice\\E2EProject\\Library\\Drivers\\chromedriver.exe");
    	driver = new ChromeDriver(ops);
    	driver.manage().window().maximize();
    	
    }
    else if (browsername.equals("firefox"))
    {
    	System.out.println("firefox browser");
    }
    
    else
    {
    	System.out.println("No browser is ready for execution");
    }
    
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    return driver;
	}
	
	public void screenshots(String result) throws IOException
	{
		Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss"); 
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://"+result+sdf+"screenshot.png"));
		System.out.println("Failed screen shot is taken");
	}

	
}