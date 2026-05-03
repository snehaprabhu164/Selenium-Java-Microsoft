package project1;
import java.util.Scanner;

public class SwitchCase2 {
	 public static void main(String[] args) {
//	 Scanner sc = new Scanner(System.in);
//
//     System.out.println("---- Restaurant Menu ----");
//     System.out.println("1 → Veg Combo (₹200)");
//     System.out.println("2 → Non-Veg Combo (₹300)");
//     System.out.println("3 → Drinks (₹50)");
//     System.out.println("4 → Exit");
//     System.out.println("-------------------------");
//
//     
//     System.out.print("Enter your choice (1-4): ");
//     int choice = sc.nextInt();
//
//     
//     System.out.print("Enter quantity: ");
//     int quantity = sc.nextInt();
//
//     int price = 0;
//     int bill = 0;
//
//     
//     switch (choice) {
//         case 1:
//             price = 200;
//             bill = price * quantity;
//             System.out.println("You ordered Veg Combo.");
//             break;
//         case 2:
//             price = 300;
//             bill = price * quantity;
//             System.out.println("You ordered Non-Veg Combo.");
//             break;
//         case 3:
//             price = 50;
//             bill = price * quantity;
//             System.out.println("You ordered Drinks.");
//             break;
//         case 4:
//             System.out.println("Thank you! Visit again.");
//             sc.close();
//             return; 
//         default:
//             System.out.println("Invalid choice!");
//             sc.close();
//             return;
//     }
//
//
//     System.out.println("Total Bill: ₹" + bill);
//
//     
//     if (bill > 250) {
//         System.out.println(" Congratulations! You get a FREE dessert!");
//     }
//
//     sc.close();
		 
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Choose From The Menu");
		 System.out.println("1 Margherita Pizza (₹150)");
		 System.out.println("2 Farmhouse Pizza (₹250)");
		 System.out.println("3 Cheese Garlic Bread (₹100)");
		 System.out.println("Done");
		 
		 System.out.println("Enter your choice");
		 int choice=sc.nextInt();
		 
		 System.out.println("how much quantity?");
		 int quantity=sc.nextInt();
		 
		 int price;
		 int bill = 0;
		 
		 switch(choice) {
		 case 1:
			 price=150;
			 bill=price*quantity;
			 System.out.println("Margherita Pizza");
			 break;
		 case 2:
			 price=250;
			 bill=price*quantity;
			 System.out.println("Margherita Pizza");
			 break;
		 case 3:
			 price=100;
			 bill=price*quantity;
			 System.out.println("Margherita Pizza");
			 break;
		 case 4:
             System.out.println("Thank you! Visit again.");
			 break;
		 default:
			 System.out.println("invalid choice");
				 
		 }
		 
		 
		  System.out.println("Total Bill: ₹" + bill);

		 if(bill>250) {
			 System.out.println("Congrats you got a free coke");
		 }
		 else {
			 System.out.println("if your bill goes above 250 you will get a free coke....Do not miss this offer!");
		 }
		 sc.close();
 }
}
