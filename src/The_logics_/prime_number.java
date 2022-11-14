package The_logics_;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		while(true) {
			String choice;
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter the numer : ");
//		int x = in.nextInt();
			int x=10;
		int y=0;
		if(x>1) {
			for(int i=1;i<=x;i++) 
			{
				if(x%i==0) {	//% remainder value
					
				y++;
				}
			
				
			
			if(y==2) {
				System.out.println("it is a prime number "+i);
			}else 
			{
				System.out.println("it is not a prime number");
				continue;
			}
			
		}
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("do you want to continue");
		choice = input.next();
		if(choice.equals("no")) {
			break;
		}
		
		}
			
		}
	}
	}
	


