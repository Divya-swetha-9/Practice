package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	WebDriver driver;
	
	public AccountRegistrationPage (WebDriver driver)
	{
		super(driver);
	}

	
	
	@FindBy(xpath="//*[@id=\"\'input-firstname\']")
	WebElement txtfirstname;
	
	@FindBy(xpath="//*[@id=\'input-lastname\']")
	WebElement txtlastname;
	
	@FindBy(xpath="//*[@id=\'input-email\']")
	WebElement txtemail;
	
	@FindBy(xpath="//*[@id=\'input-password\']")
	WebElement txtpassword;
	
	@FindBy(xpath="//*[@id=\'form-register\']/div/div/input")
	WebElement chkprivacypolicy;
	
	@FindBy(xpath="//*[@id=\'form-register\']/div/button")
	WebElement btncontinue;
	
	
	public void setFirstName(String fname)
	{
		txtfirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtfirstname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void setPassword (String password)
	{
		txtpassword.sendKeys(password);
	}
	
	public void setPrivacyPolicy()
	{
		chkprivacypolicy.click();
	}
	
	public void clickContinue()
	{
		btncontinue.click();
	}
	
	public String getConfirmationMsg()
	{
		try {
			return(msgconfirmation.gettext());
		    }
		catch(exception E) {
			return(e.get message());
		}
	}
}