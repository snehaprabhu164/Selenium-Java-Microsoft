package Practice_2;

public class Employee {
int id;
int salary;
Employee(int id, int salary){
	this.id=id;
	this.salary=salary;
	
}

public void display() {
	System.out.println("this is the id"+ id);
	System.out.println("this is the salary "+ salary);
}
public static void main(String[]args) {
	Employee e1= new Employee(10,5000);
	e1.display();
}
}
