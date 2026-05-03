package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganeHRMLogin {
	@FindBy(xpath="//*[@placeholder='Username']")
	private WebElement usernamePath;
	
//	private WebElement passwordPath;
//	@FindBy(xpath = "//button[@type='submit']")
//	private WebElement loginBtnPath;

	public OrganeHRMLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	public void usernamePath1(String text) {
//		usernamePath.sendKeys(text);
//		}
	public void usernamePath1() {
		usernamePath.sendKeys("Admin");
		}
	
	public void ClickLogin() {
	//	loginBtnPath.click();
	}

}
