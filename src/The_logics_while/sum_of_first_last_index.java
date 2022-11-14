package The_logics_while;

public class sum_of_first_last_index {

	public static void main(String[] args) {
		
		int num=2539, rem=0,que=0,sum=0;
		while(sum<=0) {//loop executing only once
			rem=num%100;
			que=num/100;
			sum=(rem%10)+(que/10);
			System.out.println("without loop..."+sum);
		}
		
		rem=num%10;
		
		while(num>10) {
			que=num/10;
			num=que;
		}
		sum=rem+que;
		System.out.println("with loop..."+sum);
	
		

	}

}
