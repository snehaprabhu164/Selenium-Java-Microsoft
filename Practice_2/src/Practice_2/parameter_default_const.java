package Practice_2;

public class parameter_default_const {
	
	    String name;
	    int code;

	    // Default constructor
	    parameter_default_const() {
	        this("ABC College", 101);   // calling parameterized constructor
	        System.out.println("Default constructor called");
	    }

	    // Parameterized constructor
	    parameter_default_const(String name, int code) {
	        this.name = name;
	        this.code = code;
	        System.out.println("Parameterized constructor called");
	    }

	    public static void main(String[] args) {
	    	parameter_default_const c1 = new parameter_default_const();   // only default constructor called explicitly
	        System.out.println("College Name: " + c1.name);
	        System.out.println("College Code: " + c1.code);
	    }
	}

