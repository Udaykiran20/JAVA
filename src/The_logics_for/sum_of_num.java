package The_logics_for;

public class sum_of_num {

	public static void main(String[] args) {
		int num, rem=0,sum=0;
		for(num=123,sum=0;num>0;rem=num%10,sum=sum+rem,num=num/10);
		System.out.println(sum);
	}

}
