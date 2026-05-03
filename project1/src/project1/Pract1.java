package project1;

public class Pract1 {
	//Create a class with a static method that adds two numbers and prints the result.
	//Call the static method from the main() method.
	public static void Method1() {
		int a=10+10;
		System.out.println(a);
	}
	//Create a class with a non-static method that multiplies two numbers and prints the result. 
	//Call the non-static method using an object in the main() method.
	public void NonMethod2() {
		int b=10*4;
		System.out.println(b);
	}
	//Inside a static method, create an object of the class and call a n
	public void NonMethod4(){
		System.out.println("My Name Is Siddhi");
	}
	
	public static void Method3(){
		Pract1 non1=new Pract1();
		non1.NonMethod4();
	}
	
//Non-Static method find cube of a number
	public void Method4() {
		int a=3;
		int cube=a*a*a;
		System.out.println(cube);
		
	}
	
public static void main(String[]args) {
	//Method1();
	//Method3();
	Pract1 non1=new Pract1();
	//non1.NonMethod2();
	non1.Method4();
}

}

//Declare a static variable x = 50 and a non-static variable y = 20.
//Print both inside different methods (static and non-static) and understand the output.
