package hackoverload.v1.testcases;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import hackoverload.v1.pageobjects.LoginPageObject;
import hackoverload.v1.pageobjects.NavbarPageObject;

import util.BrowserManager;

public class LoginPageTests {

	WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		driver = BrowserManager.getDriver("chrome");
	}
	
	@BeforeMethod
	public void beforeEach() {
		driver.get("https://stackoverflowclone-pk3b.onrender.com/login");
		NavbarPageObject navbarPageInstance = new NavbarPageObject(driver);
		if (navbarPageInstance.loggedIn()) navbarPageInstance.logout();
	}
	
	@Test
	public void testDemoLogin() {
		LoginPageObject loginPageInstance = new LoginPageObject(driver);
		assertEquals(driver.getCurrentUrl(), "https://stackoverflowclone-pk3b.onrender.com/login");
		loginPageInstance.clickDemoLogin();
		assertEquals(driver.getCurrentUrl(),"https://stackoverflowclone-pk3b.onrender.com/questions?page=1");
	}
	
	@AfterSuite
	public void cleanup() {
		driver.close();
	}
	
}
