package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
	
	@SuppressWarnings("deprecation")
	public static WebDriver getDriver(String type) {
		WebDriver driver = null;
		if (type.equalsIgnoreCase("chrome")) {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"/drivers/chromedriver");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			//driver = new Fire Fox driver TODO
		} else {
			throw new IllegalStateException("driver type not recognized");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //TODO update
		return driver;
	}
}