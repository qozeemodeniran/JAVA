package threads;

public class IsAlive extends Thread {
	public static int amount = 0;
	
	public static void main(String args[]) {
		IsAlive thread = new IsAlive();
		thread.start();
		
		while(thread.isAlive()) {
			System.out.println("Waiting...");
		}
		
		System.out.println("Main: " +amount);
		amount++;
		
		System.out.println("Main: " +amount);
	}
	
	public void run() {
		amount++;
	}
}
