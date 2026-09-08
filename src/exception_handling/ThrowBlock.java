package exception_handling;

import java.util.Scanner;

public class ThrowBlock {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age ");
		int a=sc.nextInt();
	
		
			if(a>=18) {
				System.out.println("You Are Eligible to vote");
			}
			else throw new ArithmeticException("You Are Not Eligible To Vote..");
	

}
}
