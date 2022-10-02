package constructor;

class automobiles{
	
	String model;
	int milage;
	double cost;
	
	automobiles(){
		
		
	}
}
class car extends automobiles{

String model = "audi";
int milage = 15;
double cost = 1.5;
car(){
	this.cost=cost;
	this.milage=milage;
	this.model=model;
	System.out.println("model is "+model);
	System.out.println("milage of  "+model+" is "+milage);
	System.out.println("the cost is "+cost+"lks");
}
}
public class Theme  {

public static void main(String[] args) {

	car c= new car();
	

}

}
