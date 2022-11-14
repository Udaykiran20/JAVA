package The_logics_while;

import java.util.Scanner;

public class armstrong_number {

	public static void main(String[] args) {
		int n=100, rem=0,sum=0,num=0;
			int i;
		while(n<1000){
			i =  n;
			num = i;
			while(i>0){
			rem=i%10;
			sum=sum+(rem*rem*rem);
			i=i/10;
			}
			if(sum==n)
			System.out.println("it is a armstrong number -- "+num);
			sum = 0;	
			n++;
		}

	}

}
