//package com.mystore.testcases;
//
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import com.mystore.base.BaseClass;
//import com.mystore.pageobjects.AddToCartPage;
//import com.mystore.pageobjects.LoginPage;
//import com.mystore.pageobjects.ProductsPage;
//import com.mystore.utlity.IndexPage;
//
//public class ProductPageTest extends BaseClass {
//	IndexPage indexpage;
//	LoginPage loginpage;
//	ProductsPage productspage;
//	AddToCartPage addtocartpage;
//
//	@BeforeClass
//	public void setup() throws Exception {
//		launchApp(); // Opens the browser and URL
//		loginpage = new LoginPage(driver);
//
//		// ✅ This logs in and returns the ProductsPage
//		productspage = loginpage.login(prop.getProperty("uname"), prop.getProperty("pass"));
//
//		// ✅ Don't create a new ProductsPage again (that loses the login)
//		addtocartpage = new AddToCartPage(driver);
//	}
//
//	@Test
//	public void verifylogo() throws Exception {
//		productspage.validateHomePageTitle();
//
//	}
//
//	@Test
//	public void verifyisProductAvailable() throws Exception {
//		productspage.isProductAvailable();
//	}
//
//	@Test
//	public void verifyClickOnProduct() throws Exception {
//		productspage.clickOnProduct();
//	}
//
//	@Test
//	public void verifyAddTheProduct() throws Exception {
//		productspage.addProductToCart();
//	}
//
//	@Test
//	public void verifyCartIcon() throws Exception {
//		addtocartpage = productspage.ClickCartIcon();
//	}
//
//}
