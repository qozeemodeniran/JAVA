package Modifiers;

public class Abstract2 
{
	public static void main(String args[])
	{
		Person person = new Person();
		
		System.out.println("Name: "+person.name);
		System.out.println("Age: "+person.age);
		System.out.println("Graduation Year: "+person.grad_year );
		
		person.study();
	}
}
