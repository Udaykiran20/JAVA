package lamdaExepression;

import java.util.HashMap;
import java.util.Map;

public class _LinkedMap_Demo_ {

	public static void main(String[] args) {
		
	HashMap<String,String> obj = new HashMap<String,String>();
	
	obj.put("5.40lks","TIAGO");
	obj.put("7.60lks","NEXON");
	obj.put("5.93lks","PUNCH");
	obj.put("6.30lks","ALTROZ");
	obj.put("6.00lks","TIGOR");
	obj.put("15.35lks","SAFARI");
	
	for(Map.Entry<String, String> me : obj.entrySet()) {
		System.out.println(me.getValue()+"'s starting price is "+ me.getKey());		//working in maps only 
	}
 }
}
