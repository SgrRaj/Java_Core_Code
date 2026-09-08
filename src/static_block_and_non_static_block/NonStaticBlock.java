package static_block_and_non_static_block;

public class NonStaticBlock {
	int a;
	{
		System.out.println("non static block called");
		 a=10;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		NonStaticBlock n=new NonStaticBlock();
		System.out.println("main method block called");
		System.out.println(n.a);
		
	}
	
	{
		System.out.println("non static block called");
		System.out.println(a);
	}
	

}
