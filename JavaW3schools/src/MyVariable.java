///Declaring variables, and assign value to it...
public class MyVariable {
	public static void main(String[] args){
		//Variable of type in...
		int myAge = 26;
		System.out.println("I am " + myAge + " years old.");
		//Variable of type string...
		String myName = "Qozeem Odeniran";
		System.out.println("My name is " + myName);
		//The variable myName above will be overwritten by this new variable myName...
		myName = "Qozeem Banji Odeniran";
		System.out.println("This name includes my middle name : " + myName);
		//Final variables - cannot be unchanged or overwritten...
		final String myLastName = "Qozeem";
		System.out.println("My surname is " + myLastName + "." + " This name can't be changed!");
	}
}
