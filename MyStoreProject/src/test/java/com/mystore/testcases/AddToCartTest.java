//package com.mystore.testcases;
//
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import com.mystore.base.BaseClass;
//import com.mystore.pageobjects.AddToCartPage;
//import com.mystore.pageobjects.LoginPage;
//import com.mystore.pageobjects.ProductsPage;
//import com.mystore.pageobjects.YourInfoPage;
//import com.mystore.utlity.IndexPage;
//
//public class AddToCartTest extends BaseClass {
//	IndexPage indexpage;
//	LoginPage loginpage;
//	ProductsPage productspage;
//	AddToCartPage addtocartpage;
//	YourInfoPage yourinfopage;
//
//	@BeforeClass
//	public void setup() throws Exception {
//		 launchApp(); // Opens browser
//		    loginpage = new LoginPage(driver);
//
//		    // Login and go to products page
//		    productspage = loginpage.login(prop.getProperty("uname"), prop.getProperty("pass"));
//
//		    // Add product to cart
//		    productspage.addProductToCart();
//
//		    // ✅ Now click on cart icon to go to cart page
//		    addtocartpage = productspage.ClickCartIcon();
//
//		    // Initialize the next page
//		    yourinfopage = new YourInfoPage(driver);
//	}
//
//	@Test
//	public void AddToCartPageLoading() throws Exception {
//		AddToCartPage addtocartpage=new AddToCartPage(driver);
//		addtocartpage.getUnitPrice();
//		addtocartpage.clickCheckout();
//	}
//	
//	
//	
//	
////	@Test
////	public void VerifyUnitPrice() {
////		addtocartpage.getUnitPrice();
////	}
////
////	@Test
////	public void VerifyCheckOut() throws Exception {
////		yourinfopage = addtocartpage.clickCheckout();
////	}
//
//}
