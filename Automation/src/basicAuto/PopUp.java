package basicAuto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
    public static void main(String[] args) throws InterruptedException {
        
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Open the Alerts demo page
        driver.get("https://demo.automationtesting.in/Alerts.html");
        
        
        // ============================
        // 1. SIMPLE ALERT POPUP
        // ============================
        
        // Locate and click the "Click the button to display an alert box" button
        WebElement clickSimplePopUp = driver.findElement(By.xpath("//*[@class='btn btn-danger']"));
        clickSimplePopUp.click();
        
        // Switch to the alert and get its text
        String getTextOfSimplePopup = driver.switchTo().alert().getText();
        System.out.println("Simple Alert Text: " + getTextOfSimplePopup);
        
        // Wait 3 seconds so you can see the alert
        Thread.sleep(3000);
        
        // Accept the alert (click OK)
        driver.switchTo().alert().accept();
        
        System.out.println("Simple Alert handled successfully");
        System.out.println("================================");
        
        
        // ============================
        // 2. CONFIRMATION ALERT POPUP
        // ============================
        
        // Click the "Alert with OK & Cancel" tab
        WebElement clickonConfirmationPopUp = driver.findElement(By.xpath("(//*[@class='analystic'])[2]"));
        clickonConfirmationPopUp.click();
        
        // Click the "Click the button to display a confirm box" button
        WebElement confirmationPopupOpen = driver.findElement(By.xpath("//*[text()='click the button to display a confirm box ']"));
        confirmationPopupOpen.click();
        
        // Switch to alert and get its text
        String confirmationText = driver.switchTo().alert().getText();
        System.out.println("Confirmation Alert Text: " + confirmationText);
        
        // Dismiss the alert (click Cancel)
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        
        // Get the result text displayed on the page after Cancel
        WebElement afterAcceptPopUpText = driver.findElement(By.id("demo"));
        String printOutput = afterAcceptPopUpText.getText();
        System.out.println("Output on Page: " + printOutput);
        
        // Check if user clicked OK or Cancel
        if(printOutput.equals("You pressed Ok")) {
            System.out.println("User clicked on Accept Button in Confirmation Popup");
        } else {
            System.out.println("User clicked on Cancel Button in Confirmation Popup");
        }
        
        System.out.println("Confirmation Alert handled successfully");
        System.out.println("================================");
        
        
        // ============================
        // 3. PROMPT ALERT POPUP
        // ============================
        
        // Click the "Alert with Textbox" tab
        WebElement clickOnPromptAlaert = driver.findElement(By.xpath("(//*[@class='analystic'])[3]"));
        clickOnPromptAlaert.click();
        
        // Click the "Click the button to demonstrate the prompt box" button
        driver.findElement(By.xpath("//*[text()='click the button to demonstrate the prompt box ']")).click();
        
        // Switch to the prompt alert and type text inside it
        driver.switchTo().alert().sendKeys("I am Handling PromptAlert");
        Thread.sleep(2000);
        
        // Accept the prompt alert (click OK)
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        
        // Capture the text displayed on the page after entering prompt input
        WebElement promptResult = driver.findElement(By.id("demo1"));
        String promptOutput = promptResult.getText();
        System.out.println("Prompt Alert Output on Page: " + promptOutput);
        
        System.out.println("Prompt Alert handled successfully");
        System.out.println("================================");
        
        
        // Close the browser
        driver.close();
    }
}
