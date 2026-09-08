package exception_handling;

import java.util.Scanner;

public class ThrowsBlockUsingUncheckedException {
	
	public static void divide(int a,int b) throws ArithmeticException {
		System.out.println(a/b);
		
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1st no..");
		int x=sc.nextInt();
		System.out.println("Enter 2nd no..");
		int y=sc.nextInt();
		try {
		divide(x,y);
		}catch(Exception e) {
			System.out.println("Please give correct input..");
		}
		
}

}
