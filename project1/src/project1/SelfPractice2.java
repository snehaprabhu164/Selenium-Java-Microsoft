package project1;

public class SelfPractice2 extends SelfPractice {
	 public void show(String msg) {
	        System.out.println("Child Message (String): " + msg);
	    }
	

	public static void main(String[] args) {
		SelfPractice2 sm = new SelfPractice2();

        // Calls overridden method in child
        sm.show("Hello Polymorphism!");

        // Calls inherited overloaded method (int) from parent
        sm.show(100);
    }
	
}
