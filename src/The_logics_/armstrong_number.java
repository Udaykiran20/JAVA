package The_logics_;

import java.util.Scanner;

public class armstrong_number {

public static void main(String [] args) {
	
//	for(int i=0;i<5;i++) {
//		for(int j=0;j<=i;j++) 
//			System.out.print(" *");
//		System.out.println();	
//	}
	
//	for(int i=0;i<=5;i++) {
//		for(int j=1;j<i;j++)
//			System.out.print(" "+j);
//		System.out.println();
//	}
	
//	for(int i=0;i<=5;i++) {
//		for(int j=0;j<i;j++)
//			System.out.print(" "+i);
//		System.out.println();
//	}
	
//	for(int i=0;i<6;i++) {
//		for(int s=6-i;s>1;s--)
//			System.out.print(" ");
//		for(int j=1;j<=i;j++)
//			System.out.print(" "+j);
//		System.out.println();
//	}
	
//	for(int i=0;i<6;i++) {
//		for(int j=6-i;j>1;j--)
//			System.out.print(" ");
//		for(int k=0;k<i;k++)
//			System.out.print(" *");
//		System.out.println();
//	}
//	for(int i=0;i<6;i++) {
//		for(int j=5;j>i;j--)
//			System.out.print(" "+j);
//		System.out.println();
//	}
//    int size = 5, alpha = 65;
//    for (int i = 0; i < size; i++) {
//		      // print spaces
//		      for (int j = 0; j < size - i - 1; j++) {
//		        System.out.print(" ");
//		      }
//		      // print alphabets
//		      for (int k = 0; k < 2 * i + 1; k++) {
//		        System.out.print((char)(alpha+k));
//		      }
//		      System.out.println();
//		    
//		  
//		}
	
//	char ch='A';
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=i;j++) 
//			System.out.print(" "+ch);
//		System.out.println();
//		ch++;
//		}
//	char c='A';
//	
//	for(int i=1;i<=26;i++) {
//		c='A';
//		for(int j=1;j<=i;j++) {
//			System.out.print(" "+c);
//			c++;
//		}
//		System.out.println();
//		
//	}
//		int size=5;
//		for(int i=0;i<size;i++) {
//			for(int j=0;j<size;j++) {
//				
//				if(i==0||i==size-1) {
//					System.out.print("*");
//				}
//				else {
//					if(j==0||j==size-1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//						
//					}
//				}
//			}
//			System.out.println();
//		}
	int a=0,b=1,c=0;
	for(int i=0;i<=5;i++) {
		for(int j=0;j<=i;j++) {
			c=a+b;
			System.out.print(a);
			a=b;
			b=c;
		}System.out.println( );
	}
}
}
