package The_logics_do_while;

public class fact {

	
	public static void main(String [] args) {
		
		
		int n=5, fact=1;
		
		do {
			fact=fact*n;
			n--;
		}while(n>0);
		
		System.out.println("factorial = "+fact);
		
 	}
}
