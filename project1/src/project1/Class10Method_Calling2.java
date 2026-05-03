package project1;

public class Class10Method_Calling2 {
	 int age = 21;
	 static int votingAgeLimit = 18;

	  public void checkEligibility() {
	        if (age >= votingAgeLimit) {
	            System.out.println("Eligible to vote.");
	        } else {
	            System.out.println("Not eligible to vote.");
	        }
	    }
}
