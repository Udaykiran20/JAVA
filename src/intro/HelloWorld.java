package intro;

public class HelloWorld {
	
	public int number() {
		int number=34;
		System.out.println(number);
		return number;
	}

	public static void main(String[] arry) {
		
		System.out.println("hello world");
		
		HelloWorld obj= new HelloWorld();
		
		obj.number();	} 

}
