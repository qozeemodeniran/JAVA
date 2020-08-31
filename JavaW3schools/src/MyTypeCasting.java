//Type conversions...
public class MyTypeCasting {
	public static void main(String[] args){
		//Widening casting...
		//Widening Casting (automatically) - converting a smaller type to a larger type size
		//byte -> short -> char -> int -> long -> float -> double
		int myInt = 9;
		double myDouble = myInt;
		System.out.println(myInt + "\n" + myDouble + "\n");
		//Narrowing casting...
		//Narrowing Casting (manually) - converting a larger type to a smaller size type
		//double -> float -> long -> int -> char -> short -> byte
		double myNewDouble = 9.78;
		int myNewInt = (int)myNewDouble;
		System.out.println(myNewDouble + "\n" + myNewInt);
	}
}
