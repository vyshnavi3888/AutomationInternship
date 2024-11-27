package automationInternship;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testLogo {
	
	WebDriver driver;
	@BeforeClass
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void logo()
	{
		tutorialsninja_homepage tn=new tutorialsninja_homepage(driver);
		//Assert.assertEquals(tn.logoDisplay(), true);
		tn.logoDisplay();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
