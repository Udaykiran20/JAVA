package polymorphism;

import java.util.Scanner;

class Sum{
	
	void add(int a,int b) {
		System.out.println("integer sum= "+(a+b));
	}
	void add (float a,float b) {
		System.out.println("Decimal sum= "+(a+b));
	}

}
public class MethodOverLoading{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        Sum R =new Sum();
        System.out.println("Enter two numbers :");
        
        R.add(sc.nextInt(), sc.nextInt());
        R.add(sc.nextFloat(), sc.nextFloat());
        
        
      
	}

}