package The_logics_for;

import java.util.Scanner;

public class arraysum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum=0;
		int a[] =new int[6];
		
		for(int i=0; i<a.length;i++) {
			System.out.print("enter subject marks: ");//store
			a[i]=in.nextInt();
			//a[0]=12
			//a[1]=13
			//a[2]=14
			//a[3]=15
			//a[4]=16
			//a[5]=17
			
			
		}
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			System.out.println(a[i]);
		}
		System.out.println("total marks is ="+sum);
//		float avg=sum/6;
//		
//		if(avg>=75)
//			System.out.println("A grade");
//		else if(avg>=65 && avg<75)
//			System.out.println("B grade");
//		else if(avg>45 && avg<65)
//			System.out.println("C grade");
//		else
//			System.out.println("Fail");
		
		int x=a[0],y=a[0];
		for(int i=0;i<a.length;i++) {
			if(x<a[i])
			
				x=a[i];
		}
			
		for(int j=0;j<a.length;j++) {
			if(x==a[j]) 
				x = a[j];
			else if(y<a[j]) 
				y=a[j];
		}
		System.out.println("first largest is "+x);	
		System.out.println("second largest "+y);

				
			}
//		int x=0;
//		for(int i=0;i<a.length;i++) {
//			x=a[i];
//			if(x%2==0) {
//				System.out.println(x);	
//			}
//			else {
//				System.out.println(x);	
//		}	System.out.println("the even numbers " +a[i]);
//			
//		}
		
		
	}
	

