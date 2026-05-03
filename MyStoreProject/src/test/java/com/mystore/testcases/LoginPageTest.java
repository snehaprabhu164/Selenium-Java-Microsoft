package com.mystore.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.AddToCartPage;
import com.mystore.pageobjects.BackToHomePage;
import com.mystore.pageobjects.CheckoutPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.OverviewPage;
import com.mystore.pageobjects.ProductsPage;
import com.mystore.pageobjects.YourInfoPage;

public class LoginPageTest extends BaseClass {

	@Test
	public void loginTest() throws Exception {

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		driver.get("https://www.saucedemo.com/");

	      launchApp();
	      String username = prop.getProperty("uname");
	        String password = prop.getProperty("pass");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username,password);

		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickOnProduct();
		Thread.sleep(1000);
		productspage.addProductToCart();
		Thread.sleep(2000);
		productspage.ClickCartIcon();
		
		AddToCartPage addtocart = new AddToCartPage(driver);
		// addtocart.getUnitPrice()
		Thread.sleep(1000);
		addtocart.clickCheckout();

		YourInfoPage yourinfo = new YourInfoPage(driver);
		Thread.sleep(1000);
		yourinfo.UserInfo("Snehal", "rao", "400608");

		OverviewPage overview = new OverviewPage(driver);
		// overview.getTotalPrice();
		Thread.sleep(1000);
		overview.FinishClick();

		CheckoutPage checkout = new CheckoutPage(driver);
		Thread.sleep(1000);
		checkout.hurryOrderDone();
		checkout.backHome();

		BackToHomePage backtohome = new BackToHomePage(driver);
		backtohome.ValidateHomePgLogo();

		 driver.quit();
	}
}
