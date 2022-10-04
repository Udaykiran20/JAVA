package string;
import java.util.Locale;

public class StringDemo {

	public static void main(java.lang.String[] args) {
		
		String u = "uday";
		String d = u.concat("kiran");
		String a = " jamili";
		System.out.println(u);
		System.out.println(d);
		System.out.println(u.contentEquals("uday"));
		System.out.println(u.equalsIgnoreCase("UdAy"));
		System.out.println(u.charAt(1));
		System.out.println(u.concat(a));
		System.out.println(u.contains("a"));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		String y = "hello world";
		
		System.out.println(y.substring(2)+"___substring"); //for removing the values
		System.out.println(y.substring(1, 9));
		
		StringBuffer sb = new StringBuffer("uday kiran");
		sb.append(" jamili");
		System.out.println(sb);

	}

}
