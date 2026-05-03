package com.mystore.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mystore.actiondriver.Action;

public class AddToCartPage {
	WebDriver driver;

	// ✅ Correct XPath for Cart page
	@FindBy(xpath = "//div[@class='cart_item']//div[@class='inventory_item_price']")
	WebElement unitPrice;

	@FindBy(id = "checkout")
	WebElement CheckoutBtn;

	public AddToCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public double getUnitPrice() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    try {
	        // ✅ Wait until the price element is visible   
	        wait.until(ExpectedConditions.visibilityOf(unitPrice));

	        String priceText = unitPrice.getText();
	        System.out.println("Price text found: " + priceText);

	        priceText = priceText.replace("$", "").trim();
	        return Double.parseDouble(priceText);

	    } catch (Exception e) {
	        System.out.println("⚠️ Could not find product price. Page HTML may not be loaded yet.");
	        driver.navigate().refresh(); // optional, retry once
	        wait.until(ExpectedConditions.visibilityOf(unitPrice));
	        String priceText = unitPrice.getText().replace("$", "").trim();
	        return Double.parseDouble(priceText);
	    }
	}


	public YourInfoPage clickCheckout() throws Exception {
		Action.click(driver, CheckoutBtn);
		return new YourInfoPage(driver);
	}

}
