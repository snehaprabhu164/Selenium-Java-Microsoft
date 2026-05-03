package Practice;

public class diffclass {
	public static void method4() {
		for(int i=1;i<=10;i++)
			System.out.println(i);
	}
	public static void main(String[]args) {
		method4();
		 sameclass obj = new sameclass();
		 obj.method1(10,40);
		 obj.method2("sneha");
		 obj.method3(10.2, 11.2);
	}
}
