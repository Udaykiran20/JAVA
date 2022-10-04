package generics_;

class Person<r>{
	void info(r p) { 	// here p is an object
		System.out.println("-> "+ p);
	}
}
public class GenericDemo {
	public static void main(String[] args) {
		Person<Integer> h = new Person<>();
		h.info(171);
		Person<String> n = new Person<>();
		n.info("rohit");
		Person<Float> w = new Person<>();
		w.info(60.1f);
		Person<Character> c = new Person<>();
		c.info('r');
		Person<Double> d = new Person<>();
		d.info(60.1234);

	

	}

}
