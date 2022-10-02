package inheritancE;

class  mist{
	
	void coursess() {
		System.out.println("MECH  CIVIL ECE EEE CSE");
	}
	
}
class technical extends mist{
	 void b_Tech(){
		 
		 System.out.println("MECH CIVIL ECE EEE CSE");
	 }
}

class agriculture extends technical{
	 void courses() {
		 
		 System.out.println("diploma in agriculture");
	 }
}

public class Multilevel extends agriculture{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel obj = new Multilevel();
		obj.coursess();
		obj.b_Tech();
		obj.courses();
	}

}
