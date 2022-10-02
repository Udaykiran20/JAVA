package nested_class;
class outermethod{
	class innermethod{
		 void inner() {
			 System.out.println("from the inner method");
		 }
	}
	void outer() {
		System.out.println("from the outer method");
		
		//innermethod i = new innermethod();//instance method invoking
		//i.inner();
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outermethod o = new outermethod();
		o.outer();
		outermethod.innermethod i = new outermethod().new innermethod();
		i.inner();
	}
	//here we created a class inside class it is known as regular inner class
	//we can't invoke the inner class methods directly
//we can access the methods by instance method and ststic method
}
