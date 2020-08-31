package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Numbers {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(101);
		numbers.add(231);
		numbers.add(8458);
		
		Consumer<Integer> method = (n) -> {System.out.println(n);};
		
		numbers.forEach(method);
		
//		numbers.forEach(n -> {System.out.println(n); } );
	}
}
