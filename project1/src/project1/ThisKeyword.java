package project1;

public class ThisKeyword {
	String name;
	int grade;
	int marks;
	ThisKeyword(String name,int grade){
		this.marks=130;
		
	}
	// Constructor 1
	ThisKeyword(String name,int grade, int marks){
		this.name=name;
		this.grade=grade;
		this.marks=marks;
	}
	// Constructor 2
		public static void main(String[]args) {
			ThisKeyword s1= new ThisKeyword("sneha",123);
			s1.setmarks(124);// change marks
			s1.display();
		}
	    // Method to set marks
		public void setmarks(int marks) {
		        this.marks = marks;
		    }
	//Method to display details
		private void display() {
			   System.out.println("Name: " + name);
		        System.out.println("Grade: " + grade);
		        System.out.println("Marks: " + marks);
			
		}
		
	}
	
	

