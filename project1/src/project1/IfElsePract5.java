package project1;

public class IfElsePract5 {
    String votername = "siddhi";
    int age = 21;
    char gender = 'F';
    static int votingAgeLimit = 18;
    static String electionYear = "2024";
    
    public void showVoterInfo() {
        System.out.println(votername +System.lineSeparator()+ age+System.lineSeparator()+ gender +System.lineSeparator()+ "These are global variables.");
    }

    public static void showElectionDetails() {
        System.out.println(votingAgeLimit+System.lineSeparator()  + electionYear +System.lineSeparator()+ "These are static variables.");
    }

    public void checkEligibility() {
        if (age >= votingAgeLimit) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        IfElsePract5 non1 = new IfElsePract5();
        non1.checkEligibility();
        non1.showVoterInfo();
        showElectionDetails();
    }
}
