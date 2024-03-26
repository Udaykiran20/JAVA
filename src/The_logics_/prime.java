package The_logics_;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter any numer : ");
		int num=in.nextInt();
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("it is a prime number "+num);
			}
			else System.out.println("not a prime number "+num);
		}
		else System.out.println("not a prime number "+num);
}}
