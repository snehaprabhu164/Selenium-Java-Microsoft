package project1;

public class LogicalOperator {
	 public static void main(String[] args) {
        int x = 5, y = 0, z = 10;
	        boolean result = (x > 2) && (y++ > 0) | (z-- < 5) ;
	        		//|| (++x > 5);

	        System.out.println("result = " + result);
	        System.out.println("x = " + x);
	        System.out.println("y = " + y);
	        System.out.println("z = " + z);
//		 int x = 8, y = 3, z = 10;
//		 System.out.println(x > y && x < z);  //true...true= true checks both the operation bcz none is false
//		 System.out.println(x > y & x < z); //true...true=true checks both operation even if the first is false
//		 int x = 7, y = 12, z = 20;
//		 System.out.println(x > y || y < z);  
//		 System.out.println(x > y |  y < z); 
		 
		 int a = 5, b = 15, c = 10;
		 if(a > b || b > c) {
			 System.out.println("Condition true with ||");
		 } else {
				 System.out.println("Condition false with ||");
			 }
		 if (a > b | b > c) {
	            System.out.println("Condition true with |");
	        } else {
	            System.out.println("Condition false with |");
	        }

	    }
}
