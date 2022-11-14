package The_logics_while;

import java.util.Scanner;

public class palidrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number: ");
		int n=in.nextInt(), pali=0, rem=0,que=0;
		int i=n;
		while(i>0) {
			
			rem=i%10;
			pali=pali*10+rem;
			i=i/10;
		}
		
		if(pali==n)
			System.out.println("it is a palidrome number = "+pali);
		else 
			System.out.println("it is not a palidrome number = "+pali);
	
	}

}
