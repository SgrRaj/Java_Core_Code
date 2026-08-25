package overload_main_method;

public class MainMethodOverride {
	public static void main(String[] args) {
		System.out.println("main  method called ");
		main(10);
		main("Sagar");
		
	}
	
	public static void main(int a) {
		System.out.println("overload method "+ a);
	}
	

	public static void main(String name) {
		System.out.println("overload method "+ name);
	}

}
