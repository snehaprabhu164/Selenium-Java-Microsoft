package Practice;

import java.util.Scanner;

public class for_loop {
	//7 try to use the scanner class along with for loop 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int n = sc.nextInt();

		// outer loop = controls rows
		for (int i = 1; i <= n; i++) {
			// inner loop = prints numbers in each row
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}