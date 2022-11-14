package The_logics_while;

import java.util.Scanner;

public class febnocis_ {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.print("enter the febnocis limit = ");
	
		int num=in.nextInt(), num1=0, num2=1, num3=0;
		while(num1<=num) {
			
			num3=num1+num2;
			System.out.print(" "+num1);
			num1=num2;
			num2=num3;
		}
	}

}
