package NG_Auto;

import org.testng.annotations.Test;

public class DemoNG {
	@Test
	public void OpenApp() {
		
		System.out.println("Open the App");
	}

	@Test

	public void LoginApp() {
		System.out.println("LogIn the App");
	}

	@Test
	public void LogOut() {
		System.out.println("Logout the App");
	}

	@Test
	public void WebLoginHome() {
		System.out.println("Mobile Login1");
	}

	@Test
	public void WebLoginHome1() {
		System.out.println("Mobile Login2");
	}

	@Test
	public void WebLoginHome2() {
		System.out.println("Mobile Login3");
	}

	@Test
	public void MobileLogin() {
		System.out.println("Mobile Login4");
	}
}
