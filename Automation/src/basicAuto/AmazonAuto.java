package basicAuto;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAuto {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@data-csa-c-content-id='nav_ya_signin']")).click();
		driver.findElement(By.id("ap_email_login")).sendKeys("+91 9326420221");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//*[@aria-labelledby='secondary_channel_button-announce']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Verify OTP Button']")).click();

	}
}
