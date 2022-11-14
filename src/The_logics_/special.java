package The_logics_;

import java.util.Scanner;

public class special {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the String with special characters: ");
		String s=in.next();
		
		int count=0;
		String u ="";
		for(int i=0;i<s.length();i++) {
			
			if(!Character.isDigit(s.charAt(i))&& 
					!Character.isWhitespace(s.charAt(i))&& !Character.isLetter(s.charAt(i))) 
			{
				
				count++;
			}else {
				u=u+s.charAt(i);
				
			}
		}
		if(count==0) {
			System.out.println("no special strings");
		}else {
			System.out.println("no of special characters "+count);
		}
		System.out.println("string without characters : "+u);
  
	}

}
