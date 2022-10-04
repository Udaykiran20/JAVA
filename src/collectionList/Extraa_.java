package collectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Extraa_ {

	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("enter the truck names that you know : ");
		al.add(obj.next());
		al.add(obj.next());
		//
		System.out.println("do you want to continue if yes then type yes");
		
		if(obj.next()=="yes") {
			
			
			al.add(obj.next());
			al.add(obj.next());
			al.add(obj.next());
			}
			else {
				System.out.println("names entered by you is 1"+al);
				
			}
			
		System.out.println("do you want to continue if yes then type yes");
			if(obj.next()=="yes") {
				
				al.add(obj.next());
				al.add(obj.next());
				al.add(obj.next());
				}
				else {
			System.out.println("names entered by you is 2 ");
				}
		Iterator<String> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
