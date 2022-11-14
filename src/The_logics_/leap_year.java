package The_logics_;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the year : ");
		int year= in.nextInt();
		
		if(year%4==0 || year%100==0 || year%400==0)
		{
			System.out.println("it is a leap year "+year);
		}else
			System.out.println("it is not a leap year "+year);
				
	}

}
