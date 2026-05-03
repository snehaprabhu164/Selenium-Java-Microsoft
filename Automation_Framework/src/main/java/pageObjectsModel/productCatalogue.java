package pageObjectsModel;

import java.util.List;
import java.util.stream.Stream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productCatalogue extends AbstractComponents {

	// List<WebElement> products =
	// driver.findElements(By.xpath("//*[@class='col-lg-4 col-md-6 col-sm-10
	// offset-md-0 offset-sm-1 mb-3 ng-star-inserted']"));
	WebDriver driver;

	public productCatalogue(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted']")
	List<WebElement> products;

	// Action Methods

	By ProductBy = By.xpath("//*[@class='col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted']");

	By addToCart = By.xpath("(//*[text()='Add To Cart'])[1]");
	By toastMessage = By.xpath("//*[@id='toast-container']");

	public List<WebElement> getProductList() {

		waitForElementToAppear(ProductBy);

		return products;

	}

	// Action Method

	public WebElement getProductByName(String productName) {

		WebElement prod = getProductList().stream().filter(
				product -> product.findElement(By.xpath("//*[text()='ZARA COAT 3']")).getText().equals(productName))
				.findFirst().orElse(null); // Stream method helps us to irriarte through each and every elements

		return prod;

	}

	public void addProductToCart(String productName) {

		WebElement prod = getProductByName(productName);

		prod.findElement(addToCart).click();
		;

		waitForElementToAppear(toastMessage);

	}

}
