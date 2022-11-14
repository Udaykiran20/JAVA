package collectionList;

//import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {

	public static void main(String[] args) {
		
		List<Integer> obj = new LinkedList<Integer>();

		obj.add(7);
		obj.add(6);
		obj.add(5);   
		obj.add(9); //it is also accepting the duplicate values
		obj.add(9);
		obj.add(9);
		obj.add(8);
		obj.add(3);
		obj.add(2);
		obj.add(7);
		
		System.out.println(obj);
		
		//for(int i:obj)
			//System.out.println(li);
		
		/*Iterator<Integer> li = obj.iterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		List<String> s = new LinkedList<String>();
		System.out.println(s);
		System.out.println(s.isEmpty()+"_______is empty method");
		
		System.out.println("contains method____5______"+obj.contains(5));
		System.out.println("index of object______9_____"+obj.indexOf(9));
		//this method ends at first matched value only.
		System.out.println(obj.lastIndexOf(7)+"_________last index method");
		*/
		
		//List<Integer> o= obj.stream().filter(x->x.get)
		

	}

}
