package multithreading;

public class ThreadCreationByUsingThreadClassDriver  {
	
	public static void main(String[] args) throws InterruptedException {
		ThreadCreationByUsingThreadClass u1=new ThreadCreationByUsingThreadClass("sagar",2000000000L);
		ThreadCreationByUsingThreadClass u2=new ThreadCreationByUsingThreadClass("raj",3000000000L);
		
	u1.start();
	u2.start();
	
	 u1.join();
	u2.join();
	
	
		
	}

}
