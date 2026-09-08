package constructor_parameterized_non_parameterized;

public class ThisCall {
	
	
String name;
int roll;
double price;

ThisCall(){
	
}

ThisCall(String name){
	this.name=name;
}

ThisCall(String name,int roll)
{
	this(name);
	this.roll=roll;
	
}

ThisCall(String name,int roll,double price){
	this(name,roll);
	this.price=price;
	
}
@Override
public String toString() {
	return "name "+name+" roll "+roll+" price "+price;
}

}
