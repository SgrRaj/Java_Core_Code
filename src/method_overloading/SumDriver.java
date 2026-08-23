package method_overloading;

public class SumDriver {
	public static void main(String[] args) {
		Sum s=new Sum();
		
		int r= s.add(10,20);
		System.out.println(r);
		
		System.out.println(s.add(10,20,30));
		
		
		
	}

}
