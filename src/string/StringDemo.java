package string;
import java.util.Locale;

public class StringDemo {

	public static void main(java.lang.String[] args) {
		
		String u = "uday";
		String d = u.concat("kiran");	//combineing or mergeing the previous value
		String a = " jamili";
		System.out.println(u);
		System.out.println(d);
		System.out.println(a.contentEquals(" jamili")+"--equals method"); //returns true when the word is there in the referenced object
		System.out.println(u.equalsIgnoreCase("UdAy"));
		System.out.println(u.charAt(1));//prints the indexed character in the word
		System.out.println(u.concat(a));
		System.out.println(u.contains("a"));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		String y = "hello world";
		
		System.out.println(y.substring(2)+"___substring"); //for removing the values
		System.out.println(y.substring(1, 9));
		
		StringBuffer sb = new StringBuffer("uday kiran");
		sb.reverse();
		//sb.append(" jamili");
		System.out.println(sb);

		StringBuilder ss= new StringBuilder("hello "+" world");
		System.out.println(ss.reverse());
		
		
		int l,i;
		
		String val = "dell";
		String val2="";
		l=val.length();
		for( i =l-1; i>=0;i--) {
			val2= val2+val.charAt(i);
		}
		System.out.println(val2+" by using variables");
		
	}

}
