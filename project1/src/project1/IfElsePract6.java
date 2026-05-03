package project1;

public class IfElsePract6 {
 int number = 15;
 static int limit = 1;
 
 public void PostNegaZero() {
	 if (number>limit) {
		 System.out.println("Number is positive");
	 }
	 else {
		 System.out.println("Number is negative");
	 }
 }
 
 public void OddEve() {
	 if (number%2==limit) {
		 System.out.println("Number is Even");
	 }
	 else {
		 System.out.println("Number is odd");
	 }
 }
 
 public static void main(String[]args) {
	 IfElsePract6 non1=new IfElsePract6();
	 non1.PostNegaZero();
	 non1.OddEve();
 }
 
}
