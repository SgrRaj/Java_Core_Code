package private_constructor_singleton_class_lazy_instantiation;

public class BrowserDriver {
	
	public static void main(String[] args) {
	Browser b1=Browser.getInstance();
	b1.Search();
		
	}
}
