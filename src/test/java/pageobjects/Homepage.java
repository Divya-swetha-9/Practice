package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {
	WebDriver driver;
	
	public Homepage (WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//span[@class='d-none d-md-inline']") 
	WebElement linkMyAccount;
	
	@FindBy(xpath="//*[@id='top']/div/div[2]/ul/li[2]/div/ul/li[1]/a")
	WebElement linkregister;
	
	
	public void clickMyAccount()
	{
		linkMyAccount.click();
	}
	
	public void clickRegister()
	{
		linkMyAccount.click();
	}
	
	

}
