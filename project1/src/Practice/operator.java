package Practice;

public class operator {

	// 5 try to use diff operator like ++ -- || && or if else loop
	public void calculate(int a) {
		System.out.println("incrment "+ a++ );
		System.out.println( ++a );
		System.out.println("decrement "+a--);
		System.out.println(--a);
	}

	public void calculate(int a, int b) {
		if (a < b) {
			System.out.println("yes a si smalll than b");
		} else {
			System.out.println("no a si smalll than b");
		}
	}

	public void calculate(boolean x, boolean y) {
		System.out.println("x && y = " + (x && y)); // AND
		System.out.println("x || y = " + (x || y)); // OR

		if (x && y) {
			System.out.println("Both are TRUE");
		} else if (x || y) {
			System.out.println("At least one is TRUE");
		} else {
			System.out.println("Both are FALSE");
		}
	}

	public void calculate() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[]args) {
		operator op=new operator();
		op.calculate(50);
		op.calculate();
		op.calculate(10, 20);
		op.calculate(true, false);
	}
}
