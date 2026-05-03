package project1;

public class SwitchCase {
	public void Network() {
//	int day=5;
//		switch(day) {
//	    case 1: System.out.println("Monday"); break;
//	    case 2: System.out.println("Tuesday"); break;	
//	    case 3: System.out.println("Wednesday"); break;
//	    case 4: System.out.println("Thursday"); break;
//	    case 5: System.out.println("Friday"); break;
//	    case 6: System.out.println("Saturday"); break;
//	    case 7: System.out.println("Sunday"); break;
//	    default: System.out.println("Invalid Menu"); break;
//	}

 int provider=9850;

 switch(provider) {
 case 9876:
	 System.out.println("Provider: Airtel");
	 break;
 case 9822:
     System.out.println("Provider: Vodafone Idea");
     break;
 case 9867:
     System.out.println("Provider: BSNL");
     break;
 case 9850:
     System.out.println("Provider: Jio");
     break;
 default:
     System.out.println("Unknown Provider");
 }
	}
	public static void main(String[]args) {
		SwitchCase non1=new SwitchCase();
		non1.Network();
	}
}
