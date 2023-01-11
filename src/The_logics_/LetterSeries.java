package The_logics_;

import java.util.Scanner;

public class LetterSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("do you want to know the value of alphabet enter alphabet ");
		String in=sc.next();
		
		if(in.equals("alphabet"))
		
		System.out.println("enter the character = ");
		String alpha[]= {" ","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		System.out.println(in.indexOf(in));
		
		int num[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		//int u = Integer.parseInt(i);
		int i =sc.nextInt();
		System.out.println(alpha[i]);
	}

}
