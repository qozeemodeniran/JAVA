package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Numbers {
	public static void main(String args[]) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(2);
		numbers.add(10);
		numbers.add(7);
		numbers.add(4);
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			if(i < 3) {
				it.remove();
			}
		}
		System.out.println(numbers);
		
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			if(numbers.contains(i)) {
				System.out.println(i + " was found in "+ numbers);
			}else {
				System.out.println(i + " was not found in "+ numbers);
			}
		}
	}

}
