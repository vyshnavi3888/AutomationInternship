package automationInternship;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tnpomc_homepage {
	
	WebDriver driver;
	
	//constructor
	tnpomc_homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locators
	
	@FindBy(xpath="//a[text()='Qafox.com']")   WebElement  logo;
	
	@FindBy(xpath="//span[text()='My Account']")  WebElement btn_myaccount;
	
	@FindBy(xpath="//a[text()='Login']")  WebElement btn_login;
	
	@FindBy(xpath="//input[@placeholder='Search']")   WebElement  searchbar;

	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")   WebElement btn_search ;

	
	
	//action methods
	
	public void logoDisplay()
	{
		logo.isDisplayed();
	}
	
	public void myacc()
	{
		btn_myaccount.click();
	}
	
	public void login()
	{
		btn_login.click();
	}
	
	public void search(String name)
	{
		searchbar.sendKeys(name);
		btn_search.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
