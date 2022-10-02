package method;

class automobile{
	
	void brand() {
		System.out.println("jaguar");
	}
	
	String power(String power) {
		System.out.println("the poweer deliverd by jaguar is ");
		
		return"350hp"+power;
	}
	
	int cost(String varient) {
		System.out.println("the low end varient "+varient);
		return 4500000;
	}
	 String stauts() {
		//System.out.println("");
		return "represents the status";
	}
}


public class Automobiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		automobile a =new automobile();
		
		a.brand();
		System.out.println(a.cost("diesel costs around"));
		System.out.println(a.power(" Torque"));
		//always apply println when we want to use the return.
		a.stauts();
		

	}

}
