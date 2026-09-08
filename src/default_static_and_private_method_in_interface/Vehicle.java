package default_static_and_private_method_in_interface;

public interface Vehicle {
	
	default void start() {
		System.out.println("Vehicle started..");
	}

}
