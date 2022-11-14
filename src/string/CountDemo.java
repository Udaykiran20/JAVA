package string;

import java.util.HashMap;
import java.util.Map;

public class CountDemo {

	public static void main(String[] args) {
		
		String str = "mehanical engineers power the world";
		
		String[] spli=str.split(" ");
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		for(int i=0;i<spli.length;i++) {
			if(m.containsKey(spli[i])) {
				String count;
				count =m.get(spli[i]);
				 //m.put(count+1, spli[i]);
			}
				
				
			
		}

	}

}
