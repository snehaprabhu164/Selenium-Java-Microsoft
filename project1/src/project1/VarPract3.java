package project1;

public class VarPract3 {
	String employeeName = "Ravi";
	int baseSalary = 30000;
	static int bonus = 5000;
	
	public void showEmployeeInfo() {
		System.out.println(employeeName+baseSalary+"These are global variables.");
	}		
	public static void showBonusInfo() {
		System.out.println(bonus+"This is a static variable.");
	}
	public void calculateTotalSalary() {
		int totalsalary = baseSalary + bonus;
		System.out.println("Total Salary:"+totalsalary);
	}
	public void showLocalMessage() {
		String note = "Salary calculated successfully.";
		System.out.println(note);
	}
	
	public static void main(String[]args) {
		VarPract3 non1=new VarPract3();
		non1.showEmployeeInfo();
		non1.calculateTotalSalary();
		non1.showLocalMessage();
		showBonusInfo();
	}
	
}
