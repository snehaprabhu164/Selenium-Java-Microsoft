package project1;

import java.util.Scanner;

public class StudManagSys {
    static String college = "St. Xavier's";
    int rollno;
    String name;
    int marks;

    // Constructor
    StudManagSys(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    // Method to compare names, check operators, pass/fail, etc.
    public void checkStudent() {
        Scanner sc = new Scanner(System.in);

        // Compare names
        System.out.print("Enter a name to check: ");
        String inputName = sc.nextLine();

//        if (inputName == name) {
//            System.out.println("== matched (reference check)");
//        } else {
//            System.out.println("== not matched");
//        }

        if (inputName.equals(name)) {
            System.out.println(".equals() matched (content check)");
        } else {
            System.out.println(".equals() not matched");
        }

        // Operators
        System.out.println("Original Marks: " + marks);
        System.out.println("After marks++ : " + (marks++));
        System.out.println("After marks-- : " + (marks--));
        System.out.println("Marks *2 using << : " + (marks << 1));
        System.out.println("Marks /2 using >> : " + (marks >> 1));

        // Logical check
        if (marks >= 40 && marks <= 100) {
            System.out.println("Marks are in valid range.");
        } else {
            System.out.println("Invalid marks.");
        }

        // Bitwise example
        System.out.println("Bitwise AND of rollno & marks: " + (rollno & marks));

        // Pass/Fail
        if (marks >= 40) {
            System.out.println("Student Passed ✅");
        } else {
            System.out.println("Student Failed ❌");
        }

      
        // Switch Case Menu
        System.out.println("\n\n--- Menu ---");
        System.out.println("1 → Display Student Details");
        System.out.println("2 → Show Pass/Fail Status");
        System.out.println("3 → Show College Name");
        System.out.println("4 → Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Roll No: " + rollno + ", Name: " + name + ", Marks: " + marks);
                break;
            case 2:
                if (marks >= 40)
                    System.out.println("Pass");
                else
                    System.out.println("Fail");
                break;
            case 3:
                System.out.println("College: " + college);
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }

    public static void main(String[] args) {
        StudManagSys s1 = new StudManagSys(1, "Sneha", 50);
        s1.checkStudent();
    }
}
