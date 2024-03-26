package java8;

import java.util.ArrayList;

public class FirstFeature {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
		al.add(241313);
		al.add("uday kiran");
		al.add('A');
		al.add(854);
		
		al.forEach(lambdaExpression->System.out.println(lambdaExpression));
	}

}
