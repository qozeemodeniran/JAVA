package hashMaps;

import java.util.HashMap;

public class StatesAndCapitals {
	public static void main(String args[]) {
		HashMap<String, String> stateAndCap = new HashMap<String, String>();
		
		stateAndCap.put("England", "London");
		stateAndCap.put("Germany", "Berlin");
		stateAndCap.put("Norway", "Oslo");
		stateAndCap.put("USA", "Washington DC");
		
//		print keys using keyset()
		for(String i: stateAndCap.keySet()) {
			System.out.println(i);
		}
		
		System.out.println();
		
//		print values using values()
		for (String i: stateAndCap.values()) {
			System.out.println(i);
		}
		
		System.out.println();
		
//		print keys and values
		for (String i: stateAndCap.keySet()) {
			System.out.println("key: "+ i +" value: "+ stateAndCap.get(i));
		}
		
		System.out.println();
		
//		print hashmap
		System.out.println(stateAndCap);
		}
}
