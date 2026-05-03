package project1;

public class Class3 {
	boolean name="Sneha" != null;
	//boolen and char
	
	 String name1="Sneha";
	static String name2="Prabhu";
	
	boolean return1=false;
	boolean return2=true;
	
	String return3="false";
	String return4="true";
	
	char initalname='S';
	String lastname="S"; 
	
	int number=210922;
	int numbrt2=210895;
	
	
	
	public void NonstaticboolenCharMethod() {
		
		
		if(lastname.equals(number)) {
			
			System.out.println("This initalname is printed");
		}
		
		else
		
		{
			 System.out.println("Below Lastname is printed");
		
	}
		
		
		if (return3.equals(return2)) {
			 System.out.println("This block is printed");
		}
			 else {
				 System.out.println("Below block is printed");
			
		}
		}
	
		
		//System.out.println(name1);
		
//		if (name1.equals(name2)) {
//		 System.out.println("True");
//		
//		
//		} else {
//		 System.out.println("False");
//		}
	
	public static void main(String[]args) {
		
		Class3 ns=new Class3();
		ns.NonstaticboolenCharMethod();
		
		
		if (ns.equals(name2)) {
		 System.out.println("True");
		
		
		//} else {
		 System.out.println("False");
		}
	}

}
