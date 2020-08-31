import java.util.Scanner;
public class IfStatement {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = scan.nextInt();
		
		if(number >= 10)
		{
			System.out.println("Number is greater= than or equals to ten!");
		}else
		{
			System.out.println("Number is less than 10");
		}
	}

}
