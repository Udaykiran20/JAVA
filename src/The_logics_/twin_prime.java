package The_logics_;

import java.util.Scanner;

public class twin_prime {
// the two numbers are prime with difference of 2 between them.
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the first number: ");
		int num1=in.nextInt();
//		System.out.println("enter the second number: ");
//		int num2 = in.nextInt();
		
	

		
			for(int i=1;i<=num1;i++) {
			int count1=0;
			int count2=0;
			for(int num=1;num<=num1;num++) {
			if(i%num==0) {
			count1++;
			}
			if((i-2)%num==0) {
				count2++;
				}
			}
	
		if(count1==2&&count2==2){//&&((num1-num2==2)||(num2-num1==2))) 
			System.out.println("("+(i-2)+","+i+")");
			}
		}
		
//		else {
//			//System.out.println("not a twin primes...:"+num1+num2);
//			
//		}
	}
	}

