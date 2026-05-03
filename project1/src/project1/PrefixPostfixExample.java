package project1;

public class PrefixPostfixExample {
    public static void main(String[] args) {
        int x = 5;
 int a=100;
 System.out.println(a++ + a++);  
        System.out.println("Initial x = " + x);

        // Prefix Increment
        System.out.println("++x = " + (++x)); // Change first → x = 6 → print 6

        // Postfix Increment
        System.out.println("x++ = " + (x++)); // Print first (6) → then x = 7

        // Prefix Decrement
        System.out.println("--x = " + (--x)); // Change first → x = 6 → print 6

        // Postfix Decrement
        System.out.println("x-- = " + (x--)); // Print first (6) → then x = 5

        System.out.println("Final x = " + x); // 5
    }
}

