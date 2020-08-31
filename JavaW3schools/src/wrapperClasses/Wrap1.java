package wrapperClasses;

public class Wrap1 {
	public static void main(String args[]) {
		Integer myInt = 9;
		Double myDouble = 12.52;
		Character myChar = 'Q';
		
		System.out.println(myInt.intValue());
		System.out.println(myDouble.doubleValue());
		System.out.println(myChar.charValue());
		
		System.out.println();
		
		Integer myAge = 26;
		String str = myAge.toString();
		System.out.println(str.length());
	}
}
