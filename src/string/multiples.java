package string;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class multiples {

	public static void main(String[] args){
		
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		int n= obj.nextInt();
		
		for(int i =1; i<=10;i++)
		 System.out.println(n+"x"+i+"="+n*i);

	}

}
