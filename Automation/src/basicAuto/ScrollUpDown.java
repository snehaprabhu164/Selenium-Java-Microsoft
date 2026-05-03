package basicAuto;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 0; i < 5; i++) {
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(2000);
		}

        js.executeScript("window.scrollBy(0, -2000)");
        Thread.sleep(2000);

        driver.quit();
    }
}
