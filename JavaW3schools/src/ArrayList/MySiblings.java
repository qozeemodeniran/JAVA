package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class MySiblings {
	public static void main(String args[]) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Ahmed Odeniran");
		name.add("Azeezat Odeniran");
		name.add("Azeez Odeniran");
		name.add("Qozeem Odeniran");
		name.add("Ganiyat Odeniran");
		
		Iterator<String> it = name.iterator();
		System.out.println(it.next()); // prints the first item	
		
		System.out.println();
		
		while(it.hasNext()) {
			System.out.println(it.next()); // loops through the collection
		}
		
		System.out.println();
		
		name.set(0, "Ahmed Olawale Odeniran");
		name.set(1, "Azeezat Mojisola Odeniran");
		name.set(2, "Azeez Olatunde Odeniran");
		name.set(3, "Qozeem Oluwabamiji Odeniran");
		name.set(4, "Ganiyat Opeyemi Odeniran");
		
		name.remove(4); 
		
		Collections.sort(name);
		
		for(String i: name) {
			System.out.println(i);
		}
		
//		for(int i = 0; i <= name.size(); i++) {
//			System.out.println(name.get(i));
//		}
		
//		System.out.println("The first child is "+name.get(0));
//		System.out.println("The second child is "+name.get(1));
//		System.out.println("The third child is "+name.get(2));
//		System.out.println("The fourth child is "+name.get(3));
//		System.out.println("The last child is "+name.get(4)); generates error 'cos it's been removed.
	}
}
