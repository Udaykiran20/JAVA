package collectionSet;

import java.util.HashSet;
import java.util.Iterator;

public class setDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("uday");
		hs.add("sravanth");
		hs.add("sandeep");
		hs.add("kalyan");
		hs.add("vamsi");
		hs.add("chinni");
		//System.out.println(hs);
		
		for(int i = 0; i<1;i++)
			System.out.println(hs);
				
		Iterator<String> u = hs.iterator();
		while(u.hasNext()) {
			System.out.println(u.next());
		}
		

	}

}
