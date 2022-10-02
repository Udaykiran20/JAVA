package constructor;

class employee{
	int  eid;
	double salary;
	
	/*employee(){
		eid=2043;
		salary = 45000;
	}*/
	employee(int eid, double salary){
		this.eid=eid;
		this.salary=salary;
	}
	void show() {
		System.out.println("this = "+this);
		System.out.println("EID = "+eid);
		System.out.println("salary = "+salary);
		//this.show();
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
	
		employee shiva = new employee(2043,450000);
		shiva.show();
		
		System.out.println("shiva = "+shiva);
		employee uday = new employee(2045, 450000);
		uday.show();
		
	}

}
