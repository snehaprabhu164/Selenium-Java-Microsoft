package Practice_2;

public class car {
String brand;

car(String brand){
	this.brand=brand;
}
public static void main(String[]args) {
	car c1 = new car("enova");
	 System.out.println("Brand: " + c1.brand);
}
}
