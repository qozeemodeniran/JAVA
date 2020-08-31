package Modifiers;

abstract class Abstract 
{
	public String name = "Qozeem Odeniran";
	public int age = 26;
	
	public abstract void study();
}

class Person extends Abstract
{
	public int grad_year = 2018;
	
	public void study()
	{
		System.out.println("Graduated with GPA 3.40");
	}
}
