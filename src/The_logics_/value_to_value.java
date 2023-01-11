package The_logics_;

import java.util.Scanner;

public class value_to_value {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter any number between 1-0: ");
		int num=in.nextInt();
		
		String []words= { 
				"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven",
				"twelve","thirteen","fourteen","fifteen"
		,"sixteen","seventeen","eighteen","nineteen"};
		
		String[] tens= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		
		int rem=(num>=20 && num<100)?num%10:(num>=100 && num<1000)?num%100:0;
		int que=(num>=20 && num<100)?num/10:(num>=100 && num<1000)?num/100:0;
		 
		if(num>=0 && num<100) {
			if(num<20) {
			System.out.println(words[num]);
				}
			else if(num>=20 && num<100 && rem!=0) {
			
			System.out.println(tens[que]+""+words[rem]);
				}
			else if(num>=20 && num<100 &&rem==0) {
			System.out.println(tens[que]);
		}
		
	}
	else if(num>=100&&num<1000 &&rem!=0) {
			int rem1=rem%10;
			int que1=rem/10;
			System.out.println(words[que]+" hundred "+tens[que1]+" "+words[rem1]);
		}
	else if(num>=100&&num<1000 && rem==0) {
		System.out.println(words[que]+" hundred");
	}
 }

}
