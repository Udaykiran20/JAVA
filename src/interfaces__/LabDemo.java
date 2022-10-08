package interfaces__;

public class LabDemo implements DogDemo1{

	public static void main(String[] args) {
		LabDemo l = new LabDemo();
		DogDemo1.eat();//static methods depends on class name only
		l.bark();
		l.sleep();
		

	}
	public void bark() {
		System.out.println("lab barks aloud");
		
	}

}
