package project1;

public class StarPattern {
public static void main(String[]args) {
	
	int i,j,k;
	for(i=1900; i<=1910; i++)//1(2) 2(3)
	{
	for(j=1909; j>=i; j--)// 4(3) 3(2) 2(1)
	{
	System.out.print(" ");
	}
	for(k=1900; k<=(2*i-1); k++)//1(2) 2(3) 3(4)
	{
	System.out.print("$");
	}
	System.out.println("");
	}
	//k<=(2*i-1) 1<=(3) 2<=(3) 3<=(3)
	
}
}
