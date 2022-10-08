package interfaces__;

interface Dogss{
	void age();
	static void color() {
		System.out.println("it is a black color dog");
	}
	default void sleep() {
		System.out.println("sleep 10hours daily");
	}
}
class labs implements Dogss{

	public void age() {
		System.out.println("one year old");		
	}	
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Dogss obj = new labs();
		obj.age();
		Dogss.color();
		obj.sleep();
	}

}
