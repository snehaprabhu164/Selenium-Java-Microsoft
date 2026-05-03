package project1;

public class Conditional {
	int age = 20;  
	int marks = 82;   
	int score = 35;
	String day="Wednesday";
	public void program() {
		if(age>=18) {
			System.out.println("Eligible for Adult Category");
		}
		//
		System.out.println("=====IFELSE=====");
		if (marks >= 40) {
			System.out.println("Qualified for next round");
		}
		else {
			System.out.println("Disqualified");
		}
		//
		System.out.println("=====If-Else If====");
		if(marks>=90) {
			System.out.println("Outstanding Player");
		}
		else if(marks >= 75){
			System.out.println("Very Good Player");
		}
		else if(marks >= 50) {
			System.out.println("Good Player");
		}
		else {
			System.out.println("Needs Improvement");
		}
		//
		System.out.println("======If-Else If logical operator=====");
		if(score<=20) {
			System.out.println("Low Energy");
		}
		else if(score<=50 && marks>=75) {
			System.out.println("Balanced Performance");
		}
		else if (score>50 || marks>90) {
			System.out.println("High Energy Player");
		}
		else {
			System.out.println("Average Energy");
		}
		//
		System.out.println("====Nested if=====");
		 if (age < 18) {
	            if (day.equalsIgnoreCase("Wednesday")) {
	                System.out.println("Ticket price is ₹100");
	            } else {
	                System.out.println("Ticket price is ₹150");
	            }
	        } else {
	            if (day.equalsIgnoreCase("Friday")) {
	                System.out.println("Ticket price is ₹120");
	            } else {
	                System.out.println("Ticket price is ₹200");
	            }
	        }
	    }
	public static void main(String[]args){
		Conditional non1=new Conditional();
		non1.program();
	}
}
