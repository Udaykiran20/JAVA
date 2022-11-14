package The_logics_;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("enterr the number: ");
		int num=r.nextInt();
		if(num%2==0) {
			System.out.println("it is a even number");
		}
		
		else {
			System.out.println("it is a odd number");
		}
	}

}
