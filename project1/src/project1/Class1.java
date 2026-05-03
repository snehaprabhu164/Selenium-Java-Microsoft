package project1;

public class Class1 {
	 static int c=100+100;
		
		public static void Method1() {
			
			int a=10+10;
			System.out.println("======");
			
			System.out.println("This is my Static Method");
			
			System.out.println("======");
			
			System.out.println("a");
			
			System.out.println("======");
			
			System.out.println(a);
			
			Class1 non=new Class1();
			non.NonstaticMethod();
		}
		
	public static void StaticMethod2() {
			
			int a2=220+10;
			System.out.println("======");
			
			System.out.println("This is my 2ndStatic Method");
			
			System.out.println(a2);
			
	}
		
		public void NonstaticMethod(){
			
			int b=20*20;
			
			System.out.println("This is my NON-Static Method");
			
	System.out.println("****");
			
			System.out.println("b");
			
			System.out.println("****");
			
			System.out.println(b);
			
			System.out.println("****");
			
		}
		
		public static void main(String[]args) {
			//Non1 is Object Reference variable
			
			// StaticMethod2();
			
			//Class1 non=new Class1();
			//non.NonstaticMethod();
			
			System.out.println(c);
			
			//Method1();
			
			System.out.println("+++++++");
			
			//Non1 is Object Reference variable
			
			//Class1 non1=new Class1();
			//non1.NonstaticMethod();
			
		}
			
		
	}

