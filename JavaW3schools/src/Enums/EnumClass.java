package Enums;

public class EnumClass {
	enum Level {
		FRESHER,
		PENULTIMATE,
		FINALIST
	}
	
	public static void main(String args[]) {
		Level myLev = Level.FINALIST;
		
		System.out.println("I am a " + myLev);
	}
}
