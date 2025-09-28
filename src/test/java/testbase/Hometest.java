package testbase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistrationPage;
import pageobjects.Homepage;

public class Hometest extends BaseTest {
	@Test
	public void verify_account_Registration()
	{
		Homepage hp=new Homepage (driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		regpage.setFirstName("John");
		regpage.setLastName("David");
		regpage.setEmail(abc@gmail.com);
		regpage.setPassword(xyz@1234);
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		String confmsg=regpage.getConfirmationMsg();
		Assert.assertEquals(confmsg, "your account has been created");
		
	}
	https://fd-calculator.in/result
}
