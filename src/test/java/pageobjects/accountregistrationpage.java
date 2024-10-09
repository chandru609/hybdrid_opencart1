package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class accountregistrationpage extends basepage {

	public accountregistrationpage(WebDriver driver) {
		super(driver);
		
	}
	
WebElement txtfirstname = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
WebElement txtlastname = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
WebElement txtemail = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
WebElement txtpassword = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
WebElement txtconfirmpassword = driver.findElement(By.xpath("//input[@id='input-confirm']"));
WebElement chkpolicy = driver.findElement(By.xpath("//input[@name='agree']"));
WebElement btncontinue = driver.findElement(By.xpath("//input[@value='Continue']"));
WebElement msgconfirmation = driver.findElement(By.xpath("//h1[normalize-space()='Your Accout Has Been Created!']"));


public void setfirstname(String fname) {
	txtfirstname.sendKeys(fname);
}

public void setlastname(String lname) {
	txtlastname.sendKeys(lname);
}

public void setemail(String email) {
	txtemail.sendKeys(email);
}

public void setconformpassword(String pwd) {
	txtconfirmpassword.sendKeys(pwd);
}

public void setprivacypolicy() {
	chkpolicy.click();
}

public void clickcontinue() {
	btncontinue.click();
}

public String getconfirmationmsg() {
	try {
		return (msgconfirmation.getText());
	}
	catch(Exception e) {
		return(e.getMessage());
	}
}














	
}
