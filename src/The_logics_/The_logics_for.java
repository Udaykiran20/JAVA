package The_logics_;

public class The_logics_for {

	public static void main(String[] args) {
		
		int  num,sum=0, rem=0;
		
		for(num=125,sum=0;num>0;rem=num%10,sum=sum+rem,num=num/10);
			System.out.println(sum);
	}
}
