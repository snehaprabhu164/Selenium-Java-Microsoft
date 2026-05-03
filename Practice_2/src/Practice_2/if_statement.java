package Practice_2;

import java.util.Scanner;

public class if_statement {

	
		  public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int a = sc.nextInt();
		        System.out.print("Enter b number: ");
		        int b = sc.nextInt();
		        System.out.print("Enter cx number: ");
		        int c = sc.nextInt();
//
//		        if (a >= 0) {
//		            System.out.println("The number is positive");
//		        }
		        
		        if(a>b) {
		        	System.out.println("then a is grater");
		        }
		        if(b>c) {
		        	System.out.println("then b is grater");
		        }
		        if(c>a) {
		        	System.out.println("then c is grater");
		        }
		        else {
		        	System.out.println("invalid");
		        }
		        sc.close();
		    }
}
