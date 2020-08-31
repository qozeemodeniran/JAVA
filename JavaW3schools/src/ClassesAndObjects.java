//Creating a java class with a variable x of type integer...
public class ClassesAndObjects {
	int x = 5;
	public static void main(String args[]){
		//Creating an object myObject and printing the value of variable x...
		ClassesAndObjects myObject = new ClassesAndObjects();
		ClassesAndObjects myObject2 = new ClassesAndObjects();
		System.out.println(myObject.x);
		System.out.println(myObject2.x);
	}
}
