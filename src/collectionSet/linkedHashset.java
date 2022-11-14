package collectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashset {

	public static void main(String[] args) {
		
		//HashSet<Integer> lh = new HashSet<Integer>();
		
		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
		
		lh.add(1);
		lh.add(2);
		lh.add(3);
		lh.add(4);
		lh.add(5);
		
		LinkedHashSet<Integer> obj= new LinkedHashSet<Integer>();
		
		
		obj.add(6);
		obj.add(23);
		obj.addAll(lh);
		System.out.println("before iteration "+obj); 
		
		
		Iterator<Integer> li = lh.iterator();
		while(li.hasNext())
			System.out.println(li.next());
		

	}

}
