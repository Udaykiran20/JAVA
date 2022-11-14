package The_logics_while;

public class second_second_last_sum {

	public static void main(String[] args) {
		
		int num=59813, rem=0,sum=0,que=0,que1=0;
		
		rem=num%100;
		que1=rem/10;
		
		while(num>100) {
			que=num/10;
			num=que;
		}
		que=num%10;
		sum=que1+que;
		System.out.println();
		System.out.println("the second_last "+rem);
		System.out.println("second "+que);
		System.out.println("with loop...."+sum);
		
		
		

	}
 
}
