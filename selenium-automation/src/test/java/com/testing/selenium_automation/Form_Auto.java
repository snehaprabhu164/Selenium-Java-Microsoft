package com.testing.selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Custom_UI.UIElementsExtension;

public class Form_Auto {

    public static void main(String[] args) {

        // -------------------- Browser Setup --------------------
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://demoqa.com/automation-practice-form");

        // -------------------- Basic Details --------------------
        //Customization
        UIElementsExtension.Basic_Details(driver, By.id("firstName"), "quwerty");
        driver.findElement(By.id("lastName")).sendKeys("qazxsw");
        driver.findElement(By.id("userEmail")).sendKeys("qazxsw@gmail.com");

        // -------------------- Gender (Radio Button) --------------------
        //custom click
        UIElementsExtension.ClickOperation(driver,By.xpath("//label[@for='gender-radio-1']"));

        // -------------------- Mobile Number (Invalid First) --------------------
        WebElement mobile = driver.findElement(By.id("userNumber"));
        mobile.sendKeys("741852963"); // invalid (9 digits)

        // -------------------- Subjects (React Auto Complete) --------------------
        WebElement subject = driver.findElement(By.id("subjectsInput"));
        subject.sendKeys("Science");
        subject.sendKeys(Keys.ENTER);

        // -------------------- Hobbies (Checkbox - JS Click) --------------------
        WebElement hobby = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", hobby);

        // -------------------- File Upload --------------------
        driver.findElement(By.id("uploadPicture"))
                .sendKeys("C:\\Users\\Sneha\\OneDrive\\Pictures\\premium_photo-1669863266275-519daef503ce.jpeg");

        // -------------------- Address --------------------
        driver.findElement(By.id("currentAddress")).sendKeys("Gujarat");

        // -------------------- State & City (React Dropdowns) --------------------
        driver.findElement(By.id("react-select-3-input")).sendKeys("NCR", Keys.ENTER);
        driver.findElement(By.id("react-select-4-input")).sendKeys("Delhi", Keys.ENTER);

        // -------------------- Submit Button --------------------
        WebElement submitButton = driver.findElement(By.id("submit"));

        // Scroll + Click using JavaScript (to avoid ad/overlay issue)
        js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
        js.executeScript("arguments[0].click();", submitButton);

        // -------------------- Validation Check --------------------
        String errorMsg = mobile.getAttribute("validationMessage");

        if (!errorMsg.isEmpty()) {

            System.out.println("Validation Error Displayed: " + errorMsg);

            // Correct the mobile number
            mobile.clear();
            mobile.sendKeys("7418529630"); // valid number

            // Submit again
            js.executeScript("arguments[0].click();", submitButton);
            System.out.println("Form submitted successfully with correct data");
        }

        // -------------------- Close Browser --------------------
        driver.quit();
    }
}
