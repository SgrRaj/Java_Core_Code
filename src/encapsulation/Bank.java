package encapsulation;

public class Bank {
	private int id;
	private String name;
	private double bal;
	 
	
	public void setDetails(int id,String name,double bal) {
		this.id=id;
		this.name=name;
		this.bal=bal;
		
	}
	
	public String getDetails() {
		return "id: "+id+" name: "+name+" bal: "+bal;
	}
	
	
	

}
