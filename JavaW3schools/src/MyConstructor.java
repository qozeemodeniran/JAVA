
public class MyConstructor {
	int x; //Class attribute.
	
	public MyConstructor(){ //Constructor.
		x = 5; //sets initial value for class attribute x.
	}
	
	public static void main(String args[]){
		MyConstructor myObj = new MyConstructor(); //Object of class which calls the constructor...
		System.out.println(myObj.x);
	}
}
