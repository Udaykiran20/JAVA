package wrapers;

public class WraperDemo {
	int num;
	int grade;
	void method(int num) {
		System.out.println("num = "+num);
	}
	void method(char grade) {
		System.out.println("Grade = "+grade);
	}
	public static void main(String[] args) {
		WraperDemo obj = new WraperDemo();
		//object vlaue ----
		
		Integer num = 15;
		//initializing the object through reference variable
		obj.num = 16;
		obj.method(num);
		obj.method(obj.num);
		
		//unboxing
		Character grade = 'A';
		char g = grade;
		obj.method(g);
		
		
	}

}
