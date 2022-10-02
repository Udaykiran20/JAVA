package inheritancE;
//single level  
import java.util.*;

class square{
	
	int a;
	Scanner obj = new Scanner(System.in);
	void input() {
		System.out.println("enter the value = ");
		a=obj.nextInt();
	}
	void sqr() {
		System.out.println("square = "+(a*a));
	}
}
class addition extends square{
	int b;
	void accept() {
	System.out.println("enter the next value to get sum = ");
	b=obj.nextInt();
}
	void add() {
		System.out.println("sum is = "+(a+b));
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		addition obj1 = new addition();
		obj1.input();
		obj1.sqr();
		obj1.accept();
		obj1.add();
	}

}
