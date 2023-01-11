package string;

public class Exam {
	public String theEnd(String str, boolean front) {
		str="Hello";
		if(str.equals("Hello")&&front==false)
		System.out.println(str.charAt(0));
		else if(str.equals("Hello")&&front==true)
		System.out.println(str.charAt(4));
		else if(str.equals("Oh")&&front==true) {
		str="Oh";
		System.out.println(str.charAt(0));
		}
		return str;
	}

	public static void main(String[] args) {
		
		Exam obj = new Exam();
		obj.theEnd("Hello", false);
	}

}
