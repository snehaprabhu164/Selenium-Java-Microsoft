package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAuto {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("snehaprabhu164@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		String ab = driver.getTitle();
		String cd = "gamil";
		if (ab.equalsIgnoreCase(cd)) {
			Thread.sleep(2000);
			System.out.println("Title Test pass");
		} else {
			System.out.println("Title Test fail");
		}
		//driver.close();
	}
}
