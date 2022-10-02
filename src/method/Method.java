package method;

class bank{
	public void form() {
		System.out.println("enter the details accountnumber_phnnumber_adharnumber");
	}	
	public void doc(int adhar, String adderes) {
		System.out.println("adhar "+adhar+"; address "+adderes);
		
	}
	String passbook() {
		//System.out.println("");
		return "passbook";
	}
	String credit(int amount) {
		return "amount credited "+amount;
	}
}

public class Method {

	public static void main(String[] args) {
		
		bank b= new bank();
		b.form();
		b.doc(2206, " sathupalli");
		System.out.println(b.passbook());
		System.out.println(b.credit(450000));

	}

}
