package static_block_and_non_static_block;

public class StaticBlock {
	static int a;
	static {
		//int a=10;
		a=20;
		System.out.println("static block executed   "+a);
	}
	
	public static void main(String[] args) {
		StaticBlock s=new StaticBlock();
		System.out.println("static block executed   "+a);
	
		
	}
	static {
		System.out.println(a);
	}

}
