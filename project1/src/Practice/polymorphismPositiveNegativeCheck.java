package Practice;

public class polymorphismPositiveNegativeCheck extends polymorphism{
public void check(int n) {
	if(n>=0){
		System.out.println("num is +");
	}else {
		System.out.println("num is -");
	}
	
}
public static void main(String[]args) {
	polymorphismPositiveNegativeCheck obj=new polymorphismPositiveNegativeCheck();
	obj.check(10);
	polymorphsmEvenOddCheck obj2=new polymorphsmEvenOddCheck();
	obj2.check(3);
	polymorphism obj3=new polymorphism();
	obj3.check(12);
}
}
