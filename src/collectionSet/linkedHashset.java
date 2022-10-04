package collectionSet;

import java.util.Iterator;
import java.util.LinkedHashSet;



public class linkedHashset {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		
		lh.add(1);
		lh.add(2);
		lh.add(3);
		lh.add(4);
		lh.add(5);
		
		Iterator<Integer> li = lh.iterator();
		while(li.hasNext())
			System.out.println(li.next());
		

	}

}
