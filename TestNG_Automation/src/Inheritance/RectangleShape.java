package Inheritance;

public class RectangleShape extends SquareShape {

	int length, breadth;

	public RectangleShape(int side, int length, int breadth) {
		super(side); // calling parent (SquareShape) constructor
		this.length = length;
		this.breadth = breadth;
	}

	public int areaRectangle() {
		return length * breadth;
	}
}
