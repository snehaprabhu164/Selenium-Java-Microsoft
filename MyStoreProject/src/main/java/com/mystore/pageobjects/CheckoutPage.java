package com.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;

public class CheckoutPage {
	WebDriver driver;
	@FindBy(xpath = "//*[@class='complete-header']")
	WebElement OrderCompleted;
	@FindBy(xpath = "//*[@class='btn btn_primary btn_small']")
	WebElement BackToHomeBtn;

	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public String hurryOrderDone() throws Exception {
		String confirmMsg = OrderCompleted.getText();
		System.out.println(confirmMsg);
		return confirmMsg;
	}

	public BackToHomePage backHome() throws Exception {
		Action.click(driver, BackToHomeBtn);
		return new BackToHomePage(driver);
	}

}
