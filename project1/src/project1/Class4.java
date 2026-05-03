package project1;

public class Class4 {
		
	// System.out.println("example");

	Class4(){
		System.out.println("Saibaba temple is in Shirdi");
	}

	private Class4(char a) {
		char d='e';
		int bb=500;
		int b=1000;
		int bbb=bb*b;
		
		System.out.println(bbb);
		
		System.out.println("Ganpati temple is in Ganpatipule");
	}

	private static void Method1() {
		System.out.println("PRIVATE METHOD");
	}
	
	Class4(int a) {
		System.out.println("Hoil na");
	}
	
	public Class4(int a,char b) {
		System.out.println("Hoil na hoilch na");
	}
	
	Class4(char b,int a) {
		System.out.println("Hoil na hoilch na combination");
	}
	
	Class4(char b,int a,int c) {
		System.out.println("Hoil na hoilch na combination combo");
	}
	
	public static void main (String[]args){
		char ccc = 'c';
		
		System.out.println(ccc);
		
		new Class4();
		
		new Class4('c');
		
		new Class4(1234);
		
		new Class4(1223,'s');
		
		new Class4('s',1223);
		
		new Class4('s',1223,2345);
		
		Method1();
		
		// Java supports Constructor overloading >> We create multiple constructors with same name but different arguments
	}
}
