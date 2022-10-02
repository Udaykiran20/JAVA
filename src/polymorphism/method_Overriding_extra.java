package polymorphism;

class Banking{
	
	void types() {
		System.out.println("there are two types in banking");
		System.out.println("offline banking");
		System.out.println("online banking");
	}
	void deposit() {
		System.out.println("deposit risk depends on type of banking");
		
	}
	void Withdraw() {
		System.out.println("withdrawal risk depends on type of banking");
	}
}
class OfflineBanking extends Banking{
	
	void deposit() {
		System.out.println("go to the bank and fil the account details and submit it to the accountant");
	}
	void Withdraw() {
		System.out.println("Withdrawal is difficult");
	}
}
class OnlineBanking extends Banking{
	
	void deposit() {
		System.out.println("download the application and fill the details to deposit");
	}
	void Withdraw() {
		System.out.println("withdrawal is easy ");
	}
}

public class method_Overriding_extra {

	public static void main(String[] args) {
		
		Banking b = new Banking();
		b.types();
		b.deposit();
		b.Withdraw();
		
		System.out.println("____");
		
		b= new OfflineBanking();
		b.deposit();
		b.Withdraw();
		
		System.out.println("____");
		b= new OnlineBanking();
		b.deposit();
		b.Withdraw();

	}

}