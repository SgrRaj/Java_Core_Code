package multithreading;

public class SleepThreadDriver {
	
	public static void main(String[] args) {
		SleepThread s1=new SleepThread("sagar",50);
		SleepThread s2=new SleepThread("lal",20);
		
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
	
		
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t2.start();
		
		
	}

}
