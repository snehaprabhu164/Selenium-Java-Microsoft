package employee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators for Login
    private By lnkLogin = By.linkText("Login");

    // Locators for Employee List
    private By lnkEmployeeList = By.linkText("Employee List");

    public LoginPage clickLogin() {
        driver.findElement(lnkLogin).click();
        return new LoginPage(driver);
    }

    public EmployeeListPage clickEmployeeList() {
        driver.findElement(lnkEmployeeList).click();
        return new EmployeeListPage(driver);
    }
}
