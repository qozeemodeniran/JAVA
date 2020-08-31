package UserInput;

import java.util.Scanner;
public class MyInfo {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name, age and salary expectation.");
		
		System.out.print("Name: ");
		String name = scan.nextLine();
		
		System.out.print("Age: ");
		int age = scan.nextInt();
		
		System.out.print("Expected Salary: ");
		double salary = scan.nextDouble();
		
		System.out.println("Dear "+ name +", \nYour new salary will now be "+salary +
				" as your are "+age +" years old.");
	}
}
