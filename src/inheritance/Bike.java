package inheritance;

public class Bike implements Vehicle{
	@Override
	public void drive() {
		System.out.println("drive a Bike");	
	}
	
	@Override
	public void start() {
		System.out.println("start a Bike");
		
	}

	@Override
	public void stop() {
		System.out.println("start a Bike");
		
	}

}
