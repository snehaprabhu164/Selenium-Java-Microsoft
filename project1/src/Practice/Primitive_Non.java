package Practice;

public class Primitive_Non {
//1 primitive and non primitive datatypes try to use the datatype along with diff typ variable
	static int a = 10, b = 20;
	static char charr = 'A';
	String name = "sneha", globalVar = "prabhu";
	static double c = 12.9;
	static float d = 99.99f;
	boolean e = true, f = true;

	public static void statmethod() {
		int g = a + b;
		System.out.println(g);
		System.out.println(charr);
	}

	public void nonstat() {
		System.out.println("My name is " + name + " and my surname is " + globalVar);
		if (e == f) {
			System.out.println("wrong true is not equal to true");
		} else {
			System.out.println("null");
		}
	}

	public static void localvar() {
		int h = 12 + 12; 
		System.out.println(h);
		double i = c + d;
		System.out.println(i);
	}

	public static void main(String[] args) {
		statmethod();

		Primitive_Non p = new Primitive_Non();
		p.nonstat();

		localvar();

	}

}
