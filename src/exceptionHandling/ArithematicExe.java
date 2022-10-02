package exceptionHandling;

import java.util.Scanner;
import java.util.*;


public class ArithematicExe {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the first number = ");
		int value1 = obj.nextInt();
		
		System.out.println("enter the second value = ");
		int value2 = obj.nextInt();
		
		
		
		try {
			if(value2==0) {
				System.out.println("vallue of division is "+(value1/value2));
			}
			else {
				System.out.println(value1/value2);
			}
			
		}
		catch(ArithmeticException a){
			System.out.println("can't divide with zero "+value2);
			
		}
		
		

	}

}
