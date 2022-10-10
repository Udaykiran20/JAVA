package polymorphism;
class car{
	void cost() {
		System.out.println("no cost for CAR");
	}
	void milage() {
		System.out.println("no milage for CAR");
	}
}

class AUDI extends car{
	void cost() {
		System.out.println("cost of AUDI is 50lks");
	}
	void milage() {
		System.out.println("milage of AUDI is 8km/l");
	}
}
class BMW extends car{
	void cost() {
		System.out.println("cost of  BMW is 40lks");
	}
	void milage() {
		System.out.println("milage of BMW is 10km/l");
	}
}
/*class FactoryMethod{
	car getcar(String CarName) {
		if(CarName.equals("BMW")) {
			
			return new BMW();
		}
		else if(CarName.equals("AUDI")) {
			
			return new AUDI();
		}
		else { 
			return null;
		}
	}
}*/

public class MethodOverriding {

	public static void main(String[] args) {
		
		car x = new car();
		x.cost();
		x.milage();

		System.out.println("--------"); //UP CASTING
		x=new AUDI();
		x.cost();
		x.milage();
		
		System.out.println("--------");
		x= new BMW();
		x.cost();
		x.milage();
		
		System.out.println("--------");
		x=new car();
		x.cost();
		x.milage(); 	//down casting*/
		
		/*FactoryMethod fm = new FactoryMethod();
		fm.getcar("AUDI");
		
		car x = fm.getcar("AUDI");
			
		x.cost();
		x.milage();
	

	}

}*/

	}

}
