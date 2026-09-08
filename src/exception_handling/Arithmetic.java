package exception_handling;

public class Arithmetic {
	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
		System.out.println(a/b);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
