package Practice;

import java.util.Scanner;

public class conclass3 extends absclass2 {
	int length, breadth; // instance variables to store input

	public conclass3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length: ");
		length = sc.nextInt();

		System.out.print("Enter breadth: ");
		breadth = sc.nextInt();

		sc.close();
	}

	@Override
	public void area() {// from interface
		int a = length * breadth;
		System.out.println("Area = " + a);

	}

	@Override
	void perimeter() {// from abstract class
		int p = 2 * (length + breadth);
		System.out.println("Perimeter = " + p);

	}
	public static void main(String[] args) {
	conclass3 obj1=new conclass3();
	obj1.displayType();
	obj1.perimeter();
	obj1.area();
	}
}
