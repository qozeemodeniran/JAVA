package files;


import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String args[]) {
		
		 try {  
		      FileWriter myWriter = new FileWriter("C:\\xampp\\htdocs\\QOZEEM\\LEARNING\\ANDROID_DEVELOPMENT\\JAVA\\JavaW3schools\\info.txt");
		      myWriter.write("This file was created by Qozeem Odeniran");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } 
	}
}
