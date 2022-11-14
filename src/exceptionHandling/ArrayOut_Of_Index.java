package exceptionHandling;
import java.util.Scanner;

public class ArrayOut_Of_Index {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int []array = {1,2,3,4,5,6,7,8,9};
		
		try {
			System.out.println("enter the index number = ");
			int x = obj.nextInt();
			System.out.println(array[x]);
			}
		catch(Exception aoi) {
			System.out.println("exception handled");
			System.out.println();
			aoi.printStackTrace();
		}
		finally {
			System.out.println();
			System.out.println("array out of index from finally block");
		}

	}

}
