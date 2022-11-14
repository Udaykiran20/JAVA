package The_logics_;

import java.util.Scanner;

public class swaping {

	public static void main(String[] args) {
		
		while(true) {
			 
			 String choice;
		 Scanner in = new Scanner(System.in);
		 System.out.println("continue with string(yes/no) : ");
		 String desicion=in.next();
		 
		
		 
		 if(desicion.equals("no")) 
		 {
		System.out.println("you selected for numbers......");	 
		System.out.println("enter the first value : ");
		int x=in.nextInt();
		System.out.println("enter the second value : ");
		int y= in.nextInt();
		System.out.println("before swap");
		System.out.println("y = "+y);
		System.out.println("x = "+x);
		x=x+y; 
		y=x-y;
		x=x-y;
		System.out.println("after swap");
		System.out.println("y = "+y);
		System.out.println("x = "+x);
		
		System.out.println();
		System.out.println("do you want to continue(yes/no) :");
		choice=in.next();
		
		if(choice.equals("no")) {
			System.out.println("thankyou :) visit again");
			break;
		}
		 }
		 else if(desicion.equals("yes")) 
		System.out.println("you selected for strings......");
		System.out.println("enter the first string value : ");
		String name1=in.next();
		System.out.println("enter the second string value : ");
		String name2=in.next();
		
		System.out.println("before swap...");
		System.out.println("name1 : "+name1);
		System.out.println("name2 : "+name2);
		
		name1=name1.concat(name2);
		name2=name1.substring(0,(name1.length()-name2.length()));
		name1=name1.substring(name2.length());
		
		System.out.println("after swap...");
		System.out.println("name1 : "+name1);
		System.out.println("name2 : "+name2);
		
		System.out.println();
		System.out.println("do you want to continue(yes/no) :");
		choice=in.next();
		
		if(choice.equals("no")) {
			System.out.println("thankyou :) visit again");
			break;
		}
		 }
		 
	}

}
