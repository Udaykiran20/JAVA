package The_logics_;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num = in.nextInt();
		
		for(int i=1;i<=10;i++) {
			if(i==9)
				continue;
			if(i==4)
				continue;
			
			System.out.println(num+" x "+i+" = "+(i*num));
		}
	}

}
