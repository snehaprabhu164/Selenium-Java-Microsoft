package project1;

public class OddEveYear {
	public static void main(String[] args) {
		int yearA;

		for (yearA = 1900; yearA <= 2000; yearA++) {
			if(yearA%2==0) {
				System.out.println("Even num is: "+ yearA);	
		}
		
		else {
			System.out.println("odd num is: "+ yearA);			

		}
		}
	}
}
