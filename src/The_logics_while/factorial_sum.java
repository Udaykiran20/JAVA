package The_logics_while;

public class factorial_sum {

	public static void main(String[] args) {
		
		int n=23, rem=0,sum=0,fact;
		
		while(n>0) {
			fact=1;
			rem=n%10;
			while(rem>0) {
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			n=n/10;
		}
		System.out.println("sum is = "+sum);
	}

}
