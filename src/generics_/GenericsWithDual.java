package generics_;

//with wrapper classes

class Details<u,S>{
	void details(u d,S s){
		System.out.println("______________");
		System.out.println("first object"+d);
		System.out.println("second object"+s);
		System.out.println("_______________");
		}
	
}

public class GenericsWithDual {

	public static void main(String[] args) {
		Details<Integer,String> a = new Details<>(); 
		a.details(157,"cm");
		
		 Details<String,String> y = new Details<>();
		 y.details("uday kiran","jamili");
		 
		 Details<Float,Integer> k = new Details<>();
		 k.details(60.3f,22);
		 
		 Details<Double,Character> i = new Details<>();
		 i.details(4563.45,'O');
		 

		
	}

}
