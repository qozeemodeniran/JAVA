package threads;

public class Concurrencies extends Thread{
	
	public static int amount = 0;
	
	public static void main(String args[]) {
		Concurrencies thread = new Concurrencies();
		thread.start();
		
		System.out.println(amount);
		
		amount++;
		
		System.out.println(amount);
	}
	
	public void run() {
		amount++;
	}
}
