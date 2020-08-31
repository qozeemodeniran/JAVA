package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNew {
	
	public static void main(String args[]) {
	
	try {
		File file = new File("C:\\xampp\\htdocs\\QOZEEM\\LEARNING\\ANDROID_DEVELOPMENT\\JAVA\\JavaW3schools\\details.txt");
		
		
		if(file.createNewFile()) {
			System.out.println("File Created: " + file.getName());
		} else {
			System.out.println("File exists");
		}
	}
		catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
	
