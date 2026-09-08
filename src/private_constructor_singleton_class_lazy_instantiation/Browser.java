package private_constructor_singleton_class_lazy_instantiation;

public class Browser {
	private static Browser b=null;    //imp
	private Browser() {
		
	}
	
	public static Browser getInstance() {
		
		if(b==null) {
			b= new Browser();
		}
		return b;
		
	}
	
	public void Search() {
		System.out.println("Search using lazy instantiation..");
	}

}
