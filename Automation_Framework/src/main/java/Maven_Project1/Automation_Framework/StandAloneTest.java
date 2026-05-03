package Maven_Project1.Automation_Framework;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StandAloneTest {
	public static void main(String[] args) {
		
		// Product name to be added to cart
		String productName = "ZARA COAT 3";
		
		// Set up ChromeDriver using WebDriverManager (no manual driver setup needed)
		WebDriverManager.chromedriver().setup();
		
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser window
		driver.manage().window().maximize();
		
		// Set implicit wait for all elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open the target website
		driver.get("https://rahulshettyacademy.com/client/");
		
		// Enter email ID
		driver.findElement(By.id("userEmail")).sendKeys("shiivamc122@gmail.com");
		
		// Enter password
		driver.findElement(By.id("userPassword")).sendKeys("Shivam@2107");
		
		// Click login button
		driver.findElement(By.id("login")).click();
		
		// Create explicit wait object
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Wait until all product elements are visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@class='col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted']")));
		
		// Grab all products displayed on the page
		List<WebElement> products = driver.findElements(
				By.xpath("//*[@class='col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted']"));
		
		// Use Java Stream to filter the desired product by its name
		WebElement prod = products.stream()
				.filter(product -> product.findElement(By.xpath("//*[text()='ZARA COAT 3']"))
				.getText().equals(productName))
				.findFirst().orElse(null);
		
		System.out.println(prod); // Print product element for debugging
		
		// Click on "Add to Cart" button for the selected product
		prod.findElement(By.xpath("(//*[text()=' Add To Cart'])[1]")).click();
		
		// Wait for the toast message (Product added confirmation) to appear
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='toast-container']")));
		
		// Wait until the animation (ng-animating) disappears
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='ng-animating']")));
		System.out.println("====");
		
		// Click on Cart icon to open the cart page
		driver.findElement(By.xpath("(//*[@class='btn btn-custom'])[3]")).click();

		// Get list of products added in cart
		List<WebElement> listOfCartProducts = driver.findElements(By.xpath("//*[@class='cartSection']/h3"));
		
		// Check if the correct product (ZARA COAT 3) is present in the cart
		boolean match = listOfCartProducts.stream()
				.anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
		
		// Assert that the product is found in the cart
		if (!match) {
		    throw new RuntimeException("❌ Product not found in cart!");
		} else {
		    System.out.println("✅ Product successfully found in cart!");
		}

		
		// Click on "Checkout" button
		driver.findElement(By.xpath("//*[@class='totalRow']/button")).click();
		
		// Scroll down to bring country selection into view
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,1850)");
		
		// Use Actions class to type "india" into country selection field
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.xpath("//*[@placeholder='Select Country']")), "india").build().perform();
		//Error
		// Wait for country suggestions to appear
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//*[@class='ta-results list-group ng-star-inserted']")));
		
		// Click the search icon to confirm country selection
		driver.findElement(By.xpath("(//*[@class='fa fa-search'])[2]")).click();
		
		// Wait until "Place Order" button becomes visible
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='Place Order ']")));
		
		// Click "Place Order" button
		driver.findElement(By.xpath("//*[text()='Place Order ']")).click();
		
		// Fetch confirmation message text after placing order
		String confirmMessage = driver.findElement(By.xpath("//*[contains(text(),'Thankyou for the order.')]")).getText();
		
		// Assert confirmation message is correct
		if (!confirmMessage.equalsIgnoreCase("Thankyou for the order.")) {
		    throw new RuntimeException("❌ Order confirmation message mismatch!");
		} else {
		    System.out.println("✅ Order placed successfully!");
		}
		
		// Alternative assertion method:
		// Assert.assertEquals(confirmMessage, "Thankyou for the order.");
		
		// Close browser
		// driver.close();
	}
}





