	package The_logics_;

import java.util.Scanner;

public class equation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number: ");
		int t = in.nextInt();
		for(int i=0; i<t;i++)
		{
		int a= in.nextInt();
		int b= in.nextInt();
		int n= in.nextInt();
		
		int sum = a;
		for(int k=0;k<n;k++)
		{
			int x=(int)Math.pow(2,k)*b;
			sum=x+sum;
			System.out.print(sum+" ");
		}
		System.out.println(" ");
	}
		
	}

}
