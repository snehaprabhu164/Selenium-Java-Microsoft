package Inheritance;

public class CircleShape extends RectangleShape {

	double radius;

	public CircleShape(int side, int length, int breadth, double radius) {
		super(side, length, breadth); // Calls parent constructor (RectangleShape)
		this.radius = radius;
	}

	public double areaCircle() {
		return 3.14 * radius * radius;
	}
}