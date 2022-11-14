package The_logics_;

import java.util.Scanner;

public class armstrong_number {

	//defined as the given number quebes is equal to the given number.
	//153 =(1*3)+(5*3)+(3*3)=153 it is a Armstrong number.
	//if it i a four digit number then multiply with 4 respectively
	//% takes the remainder value and / takes quetient value.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number : ");
		
		int x= in.nextInt(),temp,sum=0,rem=0;
		String y = Integer.toString(x);
		
		temp=x;
		if(y.length()==3) {
			
		while(x!=0) {
			
			rem=x%10;
			sum=sum+(rem*rem*rem);
			x=x/10; 
			
		}
		if(temp==sum) {
			System.out.println("it is a armstrong number");
		}else {
			System.out.println("it is not a armstrong number");
		}
	}
		else {
		temp=x;
		
		while(x!=0) {
			
			rem=x%10;
			sum=sum+(rem*rem*rem*rem);
			x=x/10;
			}
		if(temp==sum) {
			System.out.println("it is a  armstrong number");
		}else {
			System.out.println("is armstrong number");
		}
		
	}
  }
}
