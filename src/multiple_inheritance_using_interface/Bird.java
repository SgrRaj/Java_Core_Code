package multiple_inheritance_using_interface;

public class Bird implements Flyable,LivingThings{
	public void eat() {
		System.out.println("Birds are eating..");
	}
	
	public void fly() {
		System.out.println("Birds are flying..");
	}
	
	

}
