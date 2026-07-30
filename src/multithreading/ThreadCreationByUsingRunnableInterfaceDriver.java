package multithreading;

public class ThreadCreationByUsingRunnableInterfaceDriver  {

	public static void main(String[] args) {
		ThreadCreationByUsingRunnableInterface t1=new ThreadCreationByUsingRunnableInterface("sagar",20);	
		ThreadCreationByUsingRunnableInterface t2=new ThreadCreationByUsingRunnableInterface("ksk",30);
	
		Thread c1=new Thread(t1);
		Thread c2=new Thread(t2);
	
		c1.start();
		c2.start();
		
	
	}
}
