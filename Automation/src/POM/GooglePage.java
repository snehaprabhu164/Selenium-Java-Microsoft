package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

	@FindBy(xpath = "//*[@class='gLFyf']")
	private WebElement searchBox;

	@FindBy(xpath = "(//*[@value='Google Search'])[2]")
	private WebElement searchButton;

	public GooglePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setMessage(String text) {
		searchBox.sendKeys(text);
	}

	public void clickBox() {
		searchButton.click();
	}
}
