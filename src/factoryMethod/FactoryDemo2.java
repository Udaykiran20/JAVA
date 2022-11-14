package factoryMethod;
import java.util.*;

abstract class specifications_of_Bajaj{
	abstract void model();
	abstract void torque();
	abstract void engine();
	abstract void speed();
	abstract void milage();
	abstract void price();
	
}
class pulsarN160 extends specifications_of_Bajaj{

	void model() {
		System.out.println("bajaj pulsar N160");
		
	}
	void torque() {
		System.out.println("Maximum Torque : 14.65 Nm @ 6750 rpm");
		
	}
	void engine() {
		System.out.println("Engine Type : Single cylinder, 4 stroke, SOHC, 2 valve, Oil cooled, FI");
		
	}
	void speed() {
		System.out.println("Speed : 0-100kmph in 15 seconds and top speed is 120 kmph (speedo-indicated).");
		
	}
	void milage() {
		System.out.println("Mileage : Bajaj Pulsar N160 mileage is 42 kmpl (approximate).");
		
	}
	void price() {
		System.out.println("EX-Shoroom price : 1,22,854 INR.");	
	}
}
class Pulsar_RS200 extends specifications_of_Bajaj{

	void model() {
		System.out.println("bajaj pulsar RS200");
		}
	void torque() {
		System.out.println("Maximum Torque : 18.7 Nm @ 8000 rpm");
	}
	void engine() {
		System.out.println("Engine type : Fuel Injection System, Triple Spark 4 Valve 200cc BSVI DTS-i FI Engine, Liquid Cooled");
		
	}
	void speed() {
		System.out.println("Speed : bike can accelerate from 0-100 kmph in 9.92 seconds and top speed is 140.8 kmph (company-claimed)");
		}
	void milage() {
		System.out.println("Mileage : mileage is 35 kmpl (approximate).");	
	}
	void price() {
		System.out.println("Price : Bajaj Pulsar RS200 price is Rs 1.70 lakh (ex-showroom).");
	}
}
class pulsar_N250 extends specifications_of_Bajaj{

	void model() {
		System.out.println("bajaj pulsar N250");
	}
	void torque() {
		System.out.println("Max Torque : 21.5 Nm @ 6500 rpm");
	}
	void engine() {
		System.out.println("Engine Type : Single cylinder, 4 stroke, SOHC, 2 Valve, Oil cooled, FI");
	}
	void speed() {
		System.out.println("Speed : can accelerate from 0-100 kmph in around 10.5 seconds and top speed is 130 kmph (approximate).");	
	}
	void milage() {
		System.out.println("Mileage : expected mileage is 35 kmpl (approximate).");
	}
	void price() {
		System.out.println("Price : Bajaj Pulsar N250 on road price is around 1.70 lakh");
	}
}
class details{
		
	specifications_of_Bajaj getdetails(String model){
		
		if(model.equals("pulsar_N250")) {
			return new pulsar_N250();
			}
		else if(model.equals("Pulsar_RS200")){
			return new Pulsar_RS200();
		}
		else {
		return new pulsarN160();
		}
	}
}
public class FactoryDemo2 {

	public static void main(String[] args) {
		
		details obj = new details();
		Scanner input = new Scanner(System.in);
		System.out.println("enter the car name");
		String c = input.next();
		specifications_of_Bajaj obj1 = obj.getdetails(c);
		
		obj1.engine();
		obj1.torque();
		obj1.speed();
		obj1.milage();
		obj1.price();
	}

}
