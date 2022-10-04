package interfaces__;
interface Dog{
	void age();
	static void color() {
		System.out.println("it is a black color dog");
	}
	default void sleep() {
		System.out.println("sleep 10hours daily");
	}
}
class lab implements Dog{

	public void age() {
		System.out.println("one year old");		
	}	
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Dog obj = new lab();
		obj.age();
		Dog.color();
		obj.sleep();
	}

}
