package com.mystore.actiondriver;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mystore.base.BaseClass;

public class Action extends BaseClass {
	public static void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

	public static void click(WebDriver driver, WebElement locator) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			locator.click(); // simpler, more stable
		} catch (Exception e) {
			throw new Exception("Unable to click on element: " + e);
		}
	}

	public static boolean findElement(WebDriver ldriver, WebElement ele) throws Exception {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			if (flag) {
				System.out.println("Element is displayed: " + ele);
				return true;
			} else {
				System.out.println("Element is not displayed: " + ele);
				return false;
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element not found: " + e.getMessage());
			flag = false;
		} catch (Exception e) {
			System.out.println("Exception occurred while finding element: " + e.getMessage());
			flag = false;
		}
		return flag;
	}

	public static boolean isDisplayed(WebDriver ldriver, WebElement ele) throws Exception {
		boolean flag = false;
		flag = findElement(ldriver, ele);
		if (flag) {
			flag = ele.isDisplayed();
			if (flag) {
				System.out.println("The element is Displayed");
			} else {
				System.out.println("The element is not Displayed");
			}
		} else {
			System.out.println("Not displayed");
		}
		return flag;
	}

	// ✅ Check if element is selected
	public static boolean isSelected(WebDriver driver, WebElement element) {
		try {
			return element.isSelected();
		} catch (NoSuchElementException e) {
			System.out.println("Element not selected: " + e.getMessage());
			return false;
		}
	}

	// ✅ Check if element is enabled
	public static boolean isEnabled(WebDriver driver, WebElement element) {
		try {
			return element.isEnabled();
		} catch (NoSuchElementException e) {
			System.out.println("Element not enabled: " + e.getMessage());
			return false;
		}
	}

	public static void type(WebDriver driver, WebElement element, String text) {
		try {
			scrollByVisibilityOfElement(driver, element);
			element.clear();
			element.sendKeys(text);
			System.out.println("Typed value: " + text);
		} catch (Exception e) {
			System.out.println("Unable to type in element: " + e.getMessage());
		}
	}

	public static void selectByIndex(WebElement element, int index) {
		try {
			Select select = new Select(element);
			select.selectByIndex(index);
			System.out.println("Selected by index: " + index);
		} catch (Exception e) {
			System.out.println("Unable to select by index: " + e.getMessage());
		}
	}

	public static void selectByValue(WebElement element, String value) {
		try {
			Select select = new Select(element);
			select.selectByValue(value);
			System.out.println("Selected by value: " + value);
		} catch (Exception e) {
			System.out.println("Unable to select by value: " + e.getMessage());
		}
	}

	public static void selectByVisibleText(WebElement element, String visibleText) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(visibleText);
			System.out.println("Selected by visible text: " + visibleText);
		} catch (Exception e) {
			System.out.println("Unable to select by visible text: " + e.getMessage());
		}
	}

	// ✅ Switch to frame by index
	public static void switchToFrameByIndex(WebDriver driver, int index) {
		try {
			driver.switchTo().frame(index);
			System.out.println("Switched to frame index: " + index);
		} catch (Exception e) {
			System.out.println("Unable to switch to frame by index: " + e.getMessage());
		}
	}

	public static void switchToFrameById(WebDriver driver, String idOrName) {
		try {
			driver.switchTo().frame(idOrName);
			System.out.println("Switched to frame ID/Name: " + idOrName);
		} catch (Exception e) {
			System.out.println("Unable to switch to frame by ID/Name: " + e.getMessage());
		}
	}

	public static void mouseOverElement(WebDriver driver, WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
			System.out.println("Mouse hovered on element.");
		} catch (Exception e) {
			System.out.println("Unable to hover over element: " + e.getMessage());
		}
	}

	public static void implicitWait(WebDriver driver, long timeInSeconds) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
			System.out.println("Implicit wait set for " + timeInSeconds + " seconds");
		} catch (Exception e) {
			System.out.println("Unable to set implicit wait: " + e.getMessage());
		}
	}

	public static void pageLoadTimeOut(WebDriver driver, long timeInSeconds) {
		try {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeInSeconds));
			System.out.println("Page load timeout set for " + timeInSeconds + " seconds");
		} catch (Exception e) {
			System.out.println("Unable to set page load timeout: " + e.getMessage());
		}
	}

	public static void scrollIntoView(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void waitForElement(WebDriver driver, WebElement element, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
