package basicAuto;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 extends User_Data {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Dimension d=new Dimension(1000,700);//Width and Height
		driver.manage().window().setSize(d);

		driver.get(StartingURL);
		driver.findElement(By.xpath(ForgotButtonPathOnSignupPage)).click();
		Thread.sleep(2000);
		WebElement AnotherForgotButtonClick = driver
				.findElement(By.xpath("//*[contains(text(),'Forgotten account?')]"));
		AnotherForgotButtonClick.click();
		Thread.sleep(2000);
		WebElement AnotherForgotButtonClick1 = driver
				.findElement(By.xpath("//*[contains(text(),'Forgotten account?')]"));
		AnotherForgotButtonClick1.click();

		String winhandle = driver.getWindowHandle();
		System.out.println(winhandle);
		Set<String> winhandle2 = driver.getWindowHandles();
		int countOfWindow = winhandle2.size(); // Number of Count Window
		System.out.println(countOfWindow);
		System.out.println(winhandle2);
		for (String window : winhandle2) {
			if (!window.equalsIgnoreCase(winhandle)) {
				driver.switchTo().window(window);
				System.out.println("Switch To Child Class");
			}
		}

	}
}
