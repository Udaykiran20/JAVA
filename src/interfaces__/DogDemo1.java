package interfaces__;

public interface DogDemo1 {
	void bark();
	static void eat() {
		System.out.println("eats pedigri");
	}
	default  void sleep() {
		System.out.println("sleeps 12hrs daily");
	}

}
