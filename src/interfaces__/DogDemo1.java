package interfaces__;

public interface DogDemo1 {
	void bark(int age);
	
	static void eat() {
		System.out.println("eats pedigri");
	}
	default  void sleep() {
		System.out.println("sleeps 12hrs daily");
	}

}
