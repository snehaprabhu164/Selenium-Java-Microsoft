package pageObjectsModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {

	WebDriver driver;

	public AbstractComponents(WebDriver driver) {
		this.driver = driver;

	}

	// WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='col-lg-4
	// col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted']")));

	public void waitForElementToAppear(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}

	// public void wait

}
