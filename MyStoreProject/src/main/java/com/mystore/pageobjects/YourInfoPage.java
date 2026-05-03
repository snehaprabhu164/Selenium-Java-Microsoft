package com.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;

public class YourInfoPage {
	WebDriver driver;
	@FindBy(xpath = "(//*[@class='input_error form_input'])[1]")
	WebElement Fname;
	@FindBy(xpath = "(//*[@class='input_error form_input'])[2]")
	WebElement Lname;
	@FindBy(xpath = "(//*[@class='input_error form_input'])[3]")
	WebElement PinCode;
	@FindBy(xpath = "//*[@class='submit-button btn btn_primary cart_button btn_action']")
	WebElement ContinueBtn;

	public YourInfoPage(WebDriver driver) {
		 this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	public OverviewPage UserInfo(String FirstName, String LastName, String Pincode1) throws Exception {
		Action.type(driver,Fname, FirstName);
		Action.type(driver,Lname, LastName);
		Action.type(driver,PinCode, Pincode1);
		Action.click(driver, ContinueBtn);
		return new OverviewPage(driver);
	}

}
