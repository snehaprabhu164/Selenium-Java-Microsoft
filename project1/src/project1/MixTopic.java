package project1;

import java.util.Scanner;

public class MixTopic {

	static int price = 5; // just a sample static variable (not used here)

	// Static method to print star pattern
	public static void Stat() {

		
//		 Scanner sc = new Scanner(System.in); 
//		 System.out.print("Enter any num: "); 
//		 int a = sc.nextInt();
//		 
//		
//		 for(int i=1; i<=a; i++) {
//		 
//		 for(int j=1; j<=i; j++) {
//		  System.out.print("*"); 
//		  } 
//		  System.out.println(); 
//		  }
//		 
//		// even num
//
//		for (int i = 0; i <= 10; i = i + 2) {
//			System.out.println(i);
//			System.out.println("Even num");
//		}
//
////		// odd num
////
////		for (int i = 1; i <= 10; i = i + 2) {
////			System.out.println(i);
////			System.out.println("odd num");
////		}
//		// sum of num
//		int sum = 0;
//		for (int i = 1; i <= 5; i++) {
//			sum = sum + i;
//		}
//		System.out.println("Sum is " + sum);
//		//Multiplication Table Example (1-3)
//		for (int i = 1; i <= a; i++) {
//			for (int j = 1; j <= a; j++) {
//				System.out.print(i * j+" " );
//			}
//			System.out.println();
//		}
//		
//		//Print this pattern (numbers):
//1
//12
//123
//1234
//		for(int i=1;i<=4;i++) {
//			for (int j = 1; j <= i; j++) {
//                System.out.print(j);  
//            }
//			  System.out.println();
//		}
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=j;j--) {
				 System.out.print(i);
			}
			 System.out.println();
		}
		// sc.close();
	}

	public static void main(String[] args) {
		Stat(); // call static method
	}

}
