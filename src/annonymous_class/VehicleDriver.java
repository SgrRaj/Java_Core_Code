package annonymous_class;

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle Car=new Vehicle() {
			public void start() {
				System.out.println("car started..");
			}
			
			public void stop() {
				System.out.println("car stop..");
			}
		};
		
		Vehicle Bike =new Vehicle() {
			public void start() {
				System.out.println("Bike started..");
			}
			
			public void stop() {
				System.out.println("Bike started..");
			}
		};
		
		Car.start();
		Car.stop();
		
		Bike.start();
		Bike.stop();
		
		
		
	}

}
