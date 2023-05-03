package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserManager {
	
	public static WebDriver getDriver(String type) {
		WebDriver driver = null;
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/wwhynot/Documents/Selenium-projects/Hack Overload Tests/v1/drivers/chromedriver");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			//driver = new firefox driver TODO
		} else {
			Assert.assertTrue(false,"No Browser type sent");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
}