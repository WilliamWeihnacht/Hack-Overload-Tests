package hackoverload.v1.testcases;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hackoverload.v1.pageobjects.SplashPageObject;
import util.BrowserManager;

public class SplashPageTests {
	
	WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		//driver = BrowserManager.getDriver("chrome");
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path+"/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void beforeEach() {
		driver.get("https://stackoverflowclone-pk3b.onrender.com/splash");
	}
	
	@Test
	public void testJoinButton() {
		SplashPageObject splashPageInstance = new SplashPageObject(driver);
		splashPageInstance.clickJoin();
		assertEquals(driver.getCurrentUrl(),"https://stackoverflowclone-pk3b.onrender.com/signup");
	}
	
	@Test
	public void testLoginButton() {
		SplashPageObject splashPageInstance = new SplashPageObject(driver);
		splashPageInstance.clickLogin();
		assertEquals(driver.getCurrentUrl(),"https://stackoverflowclone-pk3b.onrender.com/login");
	}
	
	@Test
	public void testSecondJoinButton() {
		SplashPageObject splashPageInstance = new SplashPageObject(driver);
		splashPageInstance.clickSecondJoin();
		assertEquals(driver.getCurrentUrl(),"https://stackoverflowclone-pk3b.onrender.com/signup");
	}
	
	@AfterSuite
	public void cleanup() {
		driver.close();
	}

}
