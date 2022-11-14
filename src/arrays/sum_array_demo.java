package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sum_array_demo {
	static int []array = {1,2,3,4,5,6,7,8,9};
	static int sum() {
		
		int sum=0;
		for(int i = 0; i<=array.length;i++) 
			sum += array[i];
		
		
		return sum;
	}

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter the value: ");
		
		//List<Integer> ar= new ArrayList<Integer>();
		//ar.add(array)
		
		System.out.println(""+sum());
		}	

	}


