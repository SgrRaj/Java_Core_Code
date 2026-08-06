package scanner_take_input_from_user;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st no. ");
	int x=sc.nextInt();
	System.out.println("enter 2nd no. ");
	int y=sc.nextInt();
	int res=add(x,y);
	System.out.println("result is  "+res);
		
	}
	
	public static int add(int a,int b) {
		return a+b;
	}

}
