package exception_handling.custom_exception;

import java.util.Scanner;

public class UnderAgeExceptionDriver {
	
	public static void Eligible(int age) throws UnderAgeException{
	
		if(age>=18) {
			System.out.println("you are eligible..");
		}
		else throw new UnderAgeException();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age.. ");
		int a=sc.nextInt();
		
		try {
			Eligible(a);
		} catch (UnderAgeException e) {
			e.printStackTrace();
		}
		
	}

}
