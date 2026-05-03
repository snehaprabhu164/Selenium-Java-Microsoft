package project1;

public class PrePost {
	//int p = 3, q = 5;
 //int x = 10;
	//int num=7;
	int a = 1, b = 2, c = 3;
 public void Mix() {
	// int x= ++x + x++ + --x; 
	// int z= x + ++x + x++ + x-- + ++x + x;
	// int z=x++ + ++x + x-- + --x;
	//int z=  ++p + q++ - --p + p++ + --q;
	// int z= ++num + num++ + --num + num--;
	 int z=a++ + ++b + c-- + --a + b++ + ++c;
	 System.out.println("z = " + z); // 14
    
 }
 	public static void main(String[] args) {
 		PrePost s1=new PrePost();
 		s1.Mix();
 	}
}
