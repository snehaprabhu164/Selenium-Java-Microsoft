package EnEPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunMethods {

    public static void main(String[] args) {
        // Create a ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Create object of LoginPage and open the site
        LoginPage login = new LoginPage(driver);
        login.goTo(); // opens the login page

        // Perform login
        login.loginApplication("Admin", "admin123");

        // Optional: Add a small wait or close the browser
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //driver.quit();
    }
}
