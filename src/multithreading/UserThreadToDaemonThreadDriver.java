package multithreading;

public class UserThreadToDaemonThreadDriver {
	
	public static void main(String[] args)  {
		UserThreadToDaemonThread u1=new UserThreadToDaemonThread("sagar",23);
		UserThreadToDaemonThread u2=new UserThreadToDaemonThread("raaam",24);
		 
		Thread t1=new Thread(u1);
		Thread t2=new Thread(u2);
		
		
		
		//t1.setDaemon(true);  //if we write t1.setDaemon(true); it gives exception if we write after t1.start();
		t1.start();
		
		
		t2.start();
		
		
		
	}

}
