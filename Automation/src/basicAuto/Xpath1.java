package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	static String passwordfiled = "secret_sauce";
	static String username1 = "standard_user";
	static String usernmae2 = "locked_out_user";
	static String username3 = "performance_glitch_user";
	static String username4 = "123456";

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement passfield = driver.findElement(By.xpath("(//input[@id='password'])"));
		passfield.sendKeys(passwordfiled);
		WebElement userfield = driver.findElement(By.xpath("(//input[@placeholder='Username'])"));
		userfield.sendKeys(username1);
		WebElement logbtn = driver.findElement(By.xpath("(//input[@value='Login'])"));
		logbtn.click();
		driver.navigate().back();
		System.out.println("Navigated back to previous page");
		driver.close();

	}
}
