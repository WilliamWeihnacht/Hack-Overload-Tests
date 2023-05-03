package hackoverload.v1.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hackoverload.v1.pageobjects.SplashPageObject;
import util.BrowserManager;

public class SplashPageTests {
	
	WebDriver driver;
	WebElement joinButton;
	
	@BeforeTest
	public void setup() {
		//driver = BrowserManager.getDriver("chrome");
		System.setProperty("webdriver.chrome.driver", "/Users/wwhynot/Documents/Selenium-projects/Hack Overload Tests/v1/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://stackoverflowclone-pk3b.onrender.com/splash");
	}
	
	@Test
	public void testJoin() {
		SplashPageObject splashPageInstance = new SplashPageObject(driver);
		splashPageInstance.clickJoin();
		
	}
	
	@AfterTest
	public void cleanup() {
		//driver.close();
	}

}
