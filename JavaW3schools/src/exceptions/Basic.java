package exceptions;

public class Basic {
	public static void main(String args[]) {
		try {
			int[] numbers = {1, 2, 3};
			System.out.println(numbers[10]);
		} catch(Exception e) {
			System.out.println("Error occured!");
		} finally {
			System.out.println("The try...catch block is finished");
		}
	}
}
