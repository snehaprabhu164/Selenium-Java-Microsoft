package Practice_2;

public class Box {
int length;
Box(){
	length=5;
}
Box(int length){
	this.length=length;
}
public static void main(String[]args) {
	Box b1 = new Box();
	System.out.println(b1.length);
	 Box b2 = new Box(10);
     System.out.println("Length of b2: " + b2.length);
}
}
