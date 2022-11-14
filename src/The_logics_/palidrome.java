package The_logics_;

import java.util.Scanner;

public class palidrome {
//if number is same when it is return the order = 16461
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
//		System.out.println("enter your number: ");
//		int num=in.nextInt();
//		
//		int org_num = num;
//		int rev=0;
//		while(num!=0) {
//			rev=rev*10+num%10;
//			num=num/10;
//		}
//		System.out.println(rev);
//		if(org_num==rev) {
//			System.out.println("it is palidrome number ");
//		}else {
//			System.out.println("it is not a palidrome number ");
//			
//		}
		
		System.out.println("enter the string value: ");
		
		String str = in.next();
		
		String str_org=str;
		String rev="";
		
		int len = str.length();
		
		for(int i=len-1; i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str_org.equals(rev)) {
			System.out.println("yes it is palidrome string : "+rev);
		}
		else {
			System.out.println("it is not a palidrome String: "+rev);
		}

	}

}
