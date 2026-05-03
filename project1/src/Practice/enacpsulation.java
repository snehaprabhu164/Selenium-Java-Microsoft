package Practice;

public class enacpsulation {
//10  use scanner class in encapsulation code
	private String name="sneha";
	private int marks=56;
	public String getname() {
		return name;
	}
	public int getmarks() {
		return marks;
	}
	public void setname (String name) {
		this.name=name;
	}
	public void setmarks(int marks) {
		this.marks=marks;
	}
	public void checkresult() {
		if(marks>50) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}
	public static void main(String[] args) {
		enacpsulation obj=new enacpsulation();
		obj.setmarks(56);
		obj.setname("sneha");
		String a=obj.getname();
		int b=obj.getmarks();
		System.out.println(a);
		System.out.println(b);
		obj.checkresult();
	}
}
