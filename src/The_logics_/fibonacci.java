package The_logics_;

import java.util.Scanner;

public class fibonacci {//the sequence of numbers in which each 
	//number in the sequence is equal to the sum of two numbers before it.

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number: ");
		int count = in.nextInt();
		int n1=0,n2=1, n3,i=0;
		
//		System.out.print(n1+" "+n2);
//		//if we avoid this we are unable to print 0 and 1.
//		
//		for(i=2;i<count;i++) {
//			
//			n3=n1+n2;
//			
//			System.out.print(" "+n3);
//			
//			n1=n2;
//			n2=n3;
			//System.out.print(" "+n3);
//		}
		
		while(i<count) {
			n3=n1+n2;
			System.out.print(n3);
			n1=n2;
			n2=n3;
			i++;
			
		}

	}

}
