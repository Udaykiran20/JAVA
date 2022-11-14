   package abstract_;
abstract class hospital{
	abstract void heart();
	abstract void brain();
	abstract void kidney();
	
	void specialist() {
		System.out.println("The specialiist for this department is ");
	}
}

class ukHospitals extends hospital{

	@Override
	void heart() {
		// TODO Auto-generated method stub
		System.out.println("Mr.UDAY KIRAN ");
		
	}

	@Override
	void brain() {
		// TODO Auto-generated method stub
		System.out.println("Mr.UDAY");
		
	}

	@Override
	void kidney() {
		// TODO Auto-generated method stub
		System.out.println("Mr.KIRAN");
		
	}
	
}

class uHospitals extends hospital{

	@Override
	void heart() {
		// TODO Auto-generated method stub
		System.out.println("Mr.SATHYA");
		
	}

	@Override
	void brain() {
		// TODO Auto-generated method stub
		System.out.println("Mr.SANDEEP");
		
	}

	@Override
	void kidney() {
		// TODO Auto-generated method stub
		System.out.println("Mr.SATHYA SANDEEP");
		
	}
	
}
public class Choise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hospital doctor;
		doctor=new ukHospitals();
		doctor.specialist();
		doctor.brain();
		doctor.heart();
		doctor.kidney();
		doctor = new uHospitals();
		doctor.specialist();
		doctor.brain();
		doctor.heart();
		doctor.kidney();
	}

}
