package java8;

interface Aboutinterface{
	
	void method1();
	
	default void method2() {
		System.out.println("possible to write a method in the interface (by using default key word)");
	}
	static void method3() {
		System.out.println("possible to write a method by using static in interface");
		System.out.println("by using static and default key words before the method's return type.");
	}
	
	
}

class ForReference implements Aboutinterface{

	@Override
	public void method1() {
		System.out.println("it is clear that we write method body in interfaces");
		
	}
}

public class SecondFeature {

	public static void main(String[] args) {
		
		ForReference obj = new ForReference();
		
		obj.method1();
		obj.method2();
		
		Aboutinterface.method3();// special way for static method in interfaces.

	}

}
