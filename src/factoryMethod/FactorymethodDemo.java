package factoryMethod;

import java.util.Scanner;

abstract class Car{
	abstract void cost();
	abstract void mileage();
	abstract void speed();
}
class Audi extends Car{
	void cost() {
	System.out.println("cost of the audi : 1cr");	
	}
	void mileage() {
	System.out.println("mileage : 15km");	
	}
	void speed() {
	System.out.println("speed : 200km/h");	
	}	
}
class Ferrari extends Car{
	void cost() {
	System.out.println("cost of the audi : 5cr");	
	}
	void mileage() {
	System.out.println("mileage : 9km");	
	}
	void speed() {
	System.out.println("speed : 290km/h");	
	}	
}
class Carfactory {
	static Car getCar(String carname) {
		if(carname.equals("Audi")) {
			return new Audi();
		}
		else if(carname.equals("Ferrari")) {
			return new Ferrari();
		}else {
			return null;
		}
	}	
}
public class FactorymethodDemo{
	
	public static void main(String[] args) {
		Carfactory obj = new Carfactory();
	Car c = Carfactory.getCar("Ferrari"); //creating object with method name
		Scanner input = new Scanner(System.in);
		System.out.println("enter the car name");
		//Car c = obj.getCar(input.next());		// and return type is class name	
		c.cost();
		c.speed();
		c.mileage();
		

	}

}
