import java.util.Scanner;
/*
 This program performs a
 check on user's input,
 check if the input
 is less than or greater than
 ten, then print some statements
 afterwards.
 */
public class day02 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		
		int number = scan.nextInt();
		
		if(number > 10)
		{
			System.out.println("NUmber is greater than 10.");
		}
		else if(number == 10)
		{
			System.out.println("Number is equal to 10");
		}
		else
		{
			System.out.println("Number is less than 10");
		}
	}
}
