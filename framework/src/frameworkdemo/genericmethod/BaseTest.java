package frameworkdemo.genericmethod;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import javax.management.MXBean;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst {
	public WebDriver driver;
	
	 @BeforeMethod
	 public void openApp() {
		 System.setProperty(CHROME_KEY, CHROME_VALUE);
	  driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get("URL");
	 
	 }
	 
	 
	 
	 @AfterMethod
	 public  void closeApp() {

	
		driver.close();
	}
	
}

