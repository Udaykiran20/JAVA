package exceptionHandling;

abstract class college{
	abstract void performance();
}
class Department extends college{
	
	void performance() {
		System.out.println("very good performance in studies");
	}
	
}
class mechanical extends Department{
	
	void performance() {
		System.out.println("mechanical students are very clever students");
	}
}
public class ClassCastExe {

	public static void main(String[] args) {
		
		try {
			System.out.println("before excepetion");
			mechanical obj =(mechanical) new Department();
			obj.performance();
			
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		finally {
			System.out.println("after the handling from finally block");
		}

	}

}
