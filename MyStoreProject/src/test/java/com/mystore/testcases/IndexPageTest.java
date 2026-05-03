//package com.mystore.testcases;
//
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.mystore.base.BaseClass;
//import com.mystore.utlity.IndexPage;
//
//public class IndexPageTest extends BaseClass {
//
//    IndexPage indexpage;
//
//    @BeforeMethod
//    public void setup() {
//        launchApp();  // From your BaseClass, probably opens browser & URL
//        indexpage = new IndexPage(driver);
//    }
//
//    @Test
//    public void verifyLogo() throws Exception {
//        boolean result = indexpage.ValidateLogo();
//        Assert.assertTrue(result);
//    }
//
//    @Test
//    public void getMyStoreTitle1() {
//        String title = indexpage.getMyStoreTitle();
//        Assert.assertEquals(title, "Swag Labs");
//    }
//
////    @AfterMethod
////    public void tearDown() {
////        driver.quit();
////    }
//}
