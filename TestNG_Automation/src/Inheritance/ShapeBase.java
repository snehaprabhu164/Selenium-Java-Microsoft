package Inheritance;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ShapeBase {
	
	@BeforeMethod
	public void beforeTest() {
		System.out.println("Before Test Execution");
	}
	
	@AfterMethod
	public void afterTest() {
		System.out.println(" After Test Execution");
	}
	
	public void info() {
		System.out.println("Calculating Different Shape Areas:");
	}
}
