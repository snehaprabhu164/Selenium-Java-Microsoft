package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		// Create object of POM class
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		GooglePage gp = new GooglePage(driver);

		// Perform actions
		gp.setMessage("Java Tutorial");
		gp.clickBox();
	}
}
