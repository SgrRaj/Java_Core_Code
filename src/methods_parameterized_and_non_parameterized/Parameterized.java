package methods_parameterized_and_non_parameterized;

import java.util.Scanner;

public class Parameterized {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x value");
		int x=sc.nextInt();
		System.out.println("enter y value");
		int y=sc.nextInt();
		int res=sum(x, y);
		System.out.println(res);
		
		
	}
	public static int sum(int a,int b) {
		return a+b;
	}

}
