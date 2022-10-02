package Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistDemo {

	public static void main(String[] args) {
		List<Integer> obj = new LinkedList<Integer>();
		for(int i = 0; i<10; i++) {
			obj.add(i);
		}
		System.out.println(obj);

	}

}
