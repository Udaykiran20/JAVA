package The_logics_;

public class grade_of_subjs {

	public static void main(String[] args) {
		
		int sub1=28,sub2=28,sub3=34,sub4=57,sub5=64,sub6=39;
		int sum=sub1+sub2+sub3+sub4+sub5+sub6;
		float avg=sum/6;
		
		if(avg>=75)
			System.out.println("A grade");
		else if(avg>=65 && avg<75)
			System.out.println("B grade");
		else if(avg>=45 && avg<65)
			System.out.println("C grade");
		else
			System.out.println("Fail");
	}

}
