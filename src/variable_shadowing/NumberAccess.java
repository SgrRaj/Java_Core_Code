package variable_shadowing;

public class NumberAccess {
	static int a=10;
	
	public static void main(String[] args) {
		int a=20;
		System.out.println(a);
		System.out.println(NumberAccess.a);
	}

}
