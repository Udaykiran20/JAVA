package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TheDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		
		li.add(2);
		li.add(-5);
		li.add(4);
		li.add(0);
		li.add(-9);
		li.add(-3);
		li.add(-4);
		li.add(7);
		li.add(8);
		li.add(1);
		System.out.println(li);
		
		//filter takes functional interface of predicate and takes input and works as boolean expression.
		System.out.println("---with filter method---");
	List<Integer> obj =	li.stream().filter(x->x<0).collect(Collectors.toList());
		System.out.println(" the negative numbers are :"+obj); 	// for printing we need to declare the list object again -:).
		
		//to add some value and get return the updated values we use map and it takes the function interface
		//it is used to transforming the data
		System.out.println("---with map method---"); 
		List<Integer> obj1 = li.stream().map(v->(v+2)).collect(Collectors.toList());
			System.out.println(obj1);
			obj1=li.stream().filter(v->v>0).collect(Collectors.toList());
			obj1.forEach(y->System.out.println(y));
		
		System.out.println("---with sorted method---"); //displays the o/p object as smaller values to higher values:)
		List<Integer> obj2= li.stream().sorted().collect(Collectors.toList());	
		//obj2.forEach(x->System.out.println(x));
		System.out.println(obj2);
		
		System.out.println("---with count method---"); //counts all the values in the list or values in the o/p object
		long obj3 = li.stream().filter(i-> i<=8).count();
		System.out.println(obj3);
		
		System.out.println("---with reduce method---");//used to aggregating the data i.e combines elements of stream & produces single value
		
	}

}
