package Encapsulation;

public class Person {
	private String name; //the private modifier won't let us access variable name in an outside class...
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
}
