package project1;

public class VarPract2 {
	String studentName = "Sneha";
	static int totalMarks = 450;
	static int maxMarks = 500;
	
	public void displayGlobalInfo() {
		System.out.print(studentName+System.lineSeparator()+ "This is the global variable.");
	}
	
	public static void calculatePercentage() {
		int percentage = (totalMarks * 100) / maxMarks;
		System.out.println("Percentage:%"+percentage+"This is using static variables.");

	}
	
	public static void displayLocalVariable() {
		String message = "Local scope check";
		System.out.println(message+"This is a local variable.");
	}
	
	public static void main(String[]args) {
		VarPract2 non1=new VarPract2();
		non1.displayGlobalInfo();
		calculatePercentage();
		displayLocalVariable();
		
	}
}
