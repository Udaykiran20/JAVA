package The_logics_;

import java.util.Scanner;

public class rotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the first string: ");
		String st=in.next();
		System.out.println("enter the second string: ");
		String str=in.next();
		
		String str1 = st.toUpperCase();
		String str2 = str.toUpperCase();
		
	if(isRotation(str1,str2)) {
		System.out.println("Rotation string is present ");
	}else {
		System.out.println("rotation is not found");
	}
		

	}
	public static boolean isRotation(String str1,String str2) {
		
		
		return(str1.length()==str2.length()&&((str1+str1).indexOf(str2)) !=-1);
		
	}

}
