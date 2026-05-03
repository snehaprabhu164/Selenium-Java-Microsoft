package Practice;

import java.util.Scanner;

public class array_variation {

	public void checkString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		String A = sc.nextLine();

		if (A.isEmpty()) {
			System.out.println("The string is empty");
		} else if (A.isBlank()) {
			System.out.println("The string is blank");
		} else {
			System.out.println("The string contains value: " + A);
		}

		System.out.println("Enter a string: ");
		String B = sc.nextLine();
		System.out.println(B.trim());

		sc.close();

	}

	public static void main(String[] args) {
		array_variation obj = new array_variation();
		obj.checkString();

		String re = "Java is amazing";
		System.out.println(re.replace('a', '@'));

	}
}
