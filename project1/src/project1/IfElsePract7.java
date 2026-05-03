package project1;

public class IfElsePract7 {
	int currentTemp = 42;
	String city = "Mumbai";
	static int normalTemp = 37;
	char tempUnit = 'C';
	
	public void TempCheck() {
		if (currentTemp>50) {
			System.out.println("Temprature is high");
		}
		else if(currentTemp<50) {
			System.out.println("Temprature is medium");
		}
		else{
			System.out.println("Temprature is low");
		}
	}
	
	public void TempOdd() {
		if (currentTemp%2==0) {
			System.out.println("Temprature is even");
		}
		else {
			System.out.println("Temprature is odd");
		}
	}
	
	public void Celcius() {
		if(tempUnit=='C') {
			 System.out.println("Celsius");
		}
		else {
			System.out.println("Fahrenheit");
		}
	}
	
	public static void Multiply() {
		int a= normalTemp*2;
		System.out.println(a);
		System.out.println("Temprature check done for Mumbai");
	}
	
	public static void main(String[]args) {
		IfElsePract7 non1=new IfElsePract7();
		non1.TempCheck();
		non1.TempOdd();
		non1.Celcius();
		Multiply();		
	}
}
