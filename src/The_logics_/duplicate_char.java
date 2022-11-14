package The_logics_;

public class duplicate_char {

	public static void main(String[] args) {
		
		int sum=0, n=3457, rem=0, que=0;
		while(sum<=0) {
			rem=n%100;
			que=n/100;
			sum=(rem%10)+(que/10);
			System.out.println(sum);
		}
		
		
		

   }

}
