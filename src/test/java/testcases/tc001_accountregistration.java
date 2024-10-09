package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;


import pageobjects.accountregistrationpage;
import pageobjects.homepage;


public class tc001_accountregistration {

	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		
	}	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void verify_account_registration() {
		homepage hp = new homepage(driver);
		hp.clickmyaccount();
		hp.clickregister();
		
		
		accountregistrationpage regpage = new accountregistrationpage(driver);
		regpage.setfirstname("John");
		regpage.setlastname("David");
		regpage.setemail("abcjohndavif@gamil.com");
		regpage.setconformpassword("xyz51231234");
		regpage.setprivacypolicy();
		regpage.clickcontinue();
		
		
		String confmsg = regpage.getconfirmationmsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created");
	}
}
