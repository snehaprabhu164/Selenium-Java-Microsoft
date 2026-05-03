package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstanceAuto1 extends InstanceAuto {
	public InstanceAuto1(String email, String password) {
		super(email, password);

	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.ultimateqa.com/users/sign_in");

		// Pass values while creating object
		InstanceAuto obj = new InstanceAuto("Sneha@gmail.com", "Sneha@123");

		WebElement passemail = driver.findElement(By.id("user[email]"));
		passemail.sendKeys(obj.Email);

		WebElement password = driver.findElement(By.name("user[password]"));
		password.sendKeys(obj.pass);

		WebElement submitBtn = driver.findElement(By.className("button-primary"));
		submitBtn.click();

	}
}
