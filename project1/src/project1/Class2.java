package project1;

public class Class2 {		
		 String globalname="Sneha";
		 int x=100;
		 int y=200;	
		
		 static int aa =1001;
		 static int bb =1001;		
		 static String stat ="Ganesha";
		public static void LocalVariableMethod() {
			
			 int localVar=10+10;
			 int a=20*20;
			 int b=60/30;
			 String name="Sneha Prabhu";
			
			 System.out.println(localVar);
			 System.out.println(a);
			 System.out.println(b);
			 System.out.println(name);
			
			 System.out.println("======LOCAL VARIABLE METHOD=========");
			
			}
		
		public void NonStaticLocalVariableMethod() {
			
			System.out.println(stat);
			System.out.println(aa);
			System.out.println(bb);
			
			int cc=aa+bb;
			
			System.out.println(cc);
			
			System.out.println("======Static VARIABLE called inside NONSTATIC METHOD=========");			
			
		}
			
		public void GlobalVariableMethod() {
			
			//System.out.println(localVar);
			
					System.out.println(globalname);
					System.out.println(x);
					System.out.println(y);
					
					System.out.println("======Global VARIABLE METHOD=========");
			}
			
		public static void StaticVariableMethod() {
			
			System.out.println(stat);
			System.out.println(aa);
			System.out.println(bb);
			
			int cc=aa*bb;
			
			System.out.println(cc);
			
			System.out.println("======Static VARIABLE called inside STATIC METHOD=========");			
			
		}
			
		public static void main (String[]args) {
			
			LocalVariableMethod();
			
			Class2 nonstaticvariable=new Class2();
			nonstaticvariable.NonStaticLocalVariableMethod();
			
			nonstaticvariable.GlobalVariableMethod();
			
			
			StaticVariableMethod();
					
		}
	}





