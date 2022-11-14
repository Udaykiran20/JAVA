package The_logics_;

import java.util.Scanner;

public class counting_vowels {

	public static void main(String[] args) {
		
		//while(true) {
			int count=0, count1=0;
			Scanner in = new Scanner(System.in);
			
			System.out.println("enter any sentence: ");
			String sent=in.next();
			
			String sentence=sent.toLowerCase();
			
			for(int i=0;i<sentence.length();i++) {
				if(sentence.charAt(i)=='a'|| sentence.charAt(i)=='e' ||sentence.charAt(i)=='i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u')
					{
					count++;
					}
				else if(sentence.charAt(i)<='a'&&sentence.charAt(i)<='z'){
					count1++;
				}
			}
			System.out.println("the number of vowels: "+count);
			System.out.println("the number of constants: "+count1);
			
			
			
			
			
		}

	//}

}
