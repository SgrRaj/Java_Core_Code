package default_static_and_private_method_in_interface.private_method_in_interface;

public interface Vehicle {
	
	private  void start() {
		System.out.println("engine started to private method in interface..");
			}
	
	
	default void engine() {
	start();
	}

}
