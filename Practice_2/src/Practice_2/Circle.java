package Practice_2;
//overriding
public class Circle extends Shape {
	@Override
public void draw() {
	System.out.println("I am drawing a square");
}
public static void main(String[]args) {
	Circle c1= new Circle();
	c1.draw();
	Shape s1= new Shape();
	s1.draw();
}
}
