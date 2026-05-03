package com.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;

public class LoginPage {
	WebDriver driver;
	@FindBy(id = "user-name")
	WebElement UserNamePth;
	@FindBy(xpath = "(//*[@class='input_error form_input'])[2]")
	WebElement PasswordPth;
	@FindBy(xpath = "//*[@class='submit-button btn_action']")
	WebElement SubmitBtn;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public ProductsPage login(String uname, String pass) throws Exception {
	    Action.type(driver, UserNamePth, uname);
	    Action.type(driver, PasswordPth, pass);
	    Action.click(driver, SubmitBtn);
	    return new ProductsPage(driver);
	}

}
