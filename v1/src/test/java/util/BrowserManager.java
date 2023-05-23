package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserManager {
	
	public static WebDriver getDriver(String type) {
		WebDriver driver = null;
		if (type.equalsIgnoreCase("chrome")) {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"/drivers/chromedriver");
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