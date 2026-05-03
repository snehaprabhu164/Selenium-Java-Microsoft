package project1;

public class IfElsePract8 {
	String subjectName = "Mathematics";
	int marksObtained = 78;
	static int totalMarks = 100;
	
	public void marksObtained () {
		if(marksObtained>=90) {
			System.out.println("Excellent");
		}
		else if(marksObtained>=75 || marksObtained<=89) {
			System.out.println("Very Good");
		}
		else if(marksObtained>=50 && marksObtained<=74) {
			System.out.println("Needs Improvement");
		}
	}
	
	public static void main(String[]args) {
		IfElsePract8 non1=new IfElsePract8();
		non1.marksObtained();
	}
}
