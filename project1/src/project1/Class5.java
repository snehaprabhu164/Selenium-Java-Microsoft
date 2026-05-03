package project1;

public class Class5 {

		
		//Variable Decelartion
		
		int a;
		int b;
		
		
		//StanadardProcessOfConstructor
		Class5(){
		//Initaize variable inside constructor body
		a=100;
		b=200;
		System.out.println("Initaize variable inside constructor body");
		}
		
		//Usage of information
		
		public void areaCircle() {
			
			double x=a*a*3.14d;
			
			System.out.println(x);
		}
		
		
		public void areaSquare() {
			double y=b*b ;
			
			System.out.println(y);
		}
		
		public static void main(String[]args) {
			//new StanadardProcessOfConstructor();
			//new class5();
			Class5 calling =new Class5();
			calling.areaCircle();
	       calling.areaSquare();
		
	}
	
}
