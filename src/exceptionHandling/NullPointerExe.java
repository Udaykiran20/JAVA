package exceptionHandling;
import java.util.*;

public class NullPointerExe {

	public static void main(String[] args) {
		
		int a = 20;
		String exe = null;
		
		try 
		{
		System.out.println("inside the try block ");
		System.out.println(exe.length());
		System.out.println();
		
		}
		catch(NullPointerException np){
			np.printStackTrace();
			System.out.println();
			System.out.println("NullpointerExceptoin occured");
			
			
		}
		finally {
			System.out.println();
			System.out.println("from the finally block");
		}
		
	}

}
