package constructor_parameterized_non_parameterized;

public class Vehicle {
	String name;
	int roll;
	double price;
	
	Vehicle(){
		
	}
	
	Vehicle(String name,int roll,double price){
		this.name=name;
		this.roll=roll;
		this.price=price;
		
	}
	
	public String toString() {
		return "Name "+name+" roll "+roll+" price "+price;
	}
	
	public static void main(String[] args) {
		Vehicle v=new Vehicle("sagar",2121442,50000);
		System.out.println(v);
		
	}

}
