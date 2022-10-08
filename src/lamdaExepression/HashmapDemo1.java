package lamdaExepression;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> obj = new HashMap<Integer,String>();
		
		obj.put(500, "fortuner");
		obj.put(350, "brezaa");
		obj.put(250, "mustag");
		obj.put(200, "swift");
		obj.put(250, "indica");
		obj.put(200, "innova");
		obj.put(440, "duster");
		
		System.out.println();
		
		System.out.println(obj);
		System.out.println();
		System.out.println("with for each method");
		System.out.println();
		//System.out.println("after the lamda expression");
		//obj.forEach((key,value)->System.out.println(key+" "+value)); //using lambda expression
		
		for(Map.Entry<Integer, String> me : obj.entrySet()) {
			System.out.println(me.getKey()+" "+ me.getValue());		//working in maps only 
		}
	}

}
