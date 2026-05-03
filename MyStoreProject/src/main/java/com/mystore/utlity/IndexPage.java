package com.mystore.utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;

public class IndexPage {
	WebDriver driver;

	@FindBy(xpath = "//*[@class='login_logo']")
	WebElement MyStoreLogo;

	public IndexPage(WebDriver driver) {
	    this.driver = driver;             // ✅ now the driver is initialized
	    PageFactory.initElements(driver, this);
	}

	public boolean ValidateLogo() throws Exception {
		return Action.isDisplayed(driver, MyStoreLogo);
	}

	public String getMyStoreTitle() {
		String myStoreTitle = driver.getTitle();
		return myStoreTitle;
	}
}