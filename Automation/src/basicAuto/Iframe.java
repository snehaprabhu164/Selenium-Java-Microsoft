package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {

		// Set ChromeDriver path (change path if needed)
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Open site that contains iframe
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().window().maximize();

		WebElement EnterIntoFrame = driver.findElement(By.xpath("//*[@title='Iframe Example']"));
		// Switch to first iframe (main result frame)
		driver.switchTo().frame(EnterIntoFrame);

		// Inside this frame, there is another iframe
		WebElement innerFrame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(innerFrame);

		// Get text from inner iframe
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println("Text inside iframe: " + text);

		// Switch back to parent frame
		driver.switchTo().parentFrame();

		// Print confirmation
		System.out.println("Back to parent frame");

		Thread.sleep(2000);
		driver.quit();
	}
}
