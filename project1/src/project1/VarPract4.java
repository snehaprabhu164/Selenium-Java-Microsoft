package project1;

public class VarPract4 {
	String studentName = "Sneha";
	int totalMarks =500;
	int maxMarks = 500;
	static int passMarks = 200;
	
	public void displayStudentDetails() {
		System.out.println(studentName+totalMarks+maxMarks+"These are global variables.");
	}
	public static void showPassMarks() {
		System.out.println(passMarks+"This is a static variable.");
	}
	public void evaluateGrade() {
		//if percentage >= 75;
		int Marks=(totalMarks*100)/maxMarks;

        if (Marks >= 75) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
	}
        public static void main (String[]args) {
        	VarPract4 non1=new VarPract4();
        	non1.evaluateGrade();        	
        }			
	}
//Try changing totalMarks to odd, even, negative,
//more than max, and observe different outputs.