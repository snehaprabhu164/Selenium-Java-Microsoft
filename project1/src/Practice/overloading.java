package Practice;

public class overloading {
	//4  what is the best eg of method overloading

public void add(String name,int marks) {
	System.out.println(name+ " got this much marks "+ marks+ " in maths sub");
}
public void add(double a, double b) {
	System.out.println("the stock market price was "+ a + " in the month of april and it has rise till "+ b+ " in the month of dec");
	}
public void add(int c, int d, int f) {
	System.out.println("got this much marks in 3 sub " +c+d+f );
}
public static void main(String[]args) {
	overloading ol=new overloading();
	ol.add("Sneha", 50);
	ol.add(12.4, 15.9);
	ol.add(45, 87, 78);
}
}
