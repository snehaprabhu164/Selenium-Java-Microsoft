package project1;

//Simple constructor that prints a message
/*
 * public class SimpleConstructor { // Constructor SimpleConstructor() {
 * System.out.println("This is a constructor!"); }
 * 
 * public static void main(String[] args) { SimpleConstructor obj = new
 * SimpleConstructor(); } }
 */

// Constructor with parameter (store and print value)
/*
 * public class ParameterConstructor { int number;
 * 
 * ParameterConstructor(int n) { number = n; // store the value }
 * 
 * public void display() { System.out.println("Number is: " + number); }
 * 
 * public static void main(String[] args) { ParameterConstructor obj = new
 * ParameterConstructor(10); obj.display(); } }
 */

// Constructor with calculation
/*
 * public class SumConstructor { int sum;
 * 
 * SumConstructor(int a, int b) { sum = a + b; }
 * 
 * public void showSum() { System.out.println("Sum is: " + sum); }
 * 
 * public static void main(String[] args) { SumConstructor obj = new
 * SumConstructor(5, 7); obj.showSum(); } }
 */

//Multiple constructors (Constructor Overloading)
/*
 * public class MultiConstructor { String name; int age;
 * 
 * MultiConstructor(String n) { name = n; }
 * 
 * MultiConstructor(String n, int a) { name = n; age = a; }
 * 
 * public void display() { System.out.println("Name: " + name + ", Age: " +
 * age); }
 * 
 * public static void main(String[] args) { MultiConstructor obj1 = new
 * MultiConstructor("Sneha"); MultiConstructor obj2 = new
 * MultiConstructor("Sneha", 22);
 * 
 * obj1.display(); obj2.display(); } }
 */

//Constructor + static method
/*
 * public class CircleArea { double radius;
 * 
 * CircleArea(double r) { radius = r; }
 * 
 * public static double piValue() { return 3.14159; }
 * 
 * public double areaCircle() { return piValue() * radius * radius; }
 * 
 * public static void main(String[] args) { CircleArea obj = new
 * CircleArea(4.5); System.out.println("Area of Circle: " + obj.areaCircle()); }
 * }
 */