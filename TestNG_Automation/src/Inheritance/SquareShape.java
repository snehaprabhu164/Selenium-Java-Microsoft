package Inheritance;

public class SquareShape extends ShapeBase {

	int side;

	public SquareShape(int side) {
		this.side = side;  // 'this' refers to the current class variable
	}

	public int areaSquare() {
		return side * side;
	}
}
