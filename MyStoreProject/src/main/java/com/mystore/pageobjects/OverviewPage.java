package com.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;

public class OverviewPage {
	WebDriver driver;
	@FindBy(xpath = "//*[@class='summary_total_label']")
	WebElement totalPrice;
	@FindBy(xpath = "//*[@class='btn btn_action btn_medium cart_button']")
	WebElement FinishBtn;

	public OverviewPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public double getTotalPrice() {
	    String totalPrice1 = totalPrice.getText(); // Example: "Total: $32.39"
	    String tot = totalPrice1.replaceAll("[^0-9.]", ""); // Keep only digits and dot
	    double finalTotalPrice = Double.parseDouble(tot);
	    System.out.println("✅ Extracted total price: " + finalTotalPrice);
	    return finalTotalPrice;
	}


	public CheckoutPage FinishClick() throws Exception {
		Action.click(driver, FinishBtn);
		return new CheckoutPage(driver);
	}

}
