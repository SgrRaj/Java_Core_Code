package private_constructor_singleton_class_eager_instantiation;

public class Browser {
	
	private Browser() {
		
	}
	
	public static Browser getInstance() {
		return new Browser();
		
	}
	
	public void Search() {
		System.out.println("Search.....");
	}

}
