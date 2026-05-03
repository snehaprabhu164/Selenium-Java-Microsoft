package project1;

public class Class8 {
int p=20;
int q=10;
static int m=100;
static int n=200;
public void sum(int a) {
	int Sum= a+q;
	System.out.println(Sum);
}

public void difference(int a, int b) {
	int sub= a-b;
	System.out.println(sub);
}

public static void staticCalc() {
	int o=(m*n)/5;
	System.out.println(o);
}

public static void stringMethod(String name) {
	System.out.println("Hello"+name);
}

public static void twoArgsMethod(int x, int y) {
	int t=m-n;
	System.out.println(t);
}

/*
 * public void ifelse(String name) { if(name=="siddhi") {
 * 
 * } }
 */
public static void main(String[]args) {
	Class8 non1=new Class8();
	non1.sum(50);
	non1.difference(100,50);
	staticCalc();
	stringMethod("Sneha");
	twoArgsMethod(1000, 100);
	
}
}
