package oops;

public class PersonCasting {
	int age;
	String name;
	String div;
	
	PersonCasting(int age,String name,String div){
		this.age=age;
		this.name=name;
		this.div=div;
		System.out.println("My name is sneha");	
		}
	
public void showPersonInfo() {
	System.out.println("My name is "+name+"my age is "+age+"im studing in "+div);
}

}
