package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrangeHRM extends HRM_Info {

	WebDriver driver = new ChromeDriver();
	
//	public void InvalidLogin() {
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement usernamePath = driver.findElement(By.name("username"));
//		usernamePath.sendKeys(Username);
//
//		WebElement passwordPath = driver.findElement(By.name("password"));
//		passwordPath.sendKeys(Password);
//	}
	
	public void login() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement usernamePath = driver.findElement(By.name("username"));
		usernamePath.sendKeys(Username);

		WebElement passwordPath = driver.findElement(By.name("password"));
		passwordPath.sendKeys(Password);

		WebElement loginBtnPath = driver.findElement(By.xpath("//button[@type='submit']"));
		loginBtnPath.click();

		String PageTitle = driver.getTitle();
		if (PageTitle.equalsIgnoreCase("OrangeHRM")) {
			System.out.println("Login Success");
		} else {
			System.out.println("Login Unseccessfull");
		}
	}

	public void Admin() {
		WebElement AdminbtnPath = driver.findElement(By.xpath("//span[text()='Admin']"));
		AdminbtnPath.click();

		WebElement AddBtnPath = driver
				.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
		AddBtnPath.click();

		WebElement NamePath = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		NamePath.sendKeys(EmployeeName);
	}

	public void PIM() throws IOException {
		WebElement PIMPath = driver.findElement(By.xpath("//span[text()='PIM']"));
		PIMPath.click();
		WebElement AddEmpBtnPath = driver.findElement(By.xpath("//*[text()='Add Employee']"));
		AddEmpBtnPath.click();

		WebElement FNPth = driver.findElement(By.xpath("//input[@name='firstName']"));
		FNPth.sendKeys(EmployeeName);
		WebElement MNPth = driver.findElement(By.xpath("//input[@name='middleName']"));
		MNPth.sendKeys(EmployeeMidName);
		WebElement LNPth = driver.findElement(By.xpath("//input[@name='lastName']"));
		LNPth.sendKeys(EmployeeLastName);
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = "D:\\Selenium_SS\\SecondScreenShot.png";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		File Destination=new File(path);
		FileHandler.copy(src,Destination);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement SubmitBtnPth = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		SubmitBtnPth.click();

		String cnfrMsg = driver.findElement(By.xpath("//h6[text()='Personal Details']")).getText();
		if (cnfrMsg.contains("Personal Details")) {
			System.out.println("Employee data saved");
		} else {
			System.out.println("Employee data not saved");
		}
		
	}

	public void logout() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement UserNameClick = driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']"));
		UserNameClick.click();
		List<WebElement> dropdownItems = driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']//a"));
		for (int i = 0; i < dropdownItems.size(); i++) {
			System.out.println(i + dropdownItems.get(i).getText());

		}
		dropdownItems.get(3).click();

	}

	public static void main(String[] args) throws IOException {

		OrangeHRM OH = new OrangeHRM();
		//OH.InvalidLogin();
		OH.login();
		OH.Admin();
		OH.PIM();
		OH.logout();
		// driver.quit();
	}
}
