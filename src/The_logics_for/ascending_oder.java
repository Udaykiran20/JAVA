package The_logics_for;

import java.util.Scanner;

public class ascending_oder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int arr[] = new int[6];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter num : ");
			arr[i]=in.nextInt();
		}
		int tem=0;
		for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]>arr[j]) { 				// change the symbol for descending order
					 tem=arr[i];
					 arr[i]=arr[j];
					 arr[j]=tem;
				 }
			 }
			
		} 
		for(int x : arr) {
				 System.out.println(x);
		}

	}

}
