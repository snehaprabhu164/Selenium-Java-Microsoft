package Practice_2;

public class constrctor1 {
String name;
int age;
constrctor1(){
	name="Unknown";
	age=0;
}

void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}

public static void main(String[]args) {
	constrctor1 l1= new constrctor1();
	l1.display();
}
}
