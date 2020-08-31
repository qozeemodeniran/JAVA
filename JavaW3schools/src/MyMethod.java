//Crating and calling methods...
public class MyMethod {
	
	//This is myDetails method...
	//I want the method to help me 
	//output my details.
	//Let's go...
	static void myDetails(){
		System.out.println("Name : "+"Qozeem Odeniran.");
		System.out.println("Job : "+"Java Developer.");
		System.out.println("Fun-fact : "+"I can eat for Africa, yet I'm not fat! hahaha.");
	}
	//Creating methods with parameters...
	static void methodWithParam(String firstName){
		System.out.println(firstName + " Odeniran");
	}
	//Creating method with multiple parameters...
	static void methodWithMultiParam(String firstname, String lastname, String department, int level){
		System.out.println(firstname +" "+ lastname + " is in the department " + department + 
				" and currently in level " + level);
	}
	//Creating method that uses return type...
	static int usedDaysOnEarth(int age){
		int days = 365;
		return age * days;
	}
	//Creating method that uses if-else statement...
	static void checkAge(int age){
		if(age < 18){
			System.out.println("You are underage to attend a club party.");
		}else{
			System.out.println("You are good to go.");
		}
	}
	//Method overloading - methods having the same name but different parameters
	static int intPlusMethod(int x, int y){ //integer method..
		int sumInt = x + y;
		return sumInt;
	}
	static float  floatPlusMethod(float x, float y){ //float method
		float sumFloat = x + y;
		return sumFloat;
	}
	static double doublePlusMethod(double sumInt, double sumFloat){
		double sumDouble = sumInt + sumFloat;
		return sumDouble;
	}
	
	
	//This is main method...
	public static void main(String[] args)
	{
		//Now, I'd call the myDetails method here...
		myDetails();
		System.out.println();
		//Calling this method with a parameter
		//will make it possible to attach various
		//firstName(s) to Odeniran.
		methodWithParam("Ahmed");
		methodWithParam("Azeezat");
		methodWithParam("Azeez");
		methodWithParam("Qozeem");
		System.out.println();
		//Calling method with multiple parameters...
		methodWithMultiParam("Qozeem", "Odeniran", "Computer Science", 400);
		methodWithMultiParam("Toyosi", "Afiolabi", "Mass Communication", 400);
		System.out.println();
		System.out.println("You have used " + usedDaysOnEarth(26)+ " days on planet earth.");
		System.out.println();
		checkAge(12);
		System.out.println();
		System.out.println(intPlusMethod(2, 3));
		System.out.println(floatPlusMethod(2, 3));
		System.out.println(doublePlusMethod(2.0, 3.0));
		System.out.println();
		//Recursion - making a function to call itself
		//example - summing all numbers from 0 - 10...
		int result = sum(10);
		System.out.println(result);
		System.out.println();
		int result2 = sum(5, 10);
		System.out.println(result2);
	}
	//Method that solves recursion...
	public static int sum(int k){
		if(k > 0){
			return k + sum(k - 1);
		}else{
			return 0;
		}
	}
	//Recursion that specifies halt condition...
	public static int sum(int start, int end){
		if(end > start){
			return end + sum(start, end - 1);
		}else{
			return end;
		}
	}
}
