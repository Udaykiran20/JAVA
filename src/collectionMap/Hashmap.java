package collectionMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String,Float> hm = new HashMap<String,Float>();
		
		hm.put("AUDI",40.5f);
		hm.put("BENTLY", 3.22f);
		hm.put("BENZ",20.15f);
		hm.put("THAR",10.5f);
		hm.put("MAHINDRA",25.5f);
		hm.put("VOLKSWAGEN",30.5f);
		
		System.out.println(hm);
		System.out.println("-------");
		
		Set obj = hm.entrySet();
		
		Iterator<?> i = obj.iterator();//using iterator in maps
		while(i.hasNext())
			System.out.println(i.next());

	}

}
