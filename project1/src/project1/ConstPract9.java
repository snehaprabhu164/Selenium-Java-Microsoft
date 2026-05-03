package project1;
//Sum 10 – Constructor Overloading + Boolean & Char Condition
public class ConstPract9 {
	
	static String collegeName ="BMN College";
	String studentName ;
	char grade;
	
	ConstPract9(){
		//studentName = "Default Student";
       // grade = 'C';
	}
	
//	ConstPract9(int a, int b){
	//	 studentName="Siddhi";
		// grade='B';
		 //System.out.println(studentName);
			//System.out.println(grade);
	//}
	
	ConstPract9(int c, char d){
		 studentName="Siddhi";
		 grade='B';
		 System.out.println(studentName);
			System.out.println(grade);
	}
	
	public void checkPass() {
		
		
		
		if(grade=='A') {
			System.out.println("You passed with 'A' grade");
		}
		else if (grade == 'B') {
		    System.out.println("You passed with 'B' grade");
		}
		else {
			System.out.println("You Failed");
		}
	}
	
	public static void main(String[]args) {
		//new ConstPract9(123,456);
		new ConstPract9(123,'s');
		new ConstPract9();
		//new ConstPract9(String , char grade);
		ConstPract9 obj1= new ConstPract9();
		 obj1.checkPass();
	}
}
