package basicAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class CredentialAuto {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.ultimateqa.com/users/sign_in");
		List<String[]> credentials = new ArrayList<>();
		credentials.add(new String[] { "Sneha@gmail.com", "Sneha@123" }); // valid
		credentials.add(new String[] { "wrong@gmail.com", "wrong123" }); // invalid
		credentials.add(new String[] { "test@gmail.com", "wrongPass" }); // invalid
		credentials.add(new String[] { "Sneha@gmail.com", "Wrong@999" }); // invalid

	}
}
