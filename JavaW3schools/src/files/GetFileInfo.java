package files;

import java.io.File;

public class GetFileInfo {
	public static void main(String args[]) {
		File myfile = new File("C:\\xampp\\htdocs\\QOZEEM\\LEARNING\\ANDROID_DEVELOPMENT\\JAVA\\JavaW3schools\\info.txt");
		
		if(myfile.exists()) {
			System.out.println("File name: " + myfile.getName());
			System.out.println("Absolute path: " + myfile.getAbsolutePath());
			System.out.println("Writable: " + myfile.canWrite());
			System.out.println("Readable: " + myfile.canRead());
			System.out.println("Size in bytes: " + myfile.length());
		}
	}
}
