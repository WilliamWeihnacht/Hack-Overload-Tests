package hackoverload.v1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"login\"]/form/label[1]/input") WebElement usernameInput;
	
	@FindBy(xpath = "//*[@id=\"login\"]/form/label[2]/input") WebElement passwordInput;
	
	@FindBy(xpath = "//*[@id=\"login\"]/form/button[1]") WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"login\"]/form/button[2]") WebElement demoLoginButton;
	
	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	public void clickDemoLogin() {
		demoLoginButton.click();
	}
	
	public void login(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		loginButton.click();
	}
}
