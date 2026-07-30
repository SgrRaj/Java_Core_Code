package object_caching;

public class Program1 {
	public static void main(String[] args) {
		// System.out.println(0/0);   //ArithmeticException
		System.out.println(0.0/0);    //NaN
		System.out.println(0/0.0);    //NaN
		System.out.println(0.0/0.0);   //NaN
		
		
		// System.out.println(2/null);  // Error
		String s="sagar";
		System.out.println(s.length());  //5
		
		String s1=null;
		System.out.println(s1.length());  //NullPointerxception
		
		
	}

}
