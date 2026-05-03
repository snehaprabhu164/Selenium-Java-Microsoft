package EnEPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		// initilazation
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "username")
	WebElement userEmail;

	@FindBy(name = "password")
	WebElement passwordEle;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	public void loginApplication(String email, String password) {

		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();

	}

	public void goTo() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
