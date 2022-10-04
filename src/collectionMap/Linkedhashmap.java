package collectionMap;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Linkedhashmap {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		hm.put(306, "eicher");
		hm.put(308, "ashokleyland");
		hm.put(309, "tata");
		hm.put(314, "bharathbenz");
		System.out.println(hm);
		Object j = hm.clone();
		System.out.println(j);
		System.out.println("does 333 key is contains : "+hm.containsKey(333));
		hm.replace(308, "ashokleyland");
		System.out.println("replacing the item "+hm);
		System.out.println(hm.get(306));
		hm.remove(306);
		System.out.println(hm);

	}

}
