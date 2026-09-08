package exception_handling;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsBlockUsingCheckedException {
	
	public static void test() throws IOException{
		throw new IOException("File not found..");
	}
	public static void main(String[] args) {
		
		try {
		test();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
}

}
