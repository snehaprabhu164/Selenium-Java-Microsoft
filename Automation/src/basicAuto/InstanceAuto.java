package basicAuto;

public class InstanceAuto {
//Instead of passing hard-coded values directly into sendKeys(), 
	// how can we create an object reference variable and
	// pass the value through that variable to the password field?

	String pass;
	String Email;

	// Constructor 
	public InstanceAuto(String email, String password) {
		this.Email = email;
		this.pass = password;
	}
}
