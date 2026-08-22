package private_constructor;

public class Browser {
	
	private Browser() {
		
	}
	
	public static Browser getInstance() {
		return new Browser();
	}
	
	public void search() {
		System.out.println("Search..");
	}
	

}
