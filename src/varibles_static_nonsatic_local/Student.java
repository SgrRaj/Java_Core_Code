package varibles_static_nonsatic_local;

public class Student {
	String name="sagar";  
	static int roll;
	
	public static void main(String[] args) {
		int price=20000;
		
		System.out.println(price);
		System.out.println(Student.roll);
		Student s=new Student();
		System.out.println(s.name);
		
	}

}
