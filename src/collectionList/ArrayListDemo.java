package collectionList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Vector;
public class ArrayListDemo {

	public static void main(String[] args) {
		//it follows insertion order
		//indexing is also possible
		//allows duplicate values(in list interface )
		ArrayList<String> al = new ArrayList<String>();
		//it follows insertion order
		//initial size is 10
		//used to retrieve the records
		//methods are non-synchronized
		//allows the duplicates
		al.add("u");
		al.add("d");
		al.add("a");
		al.add("y");
		al.add("k");
		al.add("i");
		al.add("r");
		al.add("a");
		al.add("n");
		al.add("n");
		System.out.println("printing without iterator");
		System.out.println(al);
		System.out.println("printing with iterator by for loop");
		
		for(String i : al) {
			System.out.println(i);
		}
	
		LinkedList<Integer> li = new LinkedList<Integer>();
		//follows insertion order
		//allows duplicates
		//no initial size
		//used for searching element from records
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(7);
		li.add(1);
		
		System.out.println(li);
		System.out.println();
		System.out.println(li.indexOf(6)+"________index method");
		System.out.println(li.lastIndexOf(li)+" ______last index of object");
		
		Iterator<Integer> a = li.iterator();
		System.out.println("with the iteration method");
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
		Vector<Character> v = new Vector<Character>();
		//synchronized methods
		//allows duplicates
		v.add('h');
		v.add('e');
		v.add('l');
		v.add('l');
		v.add('0');
		v.add('w');
		v.add('o');
		v.add('r');
		v.add('l');
		v.add('d');
		v.add('d');
		System.out.println(v);
		System.out.println();
		System.out.println("method clone____"+v.clone());
		System.out.println("method capicity___"+v.capacity());
		System.out.println("character method__u_"+v.add('u'));
		System.out.println("contains___a_________"+v.contains('a'));
		System.out.println("remove method_______"+v.removeElement('h'));
		System.out.println(v);
		System.out.println("size method___________"+v.size());
		System.out.println("is empty method_____"+v.isEmpty());
		System.out.println("last index method ____"+v.lastIndexOf(v));
		System.out.println("remove all method ______"+v.remove(v));
		System.out.println(v);
		System.out.println();
		System.out.println("after the iteration ");
		for(Character s : v) {
			System.out.println(s);
		}
	}
}
