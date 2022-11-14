package The_logics_for;

import java.util.Arrays;
import java.util.Scanner;

public class merge_arrarys {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("define the fisrt array size : ");
		 int n1 = in.nextInt();
		 
		 int arr1[] =new int[n1];
		 
		 for(int i=0; i<arr1.length;i++) {
			 System.out.println("enter values(arr1) :");
			 arr1[i]=in.nextInt();
		 	}
		 System.out.println("define the second array size : ");
		 int n2=in.nextInt();
		 
		 int arr2[] = new int [n2];
		 
		 for(int j=0; j<arr2.length;j++) {
			 System.out.println("enter values(arr2) : ");
			 arr2[j]=in.nextInt();
		 } 
		 
		 int arr3[] = new int[n1+n2]; 
		for(int i = 0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for(int i=0,j=arr1.length; i<arr2.length; i++,j++) {
			arr3[j] = arr2[i]; 
		}
		
		for(int x:arr3) {
			System.out.print(" "+x);
		}
	}}



