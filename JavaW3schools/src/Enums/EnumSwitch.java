package Enums;

public class EnumSwitch {
	public static void main(String args[]) {
		Level myVar =Level.HIGH;
		
		switch(myVar) {
		case LOW:
			System.out.println("Low level");
			break;
			
		case MEDIUM:
			System.out.println("Medium Level");
			break;
			
		case HIGH:
			System.out.println("High Level");
			break;
			
		default:
			System.out.println("No level selected");
		}
		
	}
}
