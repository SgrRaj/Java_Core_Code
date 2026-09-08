package variable_shadowing;

public class UsingthisKey {
	int a=10;
	
	public  void test() {
		int a=20;
		System.out.println(a);
	
	System.out.println(this.a);
	}
	
	
	public static void main(String[] args) {
		UsingthisKey u=new UsingthisKey();
		u.test();
	}
	
	
}
