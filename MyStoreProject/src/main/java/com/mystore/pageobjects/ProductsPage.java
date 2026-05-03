package com.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class ProductsPage extends BaseClass {
	WebDriver driver;

	// ✅ FIXED — removed extra space in class name
	@FindBy(xpath = "(//*[@class='inventory_item_name '])[1]")
	WebElement BagProductpth;

	@FindBy(id = "add-to-cart")
	WebElement BagAddToCartpth;

	@FindBy(css = "[data-test='shopping-cart-link']")
	WebElement AddToCart;

	

	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnProduct() throws Exception {
		Action.click(driver, BagProductpth);
	}

	public void addProductToCart() throws Exception {

		Action.click(driver, BagAddToCartpth);

	}

	public AddToCartPage ClickCartIcon() throws Exception {

		Action.click(driver, AddToCart);

		return new AddToCartPage(driver);
	}
}
