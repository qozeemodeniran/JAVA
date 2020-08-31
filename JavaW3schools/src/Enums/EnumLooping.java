package Enums;

public class EnumLooping {
	enum gender {
		MALE,
		FEMALE
	}
	
	public static void main(String args[]) {
		for(gender sex : gender.values()) {
			System.out.println(sex);
		}
	}
}
