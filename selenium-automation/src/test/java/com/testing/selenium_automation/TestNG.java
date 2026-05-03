package com.testing.selenium_automation;

import org.junit.jupiter.api.Test;
import org.testng.annotations.DataProvider;

import com.beust.jcommander.Parameters;

public class TestNG {
	@Test
	public void testLogin() {
		System.out.println("Im Testing the login ");

	}

	@Parameters({ "UserName", "Password" })
	@Test
	public void testBCreateEmployee(String userName, String password) {

		// POM Code
		var homePage = new HomePage(driver);
		var loginPage = homePage.clickLogin();
		homePage = loginPage.performLogin(userName, password);

		var employeeListPage = homePage.clickEmployeeList();
		var createEmployeePage = employeeListPage.clickCreateNew();

		createEmployeePage.createNewEmployee("AutoUser2", "22222", "autotestuser2@gmail.com", "8000", "Middle");

		homePage.clickLogOff();
	}
	
	 @Test(dataProvider = "CreateEmployee")
	    public void testwithdataprovider(
	            String name,
	            String durationWorked,
	            String email,
	            String salary,
	            String role) {

	        // POM Code
	        var homePage = new HomePage(driver);
	        var loginPage = homePage.clickLogin();
	        homePage = loginPage.performLogin("admin", "password");

	        var employeeListPage = homePage.clickEmployeeList();
	        var createEmployeePage = employeeListPage.clickCreateNew();

	        createEmployeePage.createNewEmployee(
	                name,
	                durationWorked,
	                email,
	                salary,
	                role
	        );

	        homePage.clickLogOff();
	    }

	@DataProvider(name = "CreateEmployee")
	public static Object[][] createEmployeeData() {

		return new Object[][] { new Object[] { "DDTUser", "9999", "ddtuser@gmail.com", "8000", "Middle" } };
	}
}
