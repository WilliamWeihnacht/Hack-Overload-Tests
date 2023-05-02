package hackoverload.v1.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hackoverload.v1.pageobjects.SplashPageObject;
import util.BrowserManager;

public class SplashPageTests {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		driver = BrowserManager.getDriver("chrome");
		driver.get("https://stackoverflowclone-pk3b.onrender.com/splash");
	}
	
	@Test
	public void test_join() {
		SplashPageObject splashPageInstance = new SplashPageObject(driver);
		splashPageInstance.clickJoin();
	}

}
