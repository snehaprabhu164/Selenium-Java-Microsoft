package com.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;

public class BackToHomePage {
	WebDriver driver;
	@FindBy(xpath = "//*[@class='title']")
	WebElement HomePgTiitle;

	  public BackToHomePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	public void ValidateHomePgLogo() throws Exception {
		Action.isDisplayed(driver, HomePgTiitle);
		String titleText = HomePgTiitle.getText();
		System.out.println(titleText);
	}
}
