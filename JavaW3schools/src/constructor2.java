//Constructor with parameters...
public class constructor2 {
	String name;
	int age;
	
	public constructor2(String fname, int years){
		name = fname;
		age = years;
	}
	
	public static void main(String args[]){
		constructor2 details = new constructor2("Qozeem Odeniran", 26);
		
		System.out.println(details.name + " is " + details.age + " years old.");
	}
}
