package variables;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public	class SportTheme {
	
	SportTheme(List<String> li){
		int sum = 1;
		for(int i = 0; i<li.size(); i++) {
			System.out.println(sum+" = "+li.get(i));
			sum++;
		}		
	}
	SportTheme(LinkedList<String> outdoor_games){
		int sum = 1;
		for(int i = 0; i<outdoor_games.size(); i++) {
			System.out.println(sum+" = "+outdoor_games.get(i));
			sum++;
	}
}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> li = new ArrayList<String>();
		System.out.println("enter the indoor games:");
		for(int i = 0; i<=4; i++) {
			li.add(input.next());
		}
		SportTheme obj = new SportTheme(li);
		li = new LinkedList<String>();
		System.out.println("enter the outdoor games");		
		for(int i = 0; i<=4; i++) {
			li.add(input.next());
		}
		SportTheme obj2 = new SportTheme(li);
		
		

	}

}
