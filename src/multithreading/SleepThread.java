package multithreading;

public class SleepThread implements Runnable{
	String name;
	long num;
	
	SleepThread(String name,long num){
		this.name=name;
		this.num=num;
		
	}
	
	public void run() {
		add();
	}
	
	public void add() {
		long sum=0;
		for(int i=0;i<num;i++) {
			System.out.println(" name : "+name+"  i is : "+i);
			sum+=i;
			
		}
		
		System.out.println(" name : "+name+"  sum is : "+sum);
	}
	

}
