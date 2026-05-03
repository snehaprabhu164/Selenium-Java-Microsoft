package Custom_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UIElementsExtension {
public static void Basic_Details(WebDriver driver, By locator, String value) {
	driver.findElement(locator).sendKeys(value);
    driver.findElement(locator).sendKeys(value);
    driver.findElement(locator).sendKeys(value);
}

public static void ClickOperation(WebDriver driver, By locator) {
	driver.findElement(locator).click();
}
}
