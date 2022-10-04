package interfaces__;

interface vehicles{
	void type_of_vehicle();
	public interface Lorry extends vehicles{
		void lorry();
	}
}

class Scannia implements vehicles.Lorry{

	@Override
	public void type_of_vehicle() {
	System.out.println("Heavy load carrier");
		
	}

	@Override
	public void lorry() {
		System.out.println("LORRYS carries heavy loads");
		
	}
	
}

public class NestedInterface2 {

	public static void main(String[] args) {
		
		vehicles.Lorry obj = new Scannia();
		
		obj.type_of_vehicle();
		System.out.println();
		obj.lorry();

	}

}
