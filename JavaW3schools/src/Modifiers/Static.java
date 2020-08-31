package Modifiers;

public class Static 
{
	static void staticMethod()
	{
		System.out.println("..can be called without creating an object.");
	}
	
	public void publicMethod()
	{
		System.out.println("...must be called by creating objects.");
	}
	
	public static void main(String args[])
	{
		staticMethod();
		
		Static Obj = new Static();
		Obj.publicMethod();
	}
}
