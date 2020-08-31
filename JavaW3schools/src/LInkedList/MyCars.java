package LInkedList;

import java.util.LinkedList;

public class MyCars {
	public static void main(String args[]) {
		LinkedList<String> cars = new LinkedList<String>();
		
		cars.add("Mercedes Benz");
		cars.add("BMW");
		cars.add("Toyota");
		
		cars.addFirst("Sport cars");
		System.out.println(cars);
	}
}
