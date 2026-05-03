package basicAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewUserCreationFB extends User_Data {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(StartingURL);

		WebElement CreateButtonClick = driver.findElement(By.xpath(createButtonPath));
		CreateButtonClick.click();

		driver.findElement(By.xpath(FirstNamePath)).sendKeys(FirstName);

		driver.findElement(By.xpath(SurnamePath)).sendKeys(Surname);
		
		WebElement DayDropDown = driver.findElement(By.name(DayDropDownPath));
		Select select=new Select(DayDropDown);
		select.selectByValue("1");
		select.selectByIndex(17);
		select.selectByVisibleText("16");
		WebElement MonthDropDown = driver.findElement(By.name(MonthDropDownPath));
		Select select1=new Select(MonthDropDown);
		select1.selectByValue("1");
		select1.selectByIndex(3);
		select1.selectByVisibleText("Apr");
		WebElement YearDropDown = driver.findElement(By.name(YearDropDownPath));
		Select select2=new Select(YearDropDown);
		select2.selectByValue("2025");
		select2.selectByIndex(20);
		select2.selectByVisibleText("2004");

		driver.findElement(By.xpath(GenderSelection)).click();
		
		driver.findElement(By.xpath(MobileAddPath)).sendKeys(Email);
		
		driver.findElement(By.xpath(PasswordPath)).sendKeys(Password);

		driver.findElement(By.xpath(SignupPath)).click();
		
		
		
		
	}
}
