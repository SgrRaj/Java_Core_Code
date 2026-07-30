package multithreading;

public class ThreadCreationByUsingThreadClass extends Thread {
	
	String name;
	long num;
	
	ThreadCreationByUsingThreadClass(String name,long num){
		this.name=name;
		this.num=num;
		
	}
	
	public void run() {
		add();
	}

	public void add() {
		
	long sum=0;
	for(long i=0;i<num;i++) {
		sum+=i;
	}
	System.out.println("name : "+name+"   sum is : "+sum);
		
	}
}
