package abstract_;

abstract class vehicle{
	abstract void cost();
	abstract void milage();
	
	void start() {
		System.out.println("engine starts with a key");
	}
}
	class Audi extends vehicle{

		@Override 
		void cost() {
			// TODO Auto-generated method stub
			System.out.println("the cost of audi is 50laks");
		}

		@Override
		void milage() {
			// TODO Auto-generated method stub
			System.out.println("the milage is 10 per ltr");
		}
	
}
	class Bmw extends vehicle{

		@Override
		void cost() {
			// TODO Auto-generated method stub
			System.out.println("the cost of the BMW is 50lks ");
		}

		@Override
		void milage() {
			// TODO Auto-generated method stub
			System.out.println("the milage is 10 per ltr");
		}
		
	}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vehicle car; // we can't create object for abstract classs so we are 
		// assigning the reference of the object
		car = new Audi();
		car.start();
		car.cost();
		car.milage();
		car = new Bmw();
		car.start();
		car.cost();
		car.milage();

	}

}
