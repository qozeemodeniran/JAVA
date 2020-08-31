package Modifiers;

public class Final 
{
	final String name = "Qozeem Odeniran";
	final String gender = "Male";
	
	public static void main(String args[])
	{
		Final person = new Final();
//		person.name = "Simbiat Adebowale-Oke";
//		person.gender = "female";
		
		System.out.println(person.name);
		System.out.println(person.gender);
	}
}
