package basicAuto;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// String StartingURL = "https://www.facebook.com/";

		driver.navigate().to("https://www.facebook.com/");

		WebElement ForgotButtonclick = driver.findElement(By.xpath("//*[text()='Forgotten password?']"));
		ForgotButtonclick.click();

		Thread.sleep(2000);

		// WebElement AnotherForgotButtonClick =
		// driver.findElement(By.xpath("//*[contains(text(),'Forgotten account?')]"));
		// AnotherForgotButtonClick.click();

		// WebElement ForgotButtonclick = driver.findElement(By.linkText("Forgotten
		// password?"));
		// ForgotButtonclick.click();

		// WebElement ForgotButtonclick =driver.findElement(By.partialLinkText("gotten
		// passw"));
		// ForgotButtonclick.click();

		// We check Current Window and getWindowID with the help getWindowHandle

		String currentURL = driver.getCurrentUrl();

		System.out.println(currentURL);

		String parent = driver.getWindowHandle();
		System.out.println(parent);

		// Navigate to Other Window

		System.out.println("===========");

		WebElement AnotherForgotButtonClick = driver
				.findElement(By.xpath("//*[contains(text(),'Forgotten account?')]"));
		AnotherForgotButtonClick.click();

		WebElement AnotherForgotButtonClick1 = driver
				.findElement(By.xpath("//*[contains(text(),'Forgotten account?')]"));
		AnotherForgotButtonClick1.click();

		// Get All Opened WindowID

		Set<String> allOpenedWindow = driver.getWindowHandles();
		System.out.println(allOpenedWindow);

		System.out.println("===========");

		int countOfWindow = allOpenedWindow.size(); // Number of Count Window

		System.out.println(countOfWindow);

		for (String child : allOpenedWindow) {
			
			if (!parent.equalsIgnoreCase(child)) {
				System.out.println("Trying to Redirect back to parent window");
				driver.switchTo().window(child);
				System.out.println("Redirect abck to parent window");
				System.out.println("ChildWindow Title:" + driver.getTitle());

				Thread.sleep(2000);

			}

		}

		//driver.quit();

		// driver.navigate().to(StartingURL);

	}
}
