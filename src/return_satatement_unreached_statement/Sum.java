package return_satatement_unreached_statement;

public class Sum {
	
	public static void main(String[] args) {
	 int res=add();
	 System.out.println(res);
	}
	
	public static int add() {
		int a=10;
		int b=20;
		return a+b;
		
		// System.out.println("ndcjdncj"); //unreached statement
	}

}
