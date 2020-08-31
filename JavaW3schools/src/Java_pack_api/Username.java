package Java_pack_api;

//  import a class from a package
import java.util.Scanner;

public class Username {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		
		String name = scan.nextLine();
		System.out.println(name + ", You are welcome!");
	}

}
