package project1;
//Sum 12 – Positive/Negative & Odd/Even Check via Constructors
public class ConstPract10 {
	int num;
	
	ConstPract10(int q){
		num= q;
	} 	 	
	public void checkNumber() {
		if(num>=0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("The number is negative");
		}
	}
	public static void main(String[]args){
		    ConstPract10 obj1 = new ConstPract10(7);
	        ConstPract10 obj2 = new ConstPract10(-4);
	        ConstPract10 obj3 = new ConstPract10(0);

	        obj1.checkNumber();
	        obj2.checkNumber();
	        obj3.checkNumber();
	}
}

//Question:
//Create a class NumberChecker:
//Instance variable num (int).
//Constructor that accepts a number and stores it.
//Method checkNumber():
//Prints if the number is positive or negative.
//Prints if the number is odd or even.
//In main, create three objects with numbers 7, -4, and 0 and display results.

