package hashset;

import java.util.HashSet;

public class Stuffs {
	public static void main(String args[]) {
		HashSet<String> stuffs = new HashSet<String>();
		
		stuffs.add("fan");
		stuffs.add("clock");
		stuffs.add("book");
		stuffs.add("gadget");
		stuffs.add("book");
		
		for(String i: stuffs) {
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println(stuffs.contains("food")); // false
		System.out.println();
		
		System.out.println(stuffs.size());
		System.out.println();
		
		System.out.println(stuffs);
	}
}
