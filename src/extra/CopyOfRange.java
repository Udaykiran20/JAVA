package extra;

import java.util.Arrays;

public class CopyOfRange {

	public static void main(String[] args) {
		
		int [] arry = {1,0,3,4,-45};
		
		int []arrr2= Arrays.copyOfRange(arry , 0, 5);
		
		System.out.println("the second array is "+Arrays.toString(arrr2));

	}

}
