package project1;

public class LeftNRight {
	int c = 3;
	int e = 6;
	public void Mix() {
		System.out.println((c + 2) << 1); //5*2=10
		System.out.println((c * 4) >> 2);// 12/2^2=12/4=3
		System.out.println((e << 1) + (e >> 1));//6*2^1+6/2^1=15
		System.out.println((e >> 2) << 3);// (6/2^2)*2^3=8
	}
	public static void main(String[]args) {
		LeftNRight s1=new LeftNRight();
		s1.Mix();
	}
}
