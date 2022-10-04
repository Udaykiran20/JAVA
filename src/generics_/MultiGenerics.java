package generics_;

class trio<U,D,A,Y>{
	
	void multiple(U u, D d, A a, Y y) {
		
		System.out.println(u+"-"+d+"-"+a+"-"+y);
	}
	
}


public class MultiGenerics {

	public static void main(String[] args) {
		
		trio<Integer,String,Float,Character> obj = new trio<>(); // object creation
		obj.multiple(7, "uday", 5.99f, 'J');
	}

}
