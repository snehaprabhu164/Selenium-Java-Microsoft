package pageObjectsModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponents {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	// PageFactory

	@FindBy(id = "userEmail")
	WebElement userEmailAddress;

	@FindBy(id = "userPassword")
	WebElement userPasswordCredentials;

	@FindBy(id = "login")
	WebElement loginButton;

	// Action Methods

	public void loginApplication(String email, String password) {

		userEmailAddress.sendKeys(email);
		userPasswordCredentials.sendKeys(password);
		loginButton.click();

	}

	public void goToWebsite() {
		driver.get("https://rahulshettyacademy.com/client/");

	}
}
