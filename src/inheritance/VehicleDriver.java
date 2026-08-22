package inheritance;

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle v= new Bus();
		v.drive();
		v.start();
		v.stop();
	
	
	Vehicle v1= new Bike();
	v1.drive();
	v1.start();
	v1.stop();
	
	}

}
