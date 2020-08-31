package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String args[]) {
		
		try {
			File myfile = new File("C:\\xampp\\htdocs\\QOZEEM\\LEARNING\\ANDROID_DEVELOPMENT\\JAVA\\JavaW3schools\\info.txt");
			
			Scanner scan = new Scanner(myfile);
			while(scan.hasNextLine()) {
				String info = scan.nextLine();
				
				System.out.println(info);
			}
			scan.close();
		} 
		
		catch (FileNotFoundException e) {
			System.out.println("Erro occured");
			e.printStackTrace();
		}
	}
}
