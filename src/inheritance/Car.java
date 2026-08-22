package inheritance;

public class Car implements Vehicle{
	@Override
	public void drive() {
		System.out.println("drive a Car");	
	}
	
	@Override
	public void start() {
		System.out.println("start a Car");
		
	}

	@Override
	public void stop() {
		System.out.println("start a Car");
		
	}

}
