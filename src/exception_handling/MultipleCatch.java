package exception_handling;

public class MultipleCatch {
	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.getMessage();
		}
		
		
//		}catch(NullPointerException e) {
//			e.getMessage();
//		}
		
		
		
	}

}
