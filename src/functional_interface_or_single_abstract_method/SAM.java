package functional_interface_or_single_abstract_method;

public abstract class SAM {
	//SAM stands for single abstract method and also called functional interface
	//it contain only one abtract method.
	
	
	public abstract void runn();
	
	public void stop() {
		System.out.println("Vehicle stop");
	}
	
	public void start() {
		System.out.println("Vehicle start");
	}
	
	

}
