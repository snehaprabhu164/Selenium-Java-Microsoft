package basicAuto;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUp1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
//============================
// 1. SIMPLE ALERT POPUP
// ============================
		WebElement simplepopup = driver.findElement(By.id("alertBox"));
		simplepopup.click();
		String getTextsimplepopup = driver.switchTo().alert().getText();
		System.out.println(getTextsimplepopup);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

// ============================
// 2. CONFIRMATION ALERT POPUP
// ============================
		WebElement confirmBoxPopUp = driver.findElement(By.id("confirmBox"));
		confirmBoxPopUp.click();
		String getconfirmBoxPopUp = driver.switchTo().alert().getText();
		System.out.println(getconfirmBoxPopUp);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
//driver.switchTo().alert().dismiss();
		WebElement getAnswerAfterClick = driver.findElement(By.id("output"));
		String resultText = getAnswerAfterClick.getText();
		System.out.println(resultText);
		if (resultText.equalsIgnoreCase("You pressed Cancel in confirmation popup")) {
			System.out.println("user press Cancel");
		} else {
			System.out.println("user didnt press Cancel");
		}
		
// ============================
// 3. PROMPT ALERT POPUP
// ============================
		WebElement AlertPopUp = driver.findElement(By.id("promptBox"));
		AlertPopUp.click();
		driver.switchTo().alert().sendKeys("I am Handling PromptAlert");
        Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement getAnswerAlertClick = driver.findElement(By.id("output"));
		String resultText1 = getAnswerAlertClick.getText();
		System.out.println(resultText1);
		
		

	}
}