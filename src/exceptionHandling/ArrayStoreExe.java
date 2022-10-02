package exceptionHandling;

public class ArrayStoreExe {

	public static void main(String[] args) {
		
		Object [] u = new Integer[4];
		
		try {
			
			u[0]=1;
			System.out.println(u[0]);
			u[1]=2;
			System.out.println(u[1]);
			u[2]=3;
			System.out.println(u[2]);
			u[3]="uday";
			System.out.println(u[3]);
			u[4]=5;
			System.out.println(u[4]);
		}
		catch(ArrayStoreException ase) {
			
			ase.printStackTrace();
			System.out.println();
			System.out.println("ArrayStoreException");
			}
		finally {
			System.out.println("from the finally after the exception handling");
		}
	}

}
