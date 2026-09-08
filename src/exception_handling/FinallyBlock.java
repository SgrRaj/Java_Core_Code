package exception_handling;

import java.util.Scanner;

public class FinallyBlock {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no.");
		int a=sc.nextInt();
		System.out.println("Enter 2nd no.");
		int b=sc.nextInt();
		
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("Terminated......");
		}
		
	}

}
