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
	tnpomc_homepage tn;
	
	@BeforeClass
	public void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void logo() throws InterruptedException
	{
		 tn=new tnpomc_homepage(driver);
		//Assert.assertEquals(tn.logoDisplay(), true);
		tn.logoDisplay();
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void clickOnLoginbtn()
	{
		tn.myacc();
		tn.login();
	}
	
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

}
