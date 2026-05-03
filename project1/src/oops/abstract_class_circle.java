package oops;
//Step 2: Concrete class Circle
class abstract_class_circle  extends shape{
public void area() {
	double area_of_circle=3.14*4*4;
	System.out.println(area_of_circle);
}
public static void main(String[] args) {
	shape a=new abstract_class_circle(); // abstract ref → concrete obj
	a.area();
	a.display();
}
}
