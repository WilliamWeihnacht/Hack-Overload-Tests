package hackoverload.v1.pageobjects;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SplashPageObject {

	WebDriver driver;
	
	//Join button
	@FindBy(id = "splash-sign-up-button") WebElement joinButton;
	
	//Login button
	@FindBy(id = "splash-login-button") WebElement loginButton;
	
	//2nd login button
	@FindBy(id = "post-bubbles-button") WebElement secondLoginButton;
	
	public SplashPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickJoin () {
//		assertNotNull("Join button not found.",joinButton);
//		assertTrue("Join button not displayed.", joinButton.isDisplayed());
		joinButton.click();
	}
	
	public void clickLogin () {
		loginButton.click();
	}
	
	public void clickSecondLogin () {
		secondLoginButton.click();
	}
}
