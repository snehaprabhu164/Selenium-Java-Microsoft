package basicAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoClassBasic {
    public static void main(String[] args) {
    	 // Launch Chrome
        WebDriver driver = new ChromeDriver();
        
        // Set path of chromedriver
//        System.setProperty("webdriver.chrome.driver", 
//                "C:\\Users\\Sneha\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open Facebook
        driver.get("https://www.facebook.com/");

        // Get Title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // Get Current Page URL
        String currentPageURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentPageURL);

        // Get Page Source
        String pageSource = driver.getPageSource();
        System.out.println("Page Source length: " + pageSource.length());

        // Wait for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        // Close the browser
        driver.close(); // closes current window
        // driver.quit(); // closes all windows opened by driver
    }
}
