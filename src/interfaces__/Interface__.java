package interfaces__;

interface Tata{
	String name = "range rover";
	String price="2.39crs";
	float milage = 14.01f;
}
interface harrier extends Tata{
	String name = "Harrier";
	String price="20.20lks";
	float milage = 17.01f;
	
}

class TataGroup implements harrier{
	
	void show() {
		
		System.out.println("car name   : "+Tata.name);
		System.out.println("car price  : "+Tata.price);
		System.out.println("car milage : "+Tata.milage);
	}
	void print() {
		System.out.println("car name   : "+TataGroup.name);
		System.out.println("car price  : "+TataGroup.price);
		System.out.println("car milage : "+TataGroup.milage);
	}
	
	
}

public class Interface__ {

	public static void main(String[] args) {
		
		TataGroup obj = new TataGroup();
		obj.show();
		obj.print();

	}

}
