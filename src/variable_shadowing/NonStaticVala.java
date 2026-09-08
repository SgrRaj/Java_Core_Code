package variable_shadowing;

public class NonStaticVala {
	int a=10;
	public static void main(String[] args) {
		int a=20;
		System.out.println(a);
	NonStaticVala v=new NonStaticVala();
	System.out.println(v.a);
	}

}
