package employee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionClass {

    public static void main(String[] args) {

        // Step 1: Create WebDriver
        WebDriver driver = new ChromeDriver();

        // Step 2: Open application
        driver.get("http://your-application-url");

        // Step 3: Page navigation using POM
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickLogin();
        loginPage.performLogin("admin", "password");

        // Optional: close browser
        // driver.quit();
    }
}
