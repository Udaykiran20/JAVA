package The_logics_for;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		int f = arr[0];
		int s = arr[1];
		System.out.println("enter");
		for(int i =  0; i<arr.length;i++) {
			arr[i] = in.nextInt();
		}
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>f)
				f = arr[i];
		}
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==f)
				System.out.println("the first largest number "+f);
			else if(s<arr[i]){
				s = arr[i];
			}
			
		System.out.println("the second largest number "+s);

	}

 }
}
