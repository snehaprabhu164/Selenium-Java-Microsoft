package Practice;

//import java.util.Scanner;
public class inheritance3 extends inheritance2 {
	public void fact() {
		int fact = 1;
		for (int i = 1; i <= num; i++) { // loop
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " = " + fact);
	}

	public static void main(String[] args) {

		inheritance3 obj1 = new inheritance3();
		obj1.NumberInput();
		obj1.calculate();
		obj1.fact();
	}
}
