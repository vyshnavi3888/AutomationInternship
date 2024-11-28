package automationInternship;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testSearchFunctionality {
	
	WebDriver driver;
	tnpomc_homepage tn;
	
	@BeforeClass
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testSearch()
	{
		tn=new tnpomc_homepage(driver);
		tn.search("laptops");
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
