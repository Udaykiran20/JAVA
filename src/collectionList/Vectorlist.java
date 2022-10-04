package collectionList;

import java.util.Iterator;
import java.util.Vector;


public class Vectorlist {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		v.add("uday");
		v.add("kiran");
		v.add("sandeep");
		v.add("pavan");
		v.add("durga");
		v.add("rambo");
		v.add("roshan");
		v.add("haran");
		v.add("thottipampu");
		v.add("bendapudi");
		
		System.out.println(v);
		
		Iterator<String> sobj = v.iterator();
		
		while(sobj.hasNext()) {
			System.out.println(sobj.next());
		}

	}

}
