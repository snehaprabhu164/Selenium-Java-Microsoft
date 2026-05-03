package oops;

public class StudentCaasting extends PersonCasting {
//	 StudentCaasting(int age, String name, String div) {
//		super(age, name, div);
//		// TODO Auto-generated constructor stub
//	}
	 String course;
	    int marks;
	 StudentCaasting(int age, String name, String div,String course,int marks) {
		super(age, name, div);
		this.course=course;
		this.marks=marks;
		 System.out.println("I have taken course "+course+"got marks "+marks);
	}
	 
	 public void studentinfo() {
		 System.out.println("I have taken course"+course+"got marks"+marks);
}
	 public static void main(String[] args) {
//		 PersonCasting a=new StudentCaasting(21,"Sneha","A Div","SyMsc",50);
//		 a.showPersonInfo();
		 //new PersonCasting(21,"Sneha","B Div");
		PersonCasting b= new StudentCaasting(21 ,"Sneha ","A div ","qwer ",78 );
		 StudentCaasting a=(StudentCaasting) b;//downcasting
		 b.showPersonInfo();
		 a.studentinfo();
		 
	 }

}
