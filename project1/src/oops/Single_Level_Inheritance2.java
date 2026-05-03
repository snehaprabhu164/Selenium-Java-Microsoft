package oops;

public class Single_Level_Inheritance2 extends Inheritance1 {
	  public void bark() {
	        System.out.println("Dog is barking...");
	    }

	    public void play() {
	    	super.eat("Brown", 2);//it goes and calls the parent class eat 
	    	//							and print the vales in it
	        System.out.println("Dog is playing with a ball...");
	    }
	    public static void main(String[] args) {
	    	Single_Level_Inheritance2 Dog=new Single_Level_Inheritance2();
	    	Dog.bark();
	    	Dog.play();
	    	//Dog.eat("Black", 3);
	    	eat("Black", 3);
	    	Dog.sleep();
	    }
}
