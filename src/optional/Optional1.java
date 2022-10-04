package optional;

import java.util.Optional;

public class Optional1 {
	public static void main(String[] args) {
		String[] str = new String[7];
		str[0] = "nc,mcddkmcks";
		str[5] = "udaykiran";
		for(int i = 0;i<str.length;i++) {
		
		Optional<String>  opt= Optional.ofNullable(str[i]); // type of exception handling
		
		if(opt.isPresent()) {
		System.out.println("index ["+i+"]= length :"+str[i].length());
		}
		else {
			System.out.println("index ["+i+"]="+" String is Null");
		}
		
		}
		System.out.println();
		System.out.println("After Optional.ofNullable");

	}
	

}
