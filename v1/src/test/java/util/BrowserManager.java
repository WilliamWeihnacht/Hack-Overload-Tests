package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrowserManager {
	
	public static WebDriver getDriver(String type) {
		WebDriver driver = null;
		if (type.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			//driver = new Firefox
		} else {
			Assert.assertTrue(false,"No Browser type sent");
		}
		driver.manage().window().maximize();
		return driver;
	}
}
