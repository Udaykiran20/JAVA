package collectionMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		TreeMap<Integer,Character> tm = new TreeMap<Integer,Character>();
		tm.put(4, 'a');
		tm.put(6, 'u');
		tm.put(3, 't');
		tm.put(2, 'o');
		tm.put(5, 'm');
		tm.put(1, 'o');
		tm.put(7, 'b');
		tm.put(8, 'i');
		tm.put(1, 'l');
		tm.put(1, 'e');
		tm.put(1, 's');
		System.out.println(tm);
		Set<Entry<Integer, Character>> s = tm.entrySet();
		Iterator<Entry<Integer, Character>> i = s.iterator();
		while(i.hasNext()) {
			Entry<Integer,Character> ee = i.next();
			System.out.println(ee);
		}
	}

}
