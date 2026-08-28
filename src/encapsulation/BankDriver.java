package encapsulation;

public class BankDriver {
	
	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.setDetails(12, "sagar", 90000);
		
		String d=b.getDetails();
		System.out.println(d);
		
	}

}
