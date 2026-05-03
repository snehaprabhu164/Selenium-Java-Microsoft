package NG_Auto;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	  @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("Before Suite - runs first, before everything");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("After Suite - runs last, after everything");
	    }

	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("Before Test - runs before <test> tag in testng.xml");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("After Test - runs after <test> tag in testng.xml");
	    }

	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Before Class - runs before first @Test method in class");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("After Class - runs after all @Test methods in class");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("Before Method - runs before each @Test method");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("After Method - runs after each @Test method");
	    }

	    @Test
	    public void test1() {
	        System.out.println("Executing Test 1");
	    }

	    @Test
	    public void test2() {
	        System.out.println("Executing Test 2");
	    }

}
