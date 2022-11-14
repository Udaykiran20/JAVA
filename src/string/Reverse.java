package string;

public class Reverse {

	public static void main(String[] args) {
		
		int l, i;
		
		String name = "uday";
		String tem = "";
		l=name.length();
		for( i =l-1; i>=0;i--) {
			tem= tem+name.charAt(i);
		}
		System.out.println(tem+" by using variables");
		
}
}
