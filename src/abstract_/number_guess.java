package abstract_;

import java.util.Random;
import java.util.Scanner;

public class number_guess {

	public static void main(String[] args) {
		 
		
		Random function = new Random();
		int y=function.nextInt(10);
		//System.out.println(y);
		while(true) {
			String choise;
			Scanner in= new Scanner(System.in);
			System.out.println("enter any number: ");
			int x=in.nextInt();
			
			
			{
			if(x<y) 
				System.out.println("too low"+x);
			
			else if(x>y)
				System.out.println("too high"+x);
			else
				System.out.println("just right"+y+"="+x);
			}
			Scanner inp = new Scanner(System.in);
			
			System.out.println("do you want to continue");
			choise=inp.next();
			if(choise.equals("no"))
				break;
			
		}

	}

}
