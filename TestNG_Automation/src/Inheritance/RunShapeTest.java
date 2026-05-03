package Inheritance;

import org.testng.annotations.Test;

public class RunShapeTest extends ShapeBase {

	@Test
	public void runShapeMethods() {

		info();

		CircleShape obj = new CircleShape(4, 5, 6, 3.5);

		System.out.println("Square Area: " + obj.areaSquare());
		System.out.println("Rectangle Area: " + obj.areaRectangle());
		System.out.println("Circle Area: " + obj.areaCircle());
	}
}