package intro;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
//		ternary operator is nothing but the short hand version of if else structure

		Scanner input= new Scanner(System.in);
		System.out.println("enter any number : ");
		int number=input.nextInt();
		
//		String result=(number)>0?"positive":"negative";	
		// like if else format the first one for true condition and the second one for false condition
//		System.out.println(result);
		
		String result1=(number)>0?"positive"+number:(number)<0? "it is a negative number "+number:" oops is a zero "+number;
	
		System.out.println(result1);
	}

}
