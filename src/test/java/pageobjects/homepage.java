package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage extends basepage {

	public homepage(WebDriver driver) {
		super(driver);
		
	}
	
	WebElement myaccount = driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
	WebElement register = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
	
	
	public void clickmyaccount() {
		myaccount.click();
	}
	public void clickregister() {
		register.click();
	}

	
	

}
