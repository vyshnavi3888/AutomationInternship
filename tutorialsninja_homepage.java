package automationInternship;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tutorialsninja_homepage {
	
	WebDriver driver;
	
	//constructor
	tutorialsninja_homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locators
	
	@FindBy(xpath="//a[text()='Qafox.com']")   WebElement  logo;
	
	//action methods
	
	public void logoDisplay()
	{
		logo.isDisplayed();
	}
}
