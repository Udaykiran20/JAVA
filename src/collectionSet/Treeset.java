package collectionSet;
import java.util.TreeSet;
public class Treeset {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(9);
		ts.add(5);
		ts.add(0);
		ts.add(3);
		ts.add(1);
		ts.add(3);
		System.out.println(ts);  //it does not allowing the duplicates
								// following the ascending order
		
		System.out.println("first method_________"+ts.first());
		System.out.println("last method__________"+ts.last());
		System.out.println("lower method_____9___"+ts.lower(9));
		System.out.println("celing method____5___"+ts.ceiling(5));
		System.out.println("floor method_____3___"+ts.floor(3));
		System.out.println("higher method____9___"+ts.higher(9));
		System.out.println("pool first method____"+ts.pollFirst());
		System.out.println("pool last method_____"+ts.pollLast());
		System.out.println("head set_____________"+ts.headSet(9, false));
		System.out.println("subset method___1__3_"+ts.subSet(1, 3));
		System.out.println(ts);
	}

}
